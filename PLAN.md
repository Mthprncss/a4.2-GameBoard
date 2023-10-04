# PLAN.md Module 4 Week 2 - GameBoard

## What are the tasks?
Phase 1:
1. get user input
2. output checkerboard pattern of x and o

Phase 2: 
1. read current GameBoardGUI.java
2. get user input
3. output checkerboard with red and black


## How can those tasks be broken into smaller steps?
1-1:
- import scanner
- print user insturctions/prompt
- read user input
1-2:
- set counters for rows and columns
- determine each space for x and o
- print out gameboard


2-1:
- what variables are already in the document

numRows
rows
numCols
cols
width
height
boxWidth
boxHeight





2-2:
- import scanner
- print user insturctions/prompt
- read user input
2-3:
- import graphics
- determine size of each square
- set counters for rows and columns
- determine each space for x and o
- print out gameboard

## Testing Plan
1-1: 
- check print out 
- create extra print for reader
1-2:
- check for one row
- check whole board

2-2:
- check print out 
- create extra print to check input
2-3:
- check for one row
- check whole board

## Requirements Check

Phase 1: In a driver class called GameBoardConsole.java do the following

    Get the game board dimensions from the user
    Use a while loop to print the first row of the game board with alternating "x"s and "o"s to the console.
    Use nested while loops to print the rest of the board
    HINT: the character should be an "x" if the row and column number are both even or both odd. The character should be "o" if one is even and one is odd.

Phase 2: In a driver class called GameBoardGUI.java do the following

    Draw a single column of the red and black game board using a for loop Game Board One Col
    Use a nested for loop to extend to a full game board. Make sure to use the numCols variable in your inner for-loop condition. HINT: Squares should be red if the row number and column number are both even or both odd. Squares should be black if one is even and one is odd







At least 4 @keyterm user input, using nested for loops, using nested while loops, using the modulo operator.


## Reflection
At the end of PLAN.md write a one paragraph reflection describing your experience with this activity. What went well? What was challenging? How could you improve your plan prior to beginning to code? 

Phase 1 Relfection
The activity went well after the lecture and the discussion of even and odd hint. I think my plan went well for this part, but I didn't test as frequenly as I initally planned. I also forgot to include the closing of the scanner in my plan. 

I reviewed Kate's code. Ours were fairly similar, although she had a more complicated boolean statement and a more direct user input. Looking at her code reminded me that I need to close my scanner. 
