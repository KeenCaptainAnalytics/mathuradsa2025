class Test{
    

    static int helper(int num){
        if(num ==0 ){
            return 0;
        }
        else{
            int digit = num % 10;
            int result = helper(num/10);
            result = result +digit;
            return result;
        }
    }
    public static void main(String[] args) {
        int digit = 1235;
        int result = helper(digit);
        System.out.println(result );
    }
}