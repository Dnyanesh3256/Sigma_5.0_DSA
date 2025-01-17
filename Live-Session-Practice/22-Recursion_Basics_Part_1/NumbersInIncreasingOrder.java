public class NumbersInIncreasingOrder {
    public static void printNums(int n){
        if(n == 1){
            System.out.print(n + " ");
            return;
        }
        printNums(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        printNums(10);
    }    
}
