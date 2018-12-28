package math.problems;
import java.util.Arrays;
public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        int l1 = array1.length;
        int l2 = array2.length;
        System.out.println("The Lowest Difference is : "+findDifference(array1, array2, l1, l2));
    }

    static int findDifference(int A1[], int B1[], int m, int n) {
        Arrays.sort(A1);
        Arrays.sort(B1);
        int a = 0, b = 0;

        int result = Integer.MAX_VALUE;

        while (a < m && b < n)
        {
            if (Math.abs(A1[a] - B1[b]) < result)
                result = Math.abs(A1[a] - B1[b]);
            if (A1[a] < B1[b])
                a++;
            else
                b++;
        }
        return result;
    }
}