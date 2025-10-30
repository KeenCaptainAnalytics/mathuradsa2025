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
        if(in==0 || ans.size()==0){
            // not pick
           helper(ans, arr, in+1);
        }
        else if( ans.get(ans.size()-1)!=arr[in]){
           // not pick
           helper(ans, arr, in+1);
        }

        

    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int arr[]= {1,2,2};

        helper(ans, arr, 0);
    }
}
