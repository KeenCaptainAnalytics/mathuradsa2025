public class Sudoku {
    public static void main(String[] args) {
        char board[][]= {{'5','3','.','.','7','.','.','.','.'},
                        {'6','.','.','1','9','5','.','.','.'},
                        {'.','9','8','.','.','.','.','6','.'},
                        {'8','.','.','.','6','.','.','.','3'},
                        {'4','.','.','8','.','3','.','.','1'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','6','.','.','.','.','2','8','.'},
                        {'.','.','.','4','1','9','.','.','5'},
                        {'.','.','.','.','8','.','.','7','9'}};

        helper(board,0,0);
        print(board);
    }

    static void print(char ch[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(ch[i][j]+" ");
            }
            System.out.println();
        }
    }
    static boolean check(char board[][], int row, int col , char ch){
        // row
        for(int i=0; i<9;i++){
            if(board[row][i]==ch){
                return false;
            }
        }
        //col
        for(int i =0;i<9;i++){
            if(board[i][col]==ch){
                return false;
            }
        }

        //matrix
        int x= row-row%3;
        int y = col-col%3;

        for(int i=x; i<x+3 ;i++){
            for(int j = y ;j<y+3 ;j++){
                if(board[i][j]==ch){
                    return false;
                }
            }
        }

        return true;
    }
    static boolean helper(char board[][], int row, int col){

        if(row== 8 && col==9){
            return true;
        }

        if(col == 9){
            row= row+1;
            col = 0;
        }
        if(board[row][col]!='.'){
            return helper(board, row, col+1);
        }
        for(int i=1; i<=9;i++){
            char ch = (char)(i+'0');
            if(check(board, row, col, ch)==true){
                board[row][col] = ch;

                if(helper(board , row , col+1)== true){
                    return true;
                }
                else{
                    board[row][col]='.';
                }
            }
        }

        return false;
    }
}
