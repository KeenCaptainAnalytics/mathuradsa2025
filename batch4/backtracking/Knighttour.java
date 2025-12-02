public class Knighttour {

    static boolean helper(int arr[][], int[][] offset, int step, int x, int y){
        if(step == 65){
            return true;
        }

        for(int i=0;i<8;i++){
            int newx = x + offset[i][0];
            int newy = y + offset[i][1];

            if(newx >=0 && newx< 8 && newy>=0 && newy <=7 &&arr[newx][newy]==0){
                arr[newx][newy] = step;

                if(helper(arr, offset, step+1, newx, newy)){
                    return true;
                }
                else{
                    arr[newx][newy] = 0;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[][] = new int[8][8];
        int offset[][] = {{-1,-2},{-2,-1},{-2, 1},{-1, 2},{1,2},{2,1},{2, -1},{1, -2}};
        arr[0][0] =1 ;
        helper(arr, offset, 2, 0, 0);

        print(arr);

    }

    static void print(int arr[][]){
        for(int i=0;i<arr.length ;i++){
            for(int j=0;j<arr[i].length ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
