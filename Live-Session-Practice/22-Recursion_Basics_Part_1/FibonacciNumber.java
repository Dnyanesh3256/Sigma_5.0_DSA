public class FibonacciNumber {
    public static int fiboNum(int n){
        if((n == 1) | (n==0)){
            return n;
        }

        int fn = fiboNum(n-1) + fiboNum(n-2);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(fiboNum(25));
    }
}
