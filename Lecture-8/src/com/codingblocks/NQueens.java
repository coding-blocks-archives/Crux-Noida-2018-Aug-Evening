package com.codingblocks;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

        display(board);

        nqueens(board, 0);

    }

    private static void nqueens(boolean[][] board, int row) {
        if (row == board.length){
            System.out.println("You found a solution");
            return;
        }

        // check each col or row
        for (int col = 0; col < board.length; col++) {

            // if placing is safe
            if (isSafe(board, row, col)){
                // place your queen
                board[row][col] = true;

                nqueens(board, row +1);

                // unplace your queen
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check to safe vertical above
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }



        return true;

    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


}
