package commonlyAsked;

public class fizzBizz {
    /*
    Print numbers from 1 to 100
- if a number is divisible by 3 print Fizz
- if a number is divisible by 5 print Buzz
- if a number is divisible by both 3 and 5 print FizzBuzz
     */
    public static void main(String[] args) {
        fizzBuzz();
    }
    public static void fizzBuzz() {
        for(int i = 1; i <= 100; i++) {
            // first check if number is divisible by 3 and 5
            if(i % 3 == 0 && i % 5 ==0) {
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0) {
                System.out.println("Buzz");
            }else if(i % 3 == 0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }
        }
    }
}
