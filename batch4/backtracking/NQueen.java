class NQueen{ 

    static boolean check(int board[][], int row, int col){
        // col
        for(int i =row-1 ;i>=0 ;i--){
            if(board[i][col] == 1){
                return false;
            }
        }
        // left dia
        for(int i=row, j= col ; i>=0 && j>=0 ;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }
        //right
        for(int i=row, j=col ; i>=0 && j <board.length ;i--,j++){
            if(board[i][j]==1){
                return false;
            }
        }


        return true;
    }
    static void helper(int board[][], int q, int n){
        // System.out.println(q);
        if(q==n){
            print(board, n);
            System.out.println("=========================");
            return;
        }

        for(int i=0;i<n;i++){
            //0, 1,2,3
            if(check(board, q, i)==true){
                board[q][i] =1;
                helper(board, q+1, n);
                board[q][i] =0;
                // if(helper(board, q+1, n)== true){
                //     return true;
                // }
                // else{
                //     board[q][i] =0;
                // }
            }
            else{

            }
        }

        // when all the options are exhausted
        // return false;

    } 


    public static void main(String[] args) {
        int n =5;
        int board[][] = new int[n][n];

        // Single solution
        helper(board, 0, n);

       
    }

    static void print(int board[][], int n){
         for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}