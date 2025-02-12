public class GridWays{
    public static int gridWays(int n, int m, int i, int j){
        if((i == n-1) && (j == m-1)){
            return 1;
        }else if((i == n) || (j == m)){
            return 0;
        }

        int wayOne = gridWays(n, m, i+1, j);
        int wayTwo = gridWays(n, m, i, j+1);

        return (wayOne + wayTwo);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;

        System.out.println(gridWays(n, m, 0, 0));
    }
}