public class KokoEating {

    static int speedHelper(int currSpeed, int arr[]){
        int hours= 0;
        for(int i=0;i<arr.length ;i++){
            hours+= arr[i]/currSpeed;
            if(arr[i]%currSpeed !=0){
                hours = hours+1;
            }
        }
        return hours;
    }

    static int maxHelper(int arr[]){
        int m = arr[0];

        for(int i=0;i<arr.length ;i++){
            if(m<arr[i]){
                m= arr[i];
            }
        }
        return m;
    }
    static int helper(int arr[], int h){
        int lo= 1;
        int hi =maxHelper(arr);

        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int hoursTaken = speedHelper(mid, arr);
            if(hoursTaken > h){
                lo = mid+1;
            }
            else if(hoursTaken < h){
                hi = mid-1;
            }
            else{
                ans = mid;
                hi = mid-1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={3,6,7,11};
        int h = 8;
        int minSpeed = helper(arr, h);
        System.out.println(minSpeed);
    }
}
