/*
Count how many times lowercase vowels occured in a String entered by the user
*/

import java.util.*;
public class Q1 {
    public static int countVowels(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u')){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String to check number of vowels in it : ");
        String str = sc.nextLine();

        System.out.println("Count of the lowercase vowels in entered String is : " + countVowels(str));

        sc.close();
    }
}
