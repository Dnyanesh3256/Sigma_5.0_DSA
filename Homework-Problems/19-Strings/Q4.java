/*
Determine if two Strings are anagrams of each other
*/

import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        String s1 = "eat";
        String s2 = "tea";

        char s1Arr[] = s1.toCharArray();
        char s2Arr[] = s2.toCharArray();

        Arrays.sort(s1Arr);
        Arrays.sort(s2Arr);

        System.out.println(Arrays.equals(s1Arr, s2Arr));
    }    
}
