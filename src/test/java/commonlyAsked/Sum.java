package commonlyAsked;

public class Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,5,67,54};
        int[] number = sum(arr, 11);
        for (int i = 0; i < number.length; i++){
            System.out.print(number[i] + ",");
        }

    }
    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}
    // sum({13, 43, 2, 71}, 84) -> {13, 71}

    public static int[] sum(int numArr[], int num) {
        int[] sumNumbers = new int[2];

        for(int i = 0; i < numArr.length; i++) {
            for(int j = i + 1; j < numArr.length; j++) {
                if(numArr[i] + numArr[j] == num) {
                    sumNumbers[0] = numArr[i];
                    sumNumbers[1] = numArr[j];
                }
            }
        }

        return sumNumbers;
    }

    // Time Complexity: O(n^2)
}
