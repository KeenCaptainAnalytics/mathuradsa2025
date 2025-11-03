public class PrintArray {
    
    // static int helper(String s, char ch, int in){
    //     if(in == s.length()){
    //         return 0;
    //     }
    //     int result = helper(s, ch, in+1);
    //     if(s.charAt(in)== ch){
    //         result++;
    //     }
    //     return result;
    // }
    public static void main(String[] args) {
        String s ="11+23+342";
        // output= 376

        String sub= s.substring(0, 2);
        System.out.println(Integer.parseInt(sub)+1);
        // String s = "a+aaaaa+aa**aaa/a////a";
        // // Output = aaaaaaaaaaaaa
        
        
    }
}
