package Challenge;
import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scanner = new Scanner( System.in);
			Soduku game = new Soduku("problem.txt", "solution.txt");
			boolean end = false;
			while (!end) {
				game.printBoard();
				
			int row, col;
			boolean prompt = false;
			do
			{
				if (prompt == true) {
					System.out.println("Cell already filled, please try again!");
				}
				System.out.println("Please enter the row value: ");
				
				row = scanner.nextInt();
				
				System.out.println("Please enter the column value: ");

				col = scanner.nextInt();
				
				prompt = true;
				
			} while (game.isBlankValue(row, col) == false);
			
			System.out.println(" Please enter the value to enter: ");

			int val = scanner.nextInt();
			boolean inputWorks = game.isValidAnswer(row, col, val);
	
	
			if (inputWorks == true)
			{	game.insertValue(row, col, val);
				System.out.println(" Your guess was correct ");
		
			}
			else
			{ 
				System.out.println(" Your guess was incorrect");
			}

			end = game.isSolved();
		}
		 game.printBoard();
		 System.out.println(" You've beat the game");
	}

}
