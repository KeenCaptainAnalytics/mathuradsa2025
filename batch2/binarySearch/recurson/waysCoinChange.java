public class waysCoinChange {

    static int helper(int target , String ans){

        if(target==0){
            // System.out.println(ans);
            return 1;
        }

        int waysleft = helper(target-1, ans+"1");
        int waysright=0;
       if(target-2 >=0)
        waysright = helper(target-2, ans+"2");

        return waysleft + waysright;
    }
    public static void main(String[] args) {
       int ways = helper(4, "");
       System.out.println(ways);
    }
}
