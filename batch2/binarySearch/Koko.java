public class Koko {

    static int max(int arr[]){
        int max= arr[0];
        for(int i=1;i<arr.length ;i++){
            if(max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    static int util(int currspeed , int arr[]){
        int totalhours =0;
        for(int i=0;i<arr.length ;i++){
            totalhours = totalhours +  arr[i]/currspeed;
            if(arr[i]%currspeed !=0){
                totalhours+=1;
            }
        }

        return totalhours;
    }
    static int binaryhelper(int arr[] , int h){
        int lo = 1;
        int hi = max(arr);
        int minspeed = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2; // curr speed
            int hours = util(mid, arr);

            if(hours == h){
                minspeed= mid;
                hi = mid-1;
            }
            else if(hours> h){
                lo = mid+1;
            }
            else{
                hi = mid-1;
            }
        }
        return minspeed;
    }
   public static void main(String[] args) {
    int arr[] = {3,6,7,11};
    int h = 8;

    int minSpeed = binaryhelper(arr, h);

    System.out.println(minSpeed);
   } 
}
