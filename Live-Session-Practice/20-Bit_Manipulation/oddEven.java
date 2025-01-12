import java.util.*;
public class oddEven {
    public static void evenOrOdd(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            System.out.println(n + " is a Even Number");
        }else{
            System.out.println(n + " is a Odd Number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check Even or Odd");
        int n = sc.nextInt();

        evenOrOdd(n);

        sc.close();
    }    
}
