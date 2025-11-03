public class coinChange2 {

    static int helper(int target, int coins[], boolean isStart){

        if(target==0){
            return 1;
        }
        int min =Integer.MAX_VALUE ;
        for(int i=0;i<coins.length ;i++){
            if(target-coins[i]>=0){
                min = Math.min(min,helper(target- coins[i], coins, false)) ;
            }
            
        }
        if(isStart == true || min== Integer.MAX_VALUE){
            return min;
        }
        
        return min+1;
    }
    public static void main(String[] args) {
        int coins[]= {2,3, 5};
        int target = 7;
        int minCoins = helper(target, coins, true);
        System.out.println(minCoins);
    }
}
