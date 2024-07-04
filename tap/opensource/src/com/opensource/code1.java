package com.opensource;
import java.util.*;

public class code1 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Reading input
	        int n = scanner.nextInt();
	        int initialExperience = scanner.nextInt();

	        int[] powers = new int[n];
	        int[] bonuses = new int[n];

	        for (int i = 0; i < n; i++) {
	            powers[i] = scanner.nextInt();
	        }

	        for (int i = 0; i < n; i++) {
	            bonuses[i] = scanner.nextInt();
	        }

	        // Calculate the maximum number of defeated monsters
	        int maxDefeated = maxDefeatedMonsters(n, initialExperience, powers, bonuses);

	        // Output the result
	        System.out.println(maxDefeated);

	        scanner.close();
	    }

	    public static int maxDefeatedMonsters(int n, int initialExperience, int[] powers, int[] bonuses) {
	        // Combine powers and bonuses into a list of Monster objects
	        List<Monster> monsters = new ArrayList<>();
	        for (int i = 0; i < n; i++) {
	            monsters.add(new Monster(powers[i], bonuses[i]));
	        }

	        // Sort monsters by their power in ascending order
	        monsters.sort(Comparator.comparingInt(m -> m.power));

	        int defeatedCount = 0;
	        int currentExperience = initialExperience;

	        // Try to defeat monsters in order
	        for (Monster monster : monsters) {
	            if (currentExperience >= monster.power) {
	                // Defeat this monster
	                defeatedCount++;
	                currentExperience += monster.bonus;
	            } else {
	                // Can't defeat this monster, stop the process
	                break;
	            }
	        }

	        return defeatedCount;
	    }
	}

	class Monster {
	    int power;
	    int bonus;

	    Monster(int power, int bonus) {
	        this.power = power;
	        this.bonus = bonus;
	    }
	}

	
	
	
	
	
	
	
	
	
	package com.tap;

	import java.util.Scanner;

	public class T3main {

		public static void main(String[] args) 
		{
			HumanPlayer p1 = new HumanPlayer("Muneswar",'O');
			HumanPlayer p2 = new HumanPlayer("Shafi",'O');
			//AIPlayer p2 = new AIPlayer("AI",'O');
			HumanPlayer cp;
			cp = p1;
			while(true) 
			{
				System.out.println(cp.name + " turn");
				cp.move();
				TicTacToe.displayBoard();
				if(TicTacToe.colCheck() || TicTacToe.rowCheck() || TicTacToe.diagCheck())
				{
					System.out.println(cp.name + "won");
					break;
				}
				
				else
				{
					if(cp==p1) 
					{
						cp = p2;
					}
					else
					{
						cp = p1;
					}
				}
			}
		}

	}



	class TicTacToe
	{
		static char[][] board;
		
		public TicTacToe() 
		{
			board = new char[3][3];
			initilizeBoard();
		}
		
		
		void initilizeBoard() 
		{
			for(int i=0;i<board.length;i++) 
			{
				for(int j=0;j<board[i].length;j++) 
				{
					board[i][j] = ' ';
				}
			}
		}

		
		static void displayBoard()

		{
			System.out.println("-------------");
			for(int i=0;i<board.length;i++) 
			{
				System.out.print("| ");
				for(int j=0;j<board[i].length;j++) 
				{
					System.out.print(board[i][j] + " | ");
				}
				System.out.println();
				System.out.println("-------------");
			}
		}


		static void placeMark(int row ,int col ,char mark) 

		{
			if(row>=0 && row<=2 && col>=0 && col<=2) 
			{
				
				board[row][col] = mark;
			}
			else
			{
				System.out.println("Invalid position");
			}

			
		}
		

		static boolean colCheck()
		{
			for(int j=0;j<=2;j++) {
			if(board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
				return true;
			}
			}
			return false;
		}

		static boolean rowCheck() {
			for(int i=0;i<=2;i++) 
			{
				if(board[0][i] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
				{
					return true;
				}
			}
			return false;
		}
		
		
		static boolean diagCheck() {
				if(board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] || 
						board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
				{
					return true;
				}
				return false;
		}
	}	
		


	/*class Player
	{
		String name;
		char mark;	
		boolean isValidmove(int row ,int col)
		{ 
			if(row>=0 && row<=2 && col>=0 && col<=2) 
			{
				if(TicTacToe.board[row][col] == ' ')
				{
					return true;
				}
			}
			return false;
		}
	}*/

	class HumanPlayer 
	{
		String name;
		char mark;	
		
		HumanPlayer(String name,char mark)
		{
			this.name = name;
			this.mark = mark;
		}
		void move() 
		{
			Scanner scan = new Scanner(System.in);
			int row;
			int col;
			
			do
			{	
				System.out.println("Enter the row and column");
				row = scan.nextInt();
				col = scan.nextInt();
				
			}while(!isValidMove(row,col));		
			TicTacToe.placeMark(row,col,mark);
		}
		
		boolean isValidMove(int row ,int col)
		{ 
			if(row>=0 && row<=2 && col>=0 && col<=2) 
			{
				if(TicTacToe.board[row][col] == ' ')
				{
					return true;
				}
			}
			return false;
		}
	}

	/*class AIPlayer extends Player
	{
		AIPlayer(String name,char mark)
		{
			this.name = name;
			this.mark = mark;
		}
		void move() 
		{
			int row;
			int col;
			do
			{
				random scan = new random(System.in);
				row = scan.nextInt();
				col = scan.nextInt();
			}while(!isValidmove(row,col));		
			TicTacToe.placeMark(row,col,mark);
		}
	}*/









