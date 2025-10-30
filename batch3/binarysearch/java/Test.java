class Test {

    static int sum(int a, int b){
        int res = a+b;
        return res;
    }

    int multiply(int a, int b){
        int res= a*b;
        return res;
    }
    public static void main (String []args){
        int result = sum(10, 20);

        Test obj = new Test();
        obj.multiply(20, 30);
    }
}
