import java.util.HashMap;

public class Leetcode1100 {
    public static void main(String[] args) {
        String s ="asjdbfasisera";
        int k = 5;
        int cnt =0 ;
        HashMap<Character , Integer> map = new HashMap<>();

        // first window
        for(int i=0;i<k;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch, 1);
            }
        }

        if(map.size() == k){
            cnt++;
        }
        // sliding 
        for(int i = k; i<s.length() ;i++){
            char left = s.charAt(i-k);
            char right = s.charAt(i);

            // left
            if(map.get(left)>1){
                map.put(left, map.get(left)-1);
            }
            else{
                map.remove(left);
            }

            // right
            if(map.containsKey(right)){
                map.put(right, map.get(right)+1);
            }
            else{
                map.put(right, 1);
            }

            if(map.size() == k){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
