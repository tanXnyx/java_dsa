public class n_queenN_row {
    public static boolean isSafe(char board[][], int row,int col ){
        // vertical up
                for (int i = row-1;i>=0 ;i--){
                    if(board[i][col]=='Q'){
                        return false;
                    }
                }
                // dig left up
                 for (int i = row-1, j=col-1;i>=0 && j>=0;i--,j--){
                    if(board[i][j]=='Q'){
                        return false;
                    }
                 }
                 // dig right up
                 for(int i=row-1, j=col+1; i>=0 && j<board.length;i--,j++){
                    if (board[i][j]=='Q'){
                        return false;
                    }
                 }
                 return true;

    }
    static int count=0;
    public static void n_queenN_row(char board[][],int row){
      
        if(row == board.length){
                   printboard(board);
                   count++;
                   return;
       }
        for(int j=0; j< board.length; j++){
            if(isSafe(board, row, j)){
            board[row][j]='Q';
            n_queenN_row(board, row+1);
            board[row][j]='X';
            }
        }

    }
    public static void printboard(char board[][]){
              System.out.println("------------");
              for ( int i = 0 ;i < board.length;i++){
                for ( int j = 0 ;j < board.length;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
              }
    }
    public static void main(String[] args) {
        int n =4;
        char board[][]= new char[n][n];
        //initialize
        for (int i=0 ;i<n; i++){
         for (int j=0 ;j<n; j++){
                         board[i][j]='X';
         }
        }
        n_queenN_row(board,0);
        System.out.println("\ntotal number of solutions are "+count );
    }
    
}
//time complex O(n!)