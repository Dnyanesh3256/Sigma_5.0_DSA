/*
Rat in a maze
*/

public class Q1 {
    public static void printSolution(int sol[][]){
        for(int i=0;i<sol.length;i++){
            for(int j=0;j<sol.length;j++){
                System.out.print(sol[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static boolean solveMaze(int[][] maze){
        int n = maze.length;

        int[][] sol = new int[n][n];

        if(solveMazeUntil(maze, 0, 0, sol) == false){
            System.out.println("Solution doesn't exists!!");
            return false;
        }

        printSolution(sol);
        return true;
    }

    public static boolean solveMazeUntil(int[][] maze, int row, int col, int[][] sol){
        if((row == maze.length-1) && (col == maze.length-1) && (maze[row][col] == 1)){
            sol[row][col] = 1;
            return true;
        }

        if(isSafe(maze, row, col) == true){
            if(sol[row][col] == 1){
                return false;
            }

            sol[row][col] = 1;

            if(solveMazeUntil(maze, row+1, col, sol)){
                return true;
            }

            if(solveMazeUntil(maze, row, col+1, sol)){
                return true;
            }

            sol[row][col] = 0;
            return false;
        }

        return false;
    }

    public static boolean isSafe(int[][] maze, int row, int col){
        return ((row>=0) && (row<maze.length) && (col>=0) && (col<maze.length) && (maze[row][col] == 1));
    }
    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

        solveMaze(maze);
    }    
}
