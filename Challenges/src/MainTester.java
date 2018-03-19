import Algorithms.*;
import Helpers.TextClass;

import java.util.Arrays;


public class MainTester {

    public static void main(String[] args) {

        int[] simpleArraySumNumbers = new int[] { 1, 2, 3, 4, 10, 11 };
        long[] longArraySumNumbers = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        /*int[][] diagonalDiffArray = new int[3][3];
        System.out.println(diagonalDiffArray.length);
        Arrays.fill(diagonalDiffArray[0], 11);
        Arrays.fill(diagonalDiffArray[1], 4);
        Arrays.fill(diagonalDiffArray[2], 10);
        Arrays.fill(diagonalDiffArray[3], 2);
        Arrays.fill(diagonalDiffArray[4], 5);
        Arrays.fill(diagonalDiffArray[5], 6);
        Arrays.fill(diagonalDiffArray[6], 10);
        Arrays.fill(diagonalDiffArray[7], 8);
        Arrays.fill(diagonalDiffArray[8], -12);

        System.out.println("--------------------------------\n" +
                            "Array filled: ");
        for(int i = 0; i != diagonalDiffArray.length; i++){
            System.out.println(diagonalDiffArray[i][i]);
        }*/


        System.out.println(TextClass.SOLVE_ME_FIRST + SolveMeFirst.solve(3, 4));
        System.out.println(TextClass.ARRAY_SUM + ArraySum.simpleArraySum(6, simpleArraySumNumbers));
        System.out.println(TextClass.COMPARE_TRIPLETS_ALICE + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[0]);
        System.out.println(TextClass.COMPARE_TRIPLETS_BOB + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[1]);
        System.out.println(TextClass.A_VERY_BIG_SUM + BigSum.aVeryBigSum(5, longArraySumNumbers));
//        System.out.println(TextClass.DIAGONAL_DIFFERENCE + DiagonalDifference.diagonalDifference(diagonalDiffArray));
    }

}
