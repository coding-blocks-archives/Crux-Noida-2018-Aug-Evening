package com.codingblocks;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        ArrayList<String> list = allMazePath("", 5, 8);
//        System.out.println(list);

        boolean[][] board = {
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true},
                {true, true, true, true}
        };

        allPath("", board, 0, 0);
    }

    public static int mazeCount(int row, int col){

        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCount(row-1, col) + mazeCount(row, col - 1);

    }

    public static void mazePath(String path, int row, int col){

        if (row == 1 && col == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazePath(path + 'V', row-1, col);
        }

        if (col > 1){
            mazePath(path +'H', row, col - 1);
        }

    }

    public static ArrayList<String> allMazePath(String path, int row, int col){

        if (row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(path);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row > 1){
            list.addAll(allMazePath(path + 'V', row-1, col));
        }

        if (col > 1){
            list.addAll(allMazePath(path +'H', row, col - 1));
        }

        return list;
    }

    public static void safeMouse(String path, boolean[][] board, int row, int col){

        if (row == board.length - 1 && col == board[0].length - 1){
            System.out.println(path);
            return;
        }

        if (!board[row][col]){
            return;
        }

        if (row < board.length - 1){
            safeMouse(path +'V', board, row+1, col);
        }

        if (col < board[0].length - 1){
            safeMouse(path+'H', board, row, col + 1);
        }
    }

    public static void allPath(String path, boolean[][] board, int row, int col){
        if (row == board.length - 1 && col == board[0].length - 1){
            System.out.println(path);
            return;
        }

        if (!board[row][col]){
            return;
        }

        board[row][col] = false;

        if (row < board.length - 1){
            allPath(path +'D', board, row+1, col);
        }
        if (col < board[0].length - 1){
            allPath(path+'R', board, row, col + 1);
        }
        if (row > 0){
            allPath(path+ 'U', board, row - 1, col);
        }
        if (col > 0){
            allPath(path + 'L', board, row, col-1);
        }
        board[row][col] = true;
    }
}
