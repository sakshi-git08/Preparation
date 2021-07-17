package commonlyAsked;

public class StringPalindrome {
    public static void main(String[] args) {
        boolean palindrome = isPal("nitin");
        System.out.println(palindrome);
    }
    // isPal("anna")   -> true
    // isPal("civic")  -> true
    // isPal("apple")  -> false
    // isPal("level")  -> true

    public static boolean isPal(String str) {
        // we will use two 'pointers'. One pointer will start looking from beginning
        // another from the back. If values of pointers are not equal, we can return false

        int j = str.length() - 1; // pointer for the back

        // loop will go till half because we have two pointers
        for(int i = 0; i < str.length() / 2; i++) {
            // if pointers values are not equal return false
            if(str.charAt(i) != str.charAt(j - i)){
                return false;
            }
        }

        // if program reach here, it means all values were equal so it's palindrome
        return true;
    }

    // Time Complexity: O(n/2) but we can say just O(n)
}
