package Algorithms;

public class CompareTriplets {

    public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){

        int[] alice = new int[] { a0, a1, a2 }, bob = new int[] { b0, b1, b2 }, points = new int[2];
        int aliceSum = 0, bobSum = 0;


        for (int i = 0; i != 3; i++)
        {
            if (alice[i] > bob[i])
                aliceSum++;
            else if (alice[i] < bob[i])
                bobSum++;

        }

        points[0] = aliceSum;
        points[1] = bobSum;

        return points;
    }

}
