# Branchscript

This is the repository where Branchscript lives.
There's an editor as well that's still in an early stage. 

I've yet to make classes that compile a Branchscript file into a timeline that you can step through step by step.
These classes would allow you to use Branchscript in Java.

You could generate your own parser now in another language using Antlr4 and the grammar file in `/src/main/resources/Branchscript.g4`

## Editor controls

F2 - When inside the ID portion of a link, jumps to that conversation if there is one with that name

F1 - Jumps back one step if you've used F2 to follow a link

## Branchscript format

A script starts with one or more conversations.

A conversation has a header and a body, the header is indicated with square brackets.
Inside the header, the name of the entity in the conversation and the conversation id are separated by a slash. Here's an example of a conversation header: `[Jimmy/jimmy_intro]`

The conversation header is followed by the conversation body. The body can have any number of conversation fragments.

These fragments can be dialogue (with optional choices), a TRIGGER or a link `->`

Example of dialogue is: `"hello"`  
Example of dialogue with choices is:
```
"hello"
- "Hi there"
- "What's up?"
```

Dialogue fragments may use `SET` after the string to set certain values.
Here's an example:  
```
"Do you want a drink?"
- "Yes" SET(want_drink)
- "No"
```

Flags are assumed false or zero by default.  
`SET(flagname)` is a shorthand to set a flag to true.  
You may also set it to a number like `SET(this=5)` and specify multiple flags like `SET(first_flag=true, second_flag++)`

Triggers are special actions your application can execute, here's an example of a trigger:  
`TRIGGER goto_level OPTIONS("level_0")`

Links are what connect conversations together using conversation ids, anything past a followed link is not executed. However, if a link does not satisfy conditions, the link is skipped and the conversation does continue.  
`-> ahoy_mate`

Links can have a condition using `IF` or `IF_AND` or `IF_OR`. This condition is based on flags set earlier using `SET`. Here are some examples:  
`-> ahoy_mate IF becomes_pirate`  
`-> ahoy_mate IF_AND(becomes_pirate, has_eyepatch)`  
`-> ahoy_mate IF_OR(becomes_pirate, has_eyepatch)`

Your conditions can also compare numbers like `IF becomes_pirate>5` or `IF_AND(arms>2,legs==2,human)`

### Example
Here's an example of a complete Branchscript using various functions.

```
[Pirate/pirate_intro]
"Ahoy matey! You want to control the ship?"
- "Yeah!" SET(control_ship)
- "Not really.."
-> walk_plank IF control_ship==false
-> welcome_aboard  
  
[Pirate/walk_plank]
"Time for you to walk the plank!"
TRIGGER game_over OPTIONS("You walked the plank")  
  
[Pirate/welcome_aboard]
"Welcome aboard matey!"
"You want anything to drink?"
- "Yes, I'll take one" SET(drinks=1)
- "Yes, I'll take three" SET(drinks=3)
- "Yes, I'll take five" SET(drinks=5)
- "No, thanks"
-> self_drunk IF drinks>5  
  
[Self/self_drunk]
"Whoa, I'm really drunk"
```
