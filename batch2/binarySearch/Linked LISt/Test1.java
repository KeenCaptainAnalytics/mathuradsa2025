public class Test1 {

    static void print(LNode head){
        while(head!=null){
            System.out.println(head.val);
            head= head.next;
        }
    }

    static void insertAtEnd(LNode head, int val){
       LNode temp = new LNode(val);
        //implementation
        while(head.next!=null){
            head = head.next;
        }
        head.next = temp;
    }
    static LNode insertAtK(LNode head, int val , int k){

    }
    public static void main(String[] args) {
        LNode obj1 = new LNode(10);
        LNode obj2 = new LNode(20);
        LNode obj3 = new LNode(30);
        LNode obj4 = new LNode(40);
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        insertAtEnd(obj1, 50);
        LNode head= insertAtK(obj1, 35, 2);
        print(obj1);
    }
}
