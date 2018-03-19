import Algorithms.*;
import Helpers.TextClass;

import java.util.Arrays;


public class MainTester {

    public static void main(String[] args) {

        int[] simpleArraySumNumbers = new int[] { 1, 2, 3, 4, 10, 11 };
        long[] longArraySumNumbers = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        int[][] diagonalDiffArray = new int[3][3];

        diagonalDiffArray[0][0] =  11;
        diagonalDiffArray[0][1] = 2;
        diagonalDiffArray[0][2] = 4;
        diagonalDiffArray[1][0] = 4;
        diagonalDiffArray[1][1] = 5;
        diagonalDiffArray[1][2] = 6;
        diagonalDiffArray[2][0] = 10;
        diagonalDiffArray[2][1] = 8;
        diagonalDiffArray[2][2] =  -12;



        System.out.println(TextClass.SOLVE_ME_FIRST + SolveMeFirst.solve(3, 4));
        System.out.println(TextClass.ARRAY_SUM + ArraySum.simpleArraySum(6, simpleArraySumNumbers));
        System.out.println(TextClass.COMPARE_TRIPLETS_ALICE + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[0]);
        System.out.println(TextClass.COMPARE_TRIPLETS_BOB + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[1]);
        System.out.println(TextClass.A_VERY_BIG_SUM + BigSum.aVeryBigSum(5, longArraySumNumbers));
        System.out.println(TextClass.DIAGONAL_DIFFERENCE + DiagonalDifference.diagonalDifference(diagonalDiffArray));
    }

}
