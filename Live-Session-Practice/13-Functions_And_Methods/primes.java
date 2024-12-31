import java.util.*;
public class primes {

    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        
        if(num == 2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(num);i++){
            if((num%i) == 0){
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int from, int till){
        for(int i=from;i<=till;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number from which to check prime : ");
        int from = sc.nextInt();
        System.out.println("Enter number until which check prime number : ");
        int till = sc.nextInt();

        primeInRange(from, till);

        sc.close();
    }
}
