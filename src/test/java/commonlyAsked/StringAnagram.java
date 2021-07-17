package commonlyAsked;

import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
        boolean anagram = isAnagram("listen", "silent");
        System.out.println(anagram);
    }
    // isAnagram("listen", "silent")     -> true
    // isAnagram("triangle", "integral") -> true
    // isAnagram("abc", "bca")           -> true
    // isAnagram("abc", "ccb")           -> false
    // isAnagram("aaa", "aaab")          -> false

    public static boolean isAnagram(String str, String str1) {
        // convert both String to char[]
        char[] arrStr = str.toCharArray();
        char[] arrStr1 = str1.toCharArray();

        // sort both char[] arrays
        Arrays.sort(arrStr);
        Arrays.sort(arrStr1);

        // compare sorted arrays. If sorted arrays are equal, two strings are anagram
        return Arrays.equals(arrStr, arrStr1);
    }

    // Time Complexity: O(n log n)
}
