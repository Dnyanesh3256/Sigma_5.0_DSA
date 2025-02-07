public class NQueensOneSolution {
    public static void printChessBoard(char[][] chessBoard){
        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j] + " ");
            }
        
            System.out.println();
        }
    }

    public static boolean nQueens(char[][] chessBoard, int row){
        if(row == chessBoard.length){
            return true;
        }

        for(int j=0;j<chessBoard.length;j++){
            if(isSafe(chessBoard, row, j)){
                chessBoard[row][j] = 'Q';
                if(nQueens(chessBoard, row+1)){
                    return true;
                }
                chessBoard[row][j] = 'x';
            }
        }

        return false;
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
     public static void main(String[] args) {
        int n = 4;
        char chessBoard[][] = new char[n][n];

        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                chessBoard[i][j] = 'x';
            }
        }

        if(nQueens(chessBoard, 0)){
            System.out.println("Solution is possible");
            printChessBoard(chessBoard);
        }else{
            System.out.println("Solution is not possible");
        }
     }
}