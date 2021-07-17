package commonlyAsked;

public class OddEven {
    public static void main(String[] args) {
        evenOrOdd(12);
    }
    // evenOrOdd(5)   -> Odd
    // evenOrOdd(2)   -> Even
    // evenOrOdd(100) -> Even
    // evenOrOdd(101) -> Odd

    public static void evenOrOdd(int num) {
        if(num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Time Complexity: O(1)
}
