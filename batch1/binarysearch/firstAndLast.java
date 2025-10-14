class FirstAndLast{

    static int helperFirst(int arr[], int target){
        int lo= 0;
        int hi = arr.length-1;
        int pos = -1;
        while(lo<=hi){
            int mid = (hi+lo)/2;

            if(arr[mid]== target){
                pos = mid;
                hi = mid-1;
            }
            else if(arr[mid]<target){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return pos;
    }

    static int helperLast(int nums[], int target, int lo){
        if(lo==-1){
            return -1;
        }

        int hi = nums.length-1;

        int pos = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(nums[mid]== target){
                pos= mid;
                lo = mid+1;
            }
            else if(nums[mid]>target){
                hi = mid-1;
            }
        }
        return pos;
    }
    public static void main(String[] args) {
         int nums[] = {5,7,7,8,8,10};
         int target = 8;

         int fi = helperFirst(nums, target);
         int li = helperLast(nums, target, fi);
         System.out.println(fi+" --- "+ li);
    }
}
