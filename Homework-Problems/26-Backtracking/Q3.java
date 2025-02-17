/*
Knight's Tour
*/

public class Q3 {
    public static boolean solveKT(){
        int[][] sol = new int[8][8];
        int n = sol.length;

        for(int x=0;x<n;x++){
            for(int y=0;y<n;y++){
                sol[x][y] = -1;
            }
        }

        int xMove[] = {2,1,-1,-2,-2,-1,1,2};
        int yMove[] = {1,2,2,1,-1,-2,-2,-1};

        sol[0][0] = 0;

        if(!solveKTUntil(0, 0, 1, sol, xMove, yMove)){
            System.out.println("Solution doesn't exists!!");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static boolean solveKTUntil(int x, int y, int movei, int[][] sol, int[] xMove, int[] yMove){
        int k;
        int next_x;
        int next_y;

        int n = sol.length;

        if(movei == n*n){
            return true;
        }

        for(k=0;k<8;k++){
            next_x = x+xMove[k];
            next_y = y+yMove[k];

            if(isSafe(next_x, next_y, sol)){
                sol[next_x][next_y] = movei;

                if(solveKTUntil(next_x, next_y, movei+1, sol, xMove, yMove)){
                    return true;
                }
                else{
                    sol[next_x][next_y] = -1;
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int x, int y, int[][] sol){
        int n = sol.length;
        return ((x>=0) && (x<n) && (y>=0) && (y<n) && (sol[x][y] == -1));
    }

    public static void printSolution(int[][] sol){
        int n = sol.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(sol[i][j] + " ");
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        solveKT();
    }
}
