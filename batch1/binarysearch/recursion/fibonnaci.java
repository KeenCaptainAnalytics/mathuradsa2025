public class fibonnaci {

    static int helper(int n){
        if(n ==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        int lastTerm = helper(n-1);
        int secondLastTerm = helper(n-2);
        int nth = lastTerm + secondLastTerm;
        return nth;
    }
    public static void main(String[] args) {
        System.out.println(helper(15));
    }
}
