/*
Write a java method to compute the sum of the digits in an integer
*/

import java.util.*;
public class Q5 {

    public static int sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer : ");
        int n = sc.nextInt();

        int res = sumOfDigits(n);
        System.out.println("Sum of digits of = " + res);

        sc.close();
    }
}
