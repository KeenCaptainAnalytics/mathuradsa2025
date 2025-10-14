public class bouquet {

    static int utility(int dayNo , int flowers,int arr[] ){

        int count =0;
        int k = flowers;

        for(int i= 0;i<arr.length ;i++){
            if(arr[i]<=dayNo){
               k--;
            }
            else if(arr[i]>dayNo&& k>0){
                k = flowers;
            }
            
            if(k==0){
                count++;
                k= flowers;
            }
            
        }

        return count;
    }


    static int helper(int arr[],int m, int k){
        int lo =min(arr);
        int hi = max(arr);
        int min = 0;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            int b= utility(mid,k, arr);

            if(b== m){
                min = mid;
                hi = mid-1;
            }
            else if(b<m){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }

        return min;
    }
    public static void main(String[] args) {
        int bloomDay[] = {1,10,3,10,2};
        int m = 3, k = 1;
        int result = helper(bloomDay, m, k);
    }
}
