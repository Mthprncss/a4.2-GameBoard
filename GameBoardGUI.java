import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import java.util.Scanner;

/**
 * Module 4 Week 2 - Game Board
 * Draws a game board with alternating black and red squares
 * 
 * @author CS121 Instructors
 * @version Fall 2023 
 * @author Caorline Castel 114256972
 * @date Fall 2023  
 */

@SuppressWarnings("serial")
public class GameBoardGUI extends JPanel
{
	private static int numRows;
	private static int numCols;

	/**
	 * Sets the initial dimensions of the panel based on the passed information for rows and columns. 
         * @param rows the number of rows
	 	 * @param cols the number of columns
	 */
	public GameBoardGUI(int rows, int cols)
	{
		// You will prompt for these sizes in main()
		numRows = rows;
		numCols = cols;
		setPreferredSize(new Dimension(500, 500));
	}

	/**
	 *  Draws the game board.
	 *  @param page Graphics context
	 */
	public void paintComponent(Graphics page)
	{
		int width = getWidth();
		int height = getHeight();

		int boxWidth = (int) Math.ceil((double) width/numCols);
		int boxHeight = (int) Math.ceil((double) height/numRows);

		page.setColor(Color.RED);
		page.fillRect(0, 0, boxWidth, boxHeight);

		// TODO: Add your code here to draw the GUI board

		
		int i; // the row number for each square in the matrix
        int j; // the column number for each square in the matrix

		int maxNumSquares = Math.max(numRows, numCols); //for some reason the board would only fill up with the smallest number so to adjust for that I created a max of the two numbers

        for (i = 0; maxNumSquares > i; i++) 
        {
            for (j = 0; maxNumSquares > j; j++) // each elements position (i,j) 
            {
                if ((i + j)% 2 == 0) //red square
                {
                   	page.setColor(Color.RED);
					page.fillRect(i * boxWidth, j * boxHeight, boxWidth, boxHeight); 
                }
                else //black square
                {
                    page.setColor(Color.BLACK);
					page.fillRect(i * boxWidth, j * boxHeight, boxWidth, boxHeight); 
                }
            }
            
        }
		
                        
	}
                        


	

	/**
	 * Creates the main frame of the program.
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO: Get dimensions from user for rows and columns (variables must have these names, see code below)

		Scanner userInput = new Scanner(System.in);
        
		/* Prompt user for dimensions */

		System.out.println("Would you like to create a checker game board? (y/n)");
		String userAnswer1 = userInput.next(); //used to verify the user wants to use the program 

		if (userAnswer1.equals("y"))
		{
			
			String userAnswer2 = "n"; //used to verify user inputed it correctly
			while (userAnswer2.equals("n"))
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
		
		userInput.close();
        System.out.println();
        System.out.println("Goodbye.");
		

		JFrame frame = new JFrame("Game Board");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameBoardGUI panel = new GameBoardGUI(numRows, numCols);
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
