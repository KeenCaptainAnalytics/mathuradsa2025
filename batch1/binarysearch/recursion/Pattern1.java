public class Pattern1 {
    static void helper(int n){
        System.out.println(n);
        if(n ==1 || n ==2){
            return;
        }
        helper(n-1);
        helper(n-2);
    }
    public static void main(String[] args) {
        helper(5);
    }
}
