
class ABC{
    int a ;
    int b;

}

class CallStack{

    // int a; // instan
    public static void main(String[] args) {
        int a = 10;
        ABC ref1 = new ABC();
        ABC ref2 = new ABC();
        ABC ref3 = ref1;
        ABC ref4 = ref2;
    }
}