/*
Write a java program to check if a number is palindrome in Java
*/

import java.util.*;
public class Q3 {
    public static boolean isPalindrome(int num){
        int myNum = num;
        int rev = 0;
        while (myNum > 0) {
            int rem = myNum % 10;
            rev = rev * 10 + rem;
            myNum = myNum / 10;
        }

        if(num == rev){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check : ");
        int n = sc.nextInt();

        if(isPalindrome(n)){
            System.out.println(n + " is palindrome number");
        }else{
            System.out.println(n + " is not  palindrome number");
        }

        sc.close();
    }
}
