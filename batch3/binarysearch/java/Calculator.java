import java.util.Scanner;

public class Calculator {
    static int add(int a , int b){
        return a+b;
    }
    static int multiply(int a , int b){
        return a*b;
    }
    static int diff(int a , int b){
        return a-b;
    }
    static int div(int a , int b){
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter first num");
            int a = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();
            System.out.println("enter symbol (+,-,/,*)");
            sc.nextLine();
            String s = sc.nextLine();


            System.out.println(a);
            System.out.println(b);
            System.out.println(s);

            switch(s){
                case "+":System.out.println( add(a,b)+"====================");
                        break;
                case "-" :System.out.println(  diff(a, b)+"====================");
                        break;
                case "/" : System.out.println( div(a, b)+"====================");
                        break;
                case "*" :System.out.println( multiply(a, b)+"====================");
                        break;
                default : System.out.println("error");
                
            }
    }
    }
}
