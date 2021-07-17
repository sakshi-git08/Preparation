package commonlyAsked;

import java.util.Arrays;

public class SecondMinMaxOfAnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,33,22,345,67,35,555,677,30};
        int secMaxi = secMax(arr);
        int secMini = secMin(arr);
        System.out.println(secMaxi);
        System.out.println(secMini);
    }
    // secMax({4, 781, 8, 99, 103})  -> 103
    // secMax({1, 2, 3, 4, 5})       -> 4
    // secMax({3, 4})                -> 3

    public static int secMax(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return one before last. Array is soreted from smallest to biggest
        return numArr[numArr.length - 2];
    }


    // secMin({4, 781, 8, 99, 103})  -> 8
    // secMin({1, 3, 2, 4, 5})       -> 2
    // secMin({3, 4})                -> 4

    public static int secMin(int[] numArr) {
        // sort an array
        Arrays.sort(numArr);

        // return second element. Array is soreted from smallest to biggest
        return numArr[1];
    }

    // for both methods Time Complexity: O(n log n)
}
