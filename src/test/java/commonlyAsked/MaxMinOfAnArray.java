package commonlyAsked;

public class MaxMinOfAnArray {
    public static void main(String[] args) {
        int[] arr = {12,34,78,34,45,23,56};
        int maxi = max(arr);
        int mini = min(arr);
        System.out.println(maxi);
        System.out.println(mini);
    }
    // max({4, 781, 8, 99, 103})   -> 781
    // max({1, 2, 3, 4, 5})        -> 5
    // max({3, 4})                 -> 4
    // max({100})                  -> 100

    public static int max(int[] arrNum) {
        // assume first element of array is biggest number
        int max = arrNum[0];

        // loop over the array and test our above assumption
        for(int i = 0; i < arrNum.length; i++) {
            // if max was not the biggest number, update it
            if(max < arrNum[i]) {
                max = arrNum[i];
            }
        }

        // after the loop max variable will hold the biggest number
        return max;
    }

    // Time Complexity: O(n)
    // min({4, 781, 8, 99, 103})  -> 4
    // min({1, 2, 3, 4, 5})       -> 1
    // min({3, 4})                -> 3
    // min({100})                 -> 100

    public static int min(int[] arrNum) {
        // assume first element of array is the smallest number
        int min = arrNum[0];

        // loop over the array and test assumption
        for(int i = 0; i < arrNum.length; i++) {
            // if min was not smallest, update it
            if(min > arrNum[i]) {
                min = arrNum[i];
            }
        }

        return min;
    }

    // Time Complexity: O(n)
}
