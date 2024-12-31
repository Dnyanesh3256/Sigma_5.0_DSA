/* 
In a program, input 3 numbers: A, B and C. You have to output the average of these 3 numbers.
(Hint: Average of N numbers is sum of those numbers divided by N) 
*/

import java.util.*;
public class Q1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        System.out.println("Enter third number : ");
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("The average of entered numbers is : "+avg);

        sc.close();
    }
}