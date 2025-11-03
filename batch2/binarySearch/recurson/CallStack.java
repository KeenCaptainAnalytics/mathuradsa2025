class Car{
    int a = 100;
    int b = 200;
}
class CallStack{
    static int doSomething(int a , Car ref){
        a= a+10;
        System.out.println(a);
        return ref.a+a;
    }
    public static void main(String[] args) {
        // primitve local variables
        int a = 10;
        // ref variables 
        Car c1= new Car();
        int result = doSomething(a, c1);
        System.out.println(result);
    }
}