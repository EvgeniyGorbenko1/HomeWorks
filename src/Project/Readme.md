Basic final task
Task description
Create a program to perform a money transfer from one account to another.
The program must first contain a file with account numbers and amounts
on them. When launched, the program must wait for information to be entered from the console.
When selecting the parsing function, the program must parse all suitable files from the
‘input’ directory and move the parsed files to another ‘archive’ directory.
As a result of file parsing, the program must generate/update a report file and
update the information in the file with account numbers and amounts to the current ones.
Technical implementation details
When launched, the program waits for information to be entered:
1 entered into the console - call for the operation of parsing transfer files from input,
2 entered into the console - call for the operation of outputting a list of all transfers from the report file.
The program must process txt files.
If the directory contains files of a different format, the program must skip them and
not process them. Input data
Input file format: txt.
Files must contain the following fields:
● account number from (10 digits ХХХХХ-ХХХХХ);
● account number to (10 digits ХХХХХ-ХХХХХ);
● amount to transfer (integer numbers only).
