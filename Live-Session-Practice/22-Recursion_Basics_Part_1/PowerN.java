public class PowerN {
    public static int powerN(int x, int n){
        if(n == 0){
            return 1;
        }
        int xn = x * powerN(x, n-1);
        return xn;
    }
    public static void main(String[] args) {
        System.out.println(powerN(2, 3));
    }
}
