/*
Enter cost of 3 items from the user (using float data type) - a pencil, a pen and an eraser. You have to output the total cost of the items back to the user as their bill. APNA (Add on: You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/

import java.util.*;
public class Q3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of the pencil : ");
        float pencil = sc.nextFloat();
        System.out.println("Enter the cost of the pen : ");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of the earaser : ");
        float eraser = sc.nextFloat();

        float total_cost = pencil + pen + eraser;
        System.out.println("Total cost of the items : "+total_cost);

        float tc_gst = (total_cost * 18/100) + total_cost;
        System.out.println("Cost with GST : "+tc_gst);

        sc.close();
    }
}
