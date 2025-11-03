public class Count0 {

    static int helper(int num)
    {
        if(num==0){
            return 0;
        }
        int digit = num%10;
        int result = helper(num/10);
        if(digit ==0 ){
            return result + 1;
        }
        return result ;
    }
    public static void main(String[] args) {

        int result =helper(102040);
        System.out.println(result);
    }
}
