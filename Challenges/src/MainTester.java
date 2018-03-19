import Algorithms.ArraySum;
import Algorithms.BigSum;
import Algorithms.CompareTriplets;
import Algorithms.SolveMeFirst;
import Helpers.TextClass;


public class MainTester {

    public static void main(String[] args) {

        int[] simpleArraySumNumbers = new int[] { 1, 2, 3, 4, 10, 11 };
        long[] longArraySumNumbers = new long[] {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        System.out.println(TextClass.SOLVE_ME_FIRST + SolveMeFirst.solve(3, 4));
        System.out.println(TextClass.ARRAY_SUM + ArraySum.simpleArraySum(6, simpleArraySumNumbers));
        System.out.println(TextClass.COMPARE_TRIPLETS_ALICE + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[0]);
        System.out.println(TextClass.COMPARE_TRIPLETS_BOB + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[1]);
        System.out.println(TextClass.A_VERY_BIG_SUM + BigSum.aVeryBigSum(5, longArraySumNumbers));
    }

}
