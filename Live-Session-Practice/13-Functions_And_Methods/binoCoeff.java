import java.util.*;
public class binoCoeff {

    public static int fact(int num){
        
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact *= i;
        }

        return fact;
    }

    public static int binCoeff(int n, int r){
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);

        int res = fact_n / (fact_r * fact_nmr);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N : ");
        int n = sc.nextInt();
        System.out.println("Enter value of R : ");
        int r = sc.nextInt();

        int result = binCoeff(n,r);

        System.out.println("Binomial Coefficient of entered values for N and R is : " + result);

        sc.close();
    }
}
