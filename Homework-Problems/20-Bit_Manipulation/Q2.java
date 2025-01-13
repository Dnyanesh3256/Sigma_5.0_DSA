/*
Swap two numbers without using any third variable
*/

public class Q2 {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("Value of a : " + a);
        System.out.println("Value of b : " + b);
    }
}
