package com.codingblocks;

public class NQueens {
    public static void main(String[] args) {

        int n = 4;

        boolean[][] board = new boolean[n][n];

//        display(board);

        nqueens(board, 0);

    }

    private static int nqueens(boolean[][] board, int row) {
        if (row == board.length){

            display(board);
            return 1;
        }

        int acc = 0;

        // check each col or row
        for (int col = 0; col < board.length; col++) {

            // if placing is safe
            if (isSafe(board, row, col)){
                // place your queen
                board[row][col] = true;

                acc += nqueens(board, row +1);

                // unplace your queen
                board[row][col] = false;
            }
        }

        return acc;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {

        // check to safe vertical above
        for (int i = 0; i < row; i++) {
            if (board[i][col]){
                return false;
            }
        }

        // diag left

        int max_left = Math.min(row, col);

        for (int i = 1; i <= max_left ; i++) {
            if (board[row-i][col-i]){
                return false;
            }
        }

        // diag right

        int max_right = Math.min(row, board.length - col - 1);

        for (int i = 1; i <= max_right ; i++) {
            if (board[row-i][col+i]){
                return false;
            }
        }

        return true;

    }

    public static void display(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j]){
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }

        System.out.println();
    }


}
