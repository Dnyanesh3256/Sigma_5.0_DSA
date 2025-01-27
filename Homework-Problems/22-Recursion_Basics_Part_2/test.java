public class test {
    public static void printNumDecreasing(int n){
        if(n == 0){
            return;
        }
        
        printNumDecreasing(n-1);

        System.out.print(n + " ");
    }

    public static void printNumIncreasing(int n){
        if(n == 0){
            return;
        }

        printNumIncreasing(n-1);

        System.out.print(n + " ");
    }

    public static int fiboNumN(int n){
        if((n == 0) || (n == 1)){
            return n;
        }

        return fiboNumN(n-1) + fiboNumN(n-2);
    }
    public static void main(String[] args) {
        System.out.println(fiboNumN(8));
    }
}
