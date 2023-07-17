package com.aurionpro.model;


import java.util.Scanner;

	public class TicTacToe {
	    private char[][] board;
	    private char currentPlayer;
	    
	    public TicTacToe(int size) {
	        board = new char[size][size];
	        currentPlayer = 'X';
	        initializeBoard();
	    }
	    
	    public void play() {
	        boolean gameOver = false;
	        int moves = 0;
	        
	        while (!gameOver) {
	            displayBoard();
	            int[] move = getPlayerMove();
	            
	            if (isValidMove(move)) {
	                makeMove(move);
	                moves++;
	                if (hasPlayerWon(move)) {
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    gameOver = true;
	                } else if (moves == board.length * board.length) {
	                    System.out.println("It's a draw!");
	                    gameOver = true;
	                } else {
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	                }
	            } else {
	                System.out.println("Invalid move. Please try again.");
	            }
	        }
	        
	        displayBoard();
	    }
	    
	    private void initializeBoard() {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board.length; j++) {
	                board[i][j] = '-';
	            }
	        }
	    }
	    
	    private void displayBoard() {
	        for (int i = 0; i < board.length; i++) {
	            for (int j = 0; j < board.length; j++) {
	                System.out.print(board[i][j] + " ");
	            }
	            System.out.println();
	        }
	        System.out.println();
	    }
	    
	    private int[] getPlayerMove() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Player " + currentPlayer + ", enter your move (row column): ");
	        int row = scanner.nextInt();
	        int column = scanner.nextInt();
	        return new int[] {row, column};
	    }
	    
	    private boolean isValidMove(int[] move) {
	        int row = move[0];
	        int column = move[1];
	        if (row < 0 || row >= board.length || column < 0 || column >= board.length) {
	            return false;
	        }
	        return board[row][column] == '-';
	    }
	    
	    private void makeMove(int[] move) {
	        int row = move[0];
	        int column = move[1];
	        board[row][column] = currentPlayer;
	    }
	    
	    private boolean hasPlayerWon(int[] move) {
	        int row = move[0];
	        int column = move[1];
	        char player = currentPlayer;
	        
	        // Check row
	        boolean rowWin = true;
	        for (int j = 0; j < board.length; j++) {
	            if (board[row][j] != player) {
	                rowWin = false;
	                break;
	            }
	        }
	        
	        // Check column
	        boolean columnWin = true;
	        for (int i = 0; i < board.length; i++) {
	            if (board[i][column] != player) {
	                columnWin = false;
	                break;
	            }
	        }
	        
	        // Check diagonals
	        boolean diagonalWin = true;
	        for (int i = 0; i < board.length; i++) {
	            if (board[i][i] != player) {
	                diagonalWin = false;
	                break;
	            }
	        }
	        if (!diagonalWin) {
	            diagonalWin = true;
	            for (int i = 0; i < board.length; i++) {
	                if (board[i][board.length - i - 1] != player) {
	                    diagonalWin = false;
	                    break;
	                }
	            }
	        }
	        
	        return rowWin || columnWin || diagonalWin;
	    }
	    
	    
	}



