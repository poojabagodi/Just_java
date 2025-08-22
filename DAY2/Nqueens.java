package DAY2;

public class Nqueens {
    public static boolean issafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagnol left
        for(int i=row-1,j=col-1;i>=0&& j>=0;i--,j--){
             if(board[i][j]=='Q'){
                return false;
             }
        }

        //diagonal right
        for(int i=row-1,j=col+1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        return true;
    }

    public static void nqueens(char board[][],int row){
        //base case
        if(row==board.length){
            //printboard(board);
            return;
        }
        for(int j=0;j<board.length;j++){
            if(issafe(board, row, j)){
                board[row][j]='Q';
                nqueens(board, row+1);
                board[row][j]='X';
            }
        }
    }
    
}
