package com.tap;

import java.util.Scanner;
import java.util.Random;

public class T3main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create TicTacToe object
        HumanPlayer p1 = new HumanPlayer("Muneswar", 'O', game);
        AIPlayer p2 = new AIPlayer("AI", 'X', game); // Use AIPlayer
        Player cp = p1;

        while (true) {
            System.out.println(cp.name + " turn");
            cp.move();
            game.displayBoard();
            if (game.colCheck() || game.rowCheck() || game.diagCheck()) {
                System.out.println(cp.name + " won");
                break; // End the game after a player wins
            } else if (game.isBoardFull()) {
                System.out.println("The game is a draw!");
                break; // End the game if it's a draw
            } else {
                cp = (cp == p1) ? p2 : p1;
            }
        }
    }
}

class TicTacToe {
    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid position");
        }
    }

    boolean colCheck() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    boolean rowCheck() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    boolean diagCheck() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

abstract class Player {
    String name;
    char mark;
    TicTacToe game;

    Player(String name, char mark, TicTacToe game) {
        this.name = name;
        this.mark = mark;
        this.game = game;
    }

    abstract void move();
}

class HumanPlayer extends Player {

    HumanPlayer(String name, char mark, TicTacToe game) {
        super(name, mark, game);
    }

    void move() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("Enter the row and column");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));
        game.placeMark(row, col, mark);
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            return game.board[row][col] == ' ';
        }
        return false;
    }
}

class AIPlayer extends Player {

    AIPlayer(String name, char mark, TicTacToe game) {
        super(name, mark, game);
    }

    void move() {
        int row;
        int col;
        Random rand = new Random();

        do {
            row = rand.nextInt(3);
            col = rand.nextInt(3);
        } while (!isValidMove(row, col));
        game.placeMark(row, col, mark);
        System.out.println(name + " placed mark at " + row + ", " + col);
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            return game.board[row][col] == ' ';
        }
        return false;
    }
}


/*public class T3main {

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe(); // Create TicTacToe object
        HumanPlayer p1 = new HumanPlayer("Muneswar", 'O', game);
        HumanPlayer p2 = new HumanPlayer("Shafi", 'X', game);
        // AIPlayer p2 = new AIPlayer("AI", 'O');
        HumanPlayer cp = p1;

        while (true) {
            System.out.println(cp.name + " turn");
            cp.move();
            game.displayBoard();
            if (game.colCheck() || game.rowCheck() || game.diagCheck()) {
                System.out.println(cp.name + " won");
                break; // End the game after a player wins
            } else if (game.isBoardFull()) {
                System.out.println("The game is a draw!");
                break; // End the game if it's a draw
            } else {
                cp = (cp == p1) ? p2 : p1;
            }
        }
    }
}

class TicTacToe {
    char[][] board;

    public TicTacToe() {
        board = new char[3][3];
        initializeBoard();
    }

    void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
            }
        }
    }

    void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print("| ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    void placeMark(int row, int col, char mark) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            board[row][col] = mark;
        } else {
            System.out.println("Invalid position");
        }
    }

    boolean colCheck() {
        for (int j = 0; j <= 2; j++) {
            if (board[0][j] != ' ' && board[0][j] == board[1][j] && board[1][j] == board[2][j]) {
                return true;
            }
        }
        return false;
    }

    boolean rowCheck() {
        for (int i = 0; i <= 2; i++) {
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }
        return false;
    }

    boolean diagCheck() {
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]
                || board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }
        return false;
    }

    boolean isBoardFull() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}

class HumanPlayer {
    String name;
    char mark;
    TicTacToe game;

    HumanPlayer(String name, char mark, TicTacToe game) {
        this.name = name;
        this.mark = mark;
        this.game = game;
    }

    void move() {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;

        do {
            System.out.println("Enter the row and column");
            row = scan.nextInt();
            col = scan.nextInt();
        } while (!isValidMove(row, col));
        game.placeMark(row, col, mark);
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
            return game.board[row][col] == ' ';
        }
        return false;
    }
}*/
