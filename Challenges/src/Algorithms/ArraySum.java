package Algorithms;

public class ArraySum {

    public static int simpleArraySum(int n, int[] arr){

        int[] newArr = new int[n];
        int sum = 0;

        for (int i = 0; i != arr.length; i++)
        {
            newArr[i] = arr[i];

            sum += newArr[i];
        }


        return sum;
    }

}
