public class TreeRecursion {

    static void helper(int n){
       
        if(n >=4){
            return;
        }
        
        for(int i=0; i<3;i++){
            if(n%2==0){
                helper(n+i);
            }
            else{
                helper(n+i);
            }
        }
    }
public static void main(String[] args) {
    helper(1);
}
}
