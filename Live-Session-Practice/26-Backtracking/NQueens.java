public class NQueens {
    public static void printChessBoard(char chessBoard[][]){
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(char chessBoard[][], int row, int col){
        for(int i=row;i>=0;i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row, j=col;i>=0 && j>=0;i--, j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        for(int i=row, j=col;i>=0 && j<chessBoard.length;i--, j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    //Time Complexity = O(n!)
    public static void nQueens(char[][] chessBoard, int row){
        if(row == chessBoard.length){
            System.out.println("----------Chess Board----------");
            printChessBoard(chessBoard);
            return;
        }

        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard, row, j)){
                chessBoard[row][j] = 'Q';
                nQueens(chessBoard, row+1);
                chessBoard[row][j] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        int n = 5;
        char chessBoard[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j] = 'x';
            }
        }

        nQueens(chessBoard, 0);
    }
}
