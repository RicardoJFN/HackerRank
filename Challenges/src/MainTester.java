import Algorithms.ArraySum;
import Algorithms.CompareTriplets;
import Algorithms.SolveMeFirst;
import Helpers.TextClass;


public class MainTester {

    public static void main(String[] args) {

        int[] simpleArraySumNumbers = new int[] { 1, 2, 3, 4, 10, 11 };

        System.out.println(TextClass.SOLVE_ME_FIRST + SolveMeFirst.solve(3, 4));
        System.out.println(TextClass.ARRAY_SUM + ArraySum.simpleArraySum(6, simpleArraySumNumbers));
        System.out.println(TextClass.COMPARE_TRIPLETS_ALICE + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[0]);
        System.out.println(TextClass.COMPARE_TRIPLETS_BOB + CompareTriplets.solve(5, 6, 7, 3, 6, 10)[1]);
    }

}
