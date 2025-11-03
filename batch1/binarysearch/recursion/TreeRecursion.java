public class TreeRecursion {

    static void helper(int n){
        if(n >=5){
            return;
        }

        for(int  i=1 ;i<=3 ;i++){
            if(n%2==0){
                helper(n+1);
            }
            else{
                helper(n+2);
            }
        }
    }
    public static void main(String[] args) {
        helper(1);
    }
}
