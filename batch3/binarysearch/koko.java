public class Koko {

    static int max(int piles[]){
        int number = piles[0];
        for(int i=1;i<piles.length ;i++){
            if(number <piles[i]){
                number = piles[i];
            }
        }
        return number;
    }


    static int gethours(int speed , int piles[]){
        int total = 0;

        for(int i=0;i<piles.length ;i++){
            total += piles[i]/speed;
            if(piles[i]%speed!=0){
                total++;
            }
        }
        return total;
    }
    static int binaryHelper(int piles[] , int h){
        int lo = 1;
        int hi = max(piles);
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            int currHours = gethours(mid, piles);
            if(currHours == h){
                ans = mid;
                hi = mid-1;

            }
            else if(currHours < h){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        return ans;
    }
    public static void main(String[] args) {
        int piles[] ={3,6,7,11};
        int h = 8;

        int minSpeed = binaryHelper(piles, h);
        System.out.println(minSpeed);
    }
}
