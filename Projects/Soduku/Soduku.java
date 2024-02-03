package Challenge;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Soduku {

private final int BLANK_VAL;
private final int DIM ;
private final String BLANK_CHAR;
private int[][] problem;
private int[][] solution;

public Soduku(String problemFile, String solutionFile) {
	this.DIM = 9;
	this.problem= new int [DIM][DIM];
	this.solution= new int [DIM][DIM];
	this.BLANK_VAL = 0;
	this.BLANK_CHAR = "*";
	this.problem = readFile(problemFile);
	this.solution = readFile(solutionFile);
	
}

	// TODO Auto-generated method stub

public boolean isBlankValue(int row, int col) {
	return this.problem[row][col] == this.BLANK_VAL;
}
public boolean isSolved() {
	for (int row = 0; row < DIM; row++) {
		for(int col =0; col < DIM; col++) {
			if (this.problem[row][col] != this.solution[row][col]) {
				return false;
			}
		}
	}
return true;
	}
public void printBoard() {
    for (int row = 0; row < DIM; row++) {
        for (int col = 0; col < DIM; col++) {
            int value = this.problem[row][col];
            String output = value == this.BLANK_VAL ? this.BLANK_CHAR : Integer.toString(value);
            System.out.print(output + " ");

}
        System.out.println();
    }}
public boolean isValidAnswer(int row, int col, int val) {
    return this.solution[row][col] == val;
}
public void insertValue(int row, int col, int val) {
    this.problem[row][col] = val;
}
private int[][] readFile(String fileName) {
    int[][] board = new int[DIM][DIM];
    
		try (BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)))) {
			
			for (int i = 0; i < this.DIM; i++) {
				String line = reader.readLine();
				String[] split = line.split(",");
				
				for (int j = 0; j < this.DIM; j++) {
					int k = split[j].equals(this.BLANK_CHAR) ? 0 : Integer.parseInt(split[j]);
					board[i][j] = k;
				}
			

            }
            return board; 
		}
    catch (FileNotFoundException e) {
    	System.out.println("Error while searching for the file:");
		System.err.println(e);
		return null;
	} catch (IOException e) {
		System.out.println("Error while reading the file:");
		System.err.println(e);
		return null;
    }
}
}

