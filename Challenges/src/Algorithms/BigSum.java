package Algorithms;

public class BigSum {

    public static long aVeryBigSum(int n, long[] ar){

        long[] newArr = new long[n];
        long sum = 0;

        for (int i = 0; i != ar.length; i++){
            newArr[i] = ar[i];

            sum += newArr[i];
        }

        return sum;
    }

}
