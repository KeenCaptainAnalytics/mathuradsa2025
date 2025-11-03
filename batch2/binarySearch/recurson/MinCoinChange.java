public class MinCoinChange {

    static int helper(int coins[] , int target, int finalSum){

        if(target==0){
            return 1;
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<coins.length ;i++){
            if(target - coins[i] >= 0)
               min = Math.min( min ,helper(coins, target-coins[i], finalSum));

        }

        if(min==Integer.MAX_VALUE || finalSum == target){
            return min;
        }
        return min+1;
    }
    public static void main(String[] args) {
        int coins[]= {2,3,4};
        int min = helper(coins, 11, 11);
    }
}
