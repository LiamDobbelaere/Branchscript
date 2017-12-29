grammar Branchscript;
script: conversation+;

conversation: conversationHeader conversationBody;

conversationPerson: ID;
conversationId: ID;
triggerId: ID;
conversationHeader: OPEN_HEADER conversationPerson HEADER_SEPARATOR conversationId CLOSE_HEADER setFlags?;

conversationBody: conversationFragment+;

conversationFragment
: fragmentDialogue
| fragmentTrigger
| conversationLink
;

conversationLink: OPEN_LINK conversationId linkCondition?;

linkCondition
: ifCondition
| ifAndCondition
| ifOrCondition
;

ifCondition: IF_KEYWORD flagCondition;
ifAndCondition: IF_AND_KEYWORD conditionCollection;
ifOrCondition: IF_OR_KEYWORD conditionCollection;

conditionCollection: OPEN_COLLECTION flagCondition (COLLECTION_DELIMITER flagCondition)* CLOSE_COLLECTION;

flagCondition
: conditionTrue
| conditionEqual
| conditionGreater
| conditionLess
;

conditionTrue: ID;
conditionEqual: ID EQUAL value;
conditionGreater: ID GREATER value;
conditionLess: ID LESS value;

fragmentDialogue: STRING setFlags? fragmentAnswer*;
fragmentAnswer: OPEN_ANSWER STRING setFlags?;

fragmentTrigger: TRIGGER_KEYWORD triggerId (OPTIONS_KEYWORD triggerOptionsCollection)?;
triggerOptionsCollection: OPEN_COLLECTION STRING (COLLECTION_DELIMITER STRING)* CLOSE_COLLECTION;

setFlags: SETFLAGS_KEYWORD flagAssignmentCollection;
flagAssignmentCollection: OPEN_COLLECTION flagAssignment (COLLECTION_DELIMITER flagAssignment)* CLOSE_COLLECTION;

flagAssignment
: assignmentTrue
| assignmentAssign
| assignmentIncrement
| assignmentDecrement
;

assignmentTrue: ID;
assignmentAssign: ID ASSIGN value;
assignmentIncrement: ID INCREMENT;
assignmentDecrement: ID DECREMENT;

value: boolValue | intValue;
boolValue: BOOL_TRUE | BOOL_FALSE;
intValue: NUMBER;

OPEN_HEADER: '[';
CLOSE_HEADER: ']';
HEADER_SEPARATOR: '/';
OPEN_ANSWER: '-';
OPEN_LINK: '->';

OPEN_COLLECTION: '(';
CLOSE_COLLECTION: ')';
COLLECTION_DELIMITER: ',';

BOOL_TRUE: 'true';
BOOL_FALSE: 'false';

INCREMENT: '++';
DECREMENT: '--';
ASSIGN: '=';
EQUAL: '==';
GREATER: '>';
LESS: '<';

TRIGGER_KEYWORD: 'TRIGGER';
OPTIONS_KEYWORD: 'OPTIONS';
SETFLAGS_KEYWORD: 'SET';
IF_KEYWORD: 'IF';
IF_AND_KEYWORD: 'IF_AND';
IF_OR_KEYWORD: 'IF_OR';

ID: [a-zA-Z_]+;
NUMBER: DIGIT+;
fragment DIGIT: [0-9];
STRING: '"' ( '\\' [\\"] | ~[\\"\r\n] )* '"';
WS: [ \t\r\n]+ -> skip;