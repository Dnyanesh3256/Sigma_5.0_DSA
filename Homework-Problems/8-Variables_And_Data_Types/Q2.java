/*
In a program, input the side of a square. You have to output the area of the square.
(Hint: area of a square is (side x side)) 
*/

import java.util.*;
public class Q2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the side of the square : ");
        int side = sc.nextInt();
        int area = side * side;
        System.out.println("Area of the square is : "+area);

        sc.close();
    }
}
