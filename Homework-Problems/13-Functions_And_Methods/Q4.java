/*
Math class in java
*/

import java.util.*;
public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        System.out.println("Minimum of entered numbers is : " + Math.min(n1,n2));
        System.out.println("Maximum of entered numbers is : " + Math.max(n1,n2));
        System.out.println("Square root of " + n1 + " = " + Math.sqrt(n1));
        System.out.println("power of " + n1 + " and " + n2 + " = " + Math.pow(n1,n2));
        System.out.println("Absolute value of " + n1 + " = " + Math.abs(n1));

        sc.close();
    }
}
