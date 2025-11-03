public class Pattern2 {
    static void helper(int n){
        System.out.println(n);
        if(n ==-1 || n==0 || n==1){
            return;
        }

        for(int i=2;i<=4;i++){
            if(n-i >= -1){
                helper(n-i);
            }
        }

      
    }
    public static void main(String[] args) {
        helper(7);
    }
}
