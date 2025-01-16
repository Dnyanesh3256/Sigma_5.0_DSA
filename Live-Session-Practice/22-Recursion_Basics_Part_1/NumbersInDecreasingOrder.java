public class NumbersInDecreasingOrder {
    public static void printNums(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }
        System.out.print(n + " ");
        printNums(n-1);
    }
    public static void main(String[] args) {
        printNums(20);
    }    
}
