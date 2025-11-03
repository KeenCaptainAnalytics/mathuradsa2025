public class Print {
    static int doSo(int n){
        if(n ==0){
            return 1;
        }
        else{
            int result = doSo(n/2);
            result = result+n;
            return result;
        }
    }
    public static void main(String[] args) {
        int result =doSo(24);
        System.out.println(result);
    }
}
