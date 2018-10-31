package cm.cosingblocks;

public class BitWise {
    public static void main(String[] args) {
        System.out.println(power(9, 11));
    }

    public static int countones(int num){

        int count  = 0;

        while (num > 0){
            if ((num & 1) == 1){
                count++;
            }

            num = num >> 1;
        }

        return count;
    }

    public static long power(int x, int n){
        int base = x;
        long result = 1;

        while (n > 0){
            if ((n & 1) == 1){
                result = result * base;
            }

            n = n >> 1;

            base = base * base;
        }

        return result;
    }

    public int unique(int[] nums){
        int res = 0;

        for (int a: nums) {
           res = res ^ a;
        }

        return res;
    }
}
