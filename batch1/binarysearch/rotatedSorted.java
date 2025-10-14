public class SortedRotatedArray {

    static int helper(int arr[] , int target){
        int lo = 0 ;
        int hi = arr.length-1;

        while(lo<=hi){
            int mid = (lo+hi)/2 ;

            if(arr[mid]== target){
                return mid;
            }
            //left part is sorted
            else if(arr[lo]<= arr[mid]){
                if(arr[lo]<= target && target <= arr[mid]){
                    hi = mid-1;
                }
                else{
                    lo =mid+1;
                }
            }
            else{//right sorted
                if(arr[mid]<=target && target <= arr[hi]){
                    lo =mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {9, 10, 11, 1,2,3,4,5,6};
        int target = 11;
        int index = helper(arr, target);
        System.out.println(index);
    }
}
