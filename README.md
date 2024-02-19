# Code Testing CandyCrushLetter
## Stage 1
For a given string that only contains alphabet characters a-z, if 3 or more consecutive characters are identical, remove them from the string. Repeat this process until there is no more than 3 identical characters sitting besides each other.

## Stage 2 - advanced requirement
Instead of removing the consecutively identical characters, replace them with a single character that comes before it alphabetically.

## solution
Use the Template design pattern to resolve it 
1. Stage 1 requirements is delete the consecutive characters
  Use **RemoveTripleCharacter** 
2. Stage 2 requirements is replace the consecutive characters
  Use **ReplaceTripleCharacter**

