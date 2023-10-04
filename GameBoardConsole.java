import java.util.Scanner;



/**
 * Prints alternating pattern of x's and o's to the console to form
 * a checkerboard pattern for a game board.
 * 
 * @author CS121 Instructors
 * @author Caroline Castel 114256972
 * @date Fall 2023
 */

public class GameBoardConsole {
    public static void main(String[] args) {

        int numRows = 0; //@keyterm Initial Conditions
        int numCols = 0;
        Scanner userInput = new Scanner(System.in);
        
        /* TODO: Prompt user for dimensions */

        System.out.println("Would you like to create a checker game board? (y/n)");
        String userAnswer1 = userInput.next(); //used to verify the user wants to use the program //@keyterm user input

        if (userAnswer1.equals("y"))
        {
            String userAnswer2 = "n"; //used to verify user inputed it correctly
            while (userAnswer2.equals("n")) //@keyterm Terminating Conditions
            {
                System.out.println("Please enter the number of columns you would like on your game board:");
                numCols = userInput.nextInt();
                System.out.println("Please enter the number of rows you would like on your game board:");
                numRows = userInput.nextInt();
                System.out.println("You would like a game board with " + numCols + " columns and " + numRows + " rows.");
                System.out.println("Is this correct? (y/n)");
                userAnswer2 = userInput.next();
            }
        }
        else 
        {
            System.out.println("Goodbye."); 
        }
        int i = 0; // the row number for each element in the matrix
        int j = 0; // the column number for each element in the matrix
        while (numRows > i) //@keyterm while Loop
        {
            while (numCols > j) // each elements position (i,j) //@keyterm nested while loops
            {
                if ((i + j)% 2 == 0) //@keyterm modulo operator
                {
                    System.out.print("x");
                }
                else
                {
                    System.out.print("o");
                }

                j++;
            }
            
            System.out.println();
            j = 0;
            i++;

        }
        userInput.close();
        System.out.println();
        System.out.println("Goodbye.");

        


        /*
         * Use a while loop to print the first row of the game board  e.g. for an 3x3 board, the first row will be "xox"
         * 
         * After that is successful, nest while loops to print the rest of the board. An entire 3x3 board will look like this:
         * xox
		 * oxo
		 * xox
         *
         */




    }
}


//@keyterm user input
//@keyterm nested for loops
//@keyterm nested while loops
//@keyterm modulo operator

//@keyterm Initial Conditions
//@keyterm Terminating Conditions
//@keyterm while Loop
//@keyterm Tracing Initial Conditions
//@keyterm Terminating Conditions
//@keyterm for Loop
//@keyterm while Loop
//@keyterm Tracing
