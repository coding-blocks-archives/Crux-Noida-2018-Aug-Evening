package com.codingblocks;

public class Maze {

    public static void main(String[] args) {

        int row = 100;
        int col = 100;

        long[][] mem = new long[row+1][col+1];

        System.out.println(mazeCountItrDP(100, 100, mem));
    }

    public static int mazeCount(int row, int col){
        if (row == 1 || col == 1){
            return 1;
        }

        return mazeCount(row-1, col) + mazeCount(row, col-1);
    }

    public static long mazeCountDP(int row, int col, long[][] mem){
        if (row == 1 || col == 1){
            return 1;
        }

        if (mem[row][col] != 0){
            return mem[row][col];
        }

        mem[row][col] = mazeCountDP(row-1, col, mem) + mazeCountDP(row, col-1, mem);

        return mem[row][col];
    }

    public static long mazeCountItrDP(int row, int col, long[][] mem){

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if ( r==1 || c == 1){
                    mem[r][c] = 1;
                } else {
                    mem[r][c] = mem[r-1][c] + mem[r][c-1];
                }
            }
        }

        return mem[row][col];
    }

    public static long mazeCountItrSS(int row, int col, long[] mem){

        for (int r = 1; r <= row; r++) {
            for (int c = 1; c <= col; c++) {
                if ( r==1 || c == 1){
                    mem[c] = 1;
                } else {
                    mem[c] = mem[c-1] + mem[c];
                }
            }
        }

        return mem[col];
    }
}
