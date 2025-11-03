public class CallStack2 {

    static void doSomething(int n){
        if(n==0){
            return;
        }
        System.out.println("Line "+n);
        doSomething(n-1);
        System.out.println("Line "+(n+1));
    }
    public static void main(String[] args) {
        System.out.println("Main:Line 1");
        doSomething(3);
        
    }
}
