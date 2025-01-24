public class PowerNOpt {
    public static int powerNOpt(int x, int n){
        if(n == 0){
            return 1;
        }

        int halfSquare = powerNOpt(x, n/2) * powerNOpt(x, n/2);

        if(n%2 != 0){
            halfSquare = x * halfSquare;
        }

        return halfSquare;
    }
    public static void main(String[] args) {
        System.out.println(powerNOpt(2, 10));
    }
}
