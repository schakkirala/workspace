/**
 * Main class of the Java program.
 * This code allows you to model and print a Maze.
 * 
 */

public class Maze {
	// 0 - obstacle
	// 1 - open space
	// 2 - path taken
	// 3 - goal 
	private static int[][] maze = 
		{{0, 0, 1, 1, 1, 1, 1, 1},
		{2, 2, 2, 2, 0, 0, 1, 1},
		{1, 0, 1, 2, 0, 0, 0, 0},
		{1, 1, 1, 2, 0, 0, 0, 0},
		{0, 0, 1, 2, 2, 3, 1, 1},
		{0, 0, 1, 0, 1, 0, 0, 1},
		{1, 0, 1, 1, 1, 0, 0, 0},
		{1, 1, 1, 0, 1, 1, 0, 0}};
	// use symbols to make reading the output easier...
	// 0 - obstacle - '#'
	// 1 - open space - '.'
	// 2 - path taken - '+'
	// 3 - goal - '*'
	private static final char[] MAZE_SYMBOLS = {'#', '.', '+', '*' };


	//Try to findPathFrom initial position if the maze is solved print the solution

	public static void main(String[] args) {
		print();

		System.out.println(isAvailablePosition(2,1));
		System.out.println(isAvailablePosition(2,2));
		System.out.println(isAvailablePosition(2,4));
		System.out.println(isAvailablePosition(2,3));
	}

	private static boolean isAvailablePosition(int row, int col) {
		boolean result =  ((col > 0 && col < maze[row].length) &&
				 (row > 0 && row < maze.length) &&
 				(maze[row][col] == 0 || maze[row][col] == 3));
		return result;
	}

	//print the output using MAZE_SYMBOLS
	private static void print(){
		for(int row = 0; row < maze.length; ++row) {
			for(int col = 0; col < maze[row].length; ++col) {
				System.out.print(MAZE_SYMBOLS[maze[row][col]]);
			}
			System.out.println();
		}
		System.out.println("Find positions");
	}
}
