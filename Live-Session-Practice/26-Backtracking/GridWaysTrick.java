public class GridWaysTrick {
    public static int fact(int n){
        if(n == 1){
            return n;
        }

        return n * fact(n-1);
    }

    public static int gridWaysTrick(int n, int m){

        // ((n-1)+(m-1))! 
        // ______________
        // ((n-1)!*(m-1)!)

        int up1 = (n-1);
        int up2 = (m-1);
        int up = fact(up1+up2);
        int down1 = fact(up1);
        int down2 = fact(up2);
        int down = down1*down2;

        return up/down;
    }

    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(gridWaysTrick(n, m));
    }
}
