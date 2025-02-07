public class NQueensCount {
    public static void nQueens(char[][] chessBoard, int row){
        if(row == chessBoard.length){
            count++;
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

    public static boolean isSafe(char chessBoard[][], int row, int col){
        for(int i=row;i>=0;i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        for(int i=row, j=col;i>=0 && j>=0; i--, j--){
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

    static int count = 0;
    public static void main(String[] args) {
        int n = 5;
        char chessBoard[][] = new char[n][n];
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                chessBoard[i][j] = 'x';
            }
        }

        nQueens(chessBoard, 0);

        System.out.println("Total ways to solve N Queen : " +count);
    }
}
