/*
What is the value of x^x for any value of x?
*/

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of X : ");
        int x = sc.nextInt();
        System.out.println("Value of X^X is : " + (x^x));

        sc.close();
    }
}
