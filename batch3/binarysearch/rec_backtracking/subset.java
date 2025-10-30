import java.util.ArrayList;

public class Subset {

    static void helper(ArrayList<Integer> ans, int arr[], int in){
       
        if(in == arr.length){
            System.out.println(ans);
            return;
        }

        // pick
        ans.add(arr[in]);
        helper(ans, arr, in+1);
        ans.remove(ans.size()-1);

        // not pick
        helper(ans, arr, in+1);

    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[]= {1,2,3};

        helper(ans, arr, 0);
    }
}
