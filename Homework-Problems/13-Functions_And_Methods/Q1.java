/*
Write a java method to compute the average of three numbers
*/

import java.util.*;
public class Q1 {

    public static float avgTN(float n1, float n2, float n3){
        float avg = (n1 + n2 + n3) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        float n1 = sc.nextFloat();
        System.out.println("Enter second number : ");
        float n2 = sc.nextFloat();
        System.out.println("Enter third number : ");
        float n3 = sc.nextFloat();

        float res = avgTN(n1, n2, n3);
        System.out.println("Average of three entered numbers is : " + res);

        sc.close();
    }
}