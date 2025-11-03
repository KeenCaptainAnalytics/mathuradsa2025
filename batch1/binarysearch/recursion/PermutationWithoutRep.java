public class PermutationWithoutRep {

    static void helper(char arr[], boolean vis[], String ans, int count){
        if(count == vis.length){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<arr.length; i++){
            if(vis[i]==false ){
                String plate = ans +" "+arr[i];
                vis[i]= true;
                helper(arr, vis, plate, count+1);
                vis[i]= false;
            }
        }
    }
    public static void main(String[] args) {
        char arr[]= {'A','B','c'};

        boolean vis[]= new boolean[3];

        helper(arr, vis, "", 0);
    }
}
