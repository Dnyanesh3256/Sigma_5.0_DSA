import java.util.*;
public class isPrime {

    public static boolean isPrimeNum(int n){
        if(n == 1){
            return false;
        }
        
        if(n == 2){
            return true;
        }

        for(int i=2;i<=(n-1);i++){
            if((n%i) == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check : ");
        int n = sc.nextInt();

        boolean res = isPrimeNum(n);
        if(res == true){
            System.out.println(n + " is a prime number");
        }else{
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
