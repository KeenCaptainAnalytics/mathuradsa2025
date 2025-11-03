public class ChoosePermutation {

    static void helper(String arr[], String ans, int items){
        if(items == 3){
            System.out.println(ans);
            return;
        }
        for(int i =0 ;i <arr.length ;i++){
            String plate = ans + " "+arr[i];
            helper(arr, plate, items+1);
        }
    }
    public static void main(String[] args) {
        String []arr= {"laddoo", "rasgulla", "rasMalai"};

        helper(arr, "", 0);
    }
}
