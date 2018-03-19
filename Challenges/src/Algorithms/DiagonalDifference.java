package Algorithms;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr){


        //Continuar mas fazer uma matriz com int n como parametro do método.
        int difference = 0;

        int a0 = arr[0][0], a1 = arr[1][1], a2 = arr[2][2];
        int b2 = arr[0][2], b1 = arr[1][1], b0 = arr[2][0];

        int totalA = a0 + a1 + a2, totalB = b2 + b1 + b0;

        return Math.abs(difference = (totalA - totalB));

    }

}
