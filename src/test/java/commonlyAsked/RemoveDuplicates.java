package commonlyAsked;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String removed = removeDupBySet("hello");
        System.out.println(removed);
    }

    // removeDup("hello")  -> "helo"
    // removeDup("apple")  -> "aple"
    // removeDup("aaaaaa") -> "a"
    // removeDup("abc")    -> "abc"

    public static String removeDup(String str) {
        String strNoDup = "";

        // loop over string and get each char
        for(char ch : str.toCharArray()) {
            // if strNoDup does not contain char then add to it
            if(!strNoDup.contains(String.valueOf(ch))) {
                strNoDup += ch;
            }
        }

        return strNoDup;
    }

    // Time Complexity: O(n^2) because contains() method of String has O(n)

    public static String removeDupBySet(String str) {
        String strNoDup = "";

        // convert str to char[]
        char[] letters = str.toCharArray();
        Set<Character> set = new LinkedHashSet<>();

        // add each letter to set. It will remove duplicates - Set does not allow duplicates
        for(char ch : letters) {
            set.add(ch);
        }

        // put back to String from Set
        for(Character ch : set) {
            strNoDup += ch;
        }

        return strNoDup;
    }

    // Time Complexity: O(n)
}
