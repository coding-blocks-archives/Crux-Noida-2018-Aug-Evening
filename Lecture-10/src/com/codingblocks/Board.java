package com.codingblocks;

public class Board {

    public static void main(String[] args) {
        int n = 10;

        int[] mem = new int[n+1];

//        System.out.println(countBoardRecDP(n,4, mem));

        System.out.println(countBoardItrDP(10, 4, mem));


    }

    public static int countBoardRec(int target, int faces){
        if (target == 0){
            return 1;
        }

        int count = 0;

        for (int i = 1; i <= faces && i <= target ; i++) {
            count+= countBoardRec(target - i, faces);
        }

        return count;
    }

    public static int countBoardRecDP(int target, int faces, int[] mem){
        if (target == 0){
            return 1;
        }

        if (mem[target] != 0){
            return mem[target];
        }

        int count = 0;

        for (int i = 1; i <= faces && i <= target ; i++) {
            count+= countBoardRecDP(target - i, faces, mem);
        }

        mem[target] = count;

        return mem[target];
    }

    public static int countBoardItrDP(int target, int faces, int[] mem){

        mem[0] = 1;



        for (int local = 1; local <= target; local++) {

            int count = 0;

            for (int face = 1; face <= faces && face <= local; face++) {
                count += mem[local-face];
            }

            mem[local] = count;
        }

        return mem[target];
    }
}
