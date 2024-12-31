import java.util.*;
public class product {

    public static int prod(int num1,int num2){
        int res = num1 * num2;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int n2 = sc.nextInt();

        int result = prod(n1,n2);
        System.out.println("Product of entered numbers is : " + result);

        sc.close();
    }
}
