public class Test1 {

    static int helper(int n){
        if(n==1){
            return 1;
        }
        // return n+helper(n-1);
        int result = helper(n-1);
        result = result + n;
        return result;
    }
   


    public static void main(String[] args) {
        int n = 55330250;
        // int sum = helper(n); 
        // System.out.println(sum);        
    }
}
