package DAY3;
import java.util.*;
public class longuniquesubarray {
    public static int longsub(String str){
        Map<Character,Integer> seen=new HashMap<>();
        int n=str.length();
        int maxlen=0;
        int left=0;
        for(int right=0;right<n;right++){
              char ch=str.charAt(right);
              if(seen.containsKey(ch)){
                left=Math.max(left,seen.get(ch)+1);
              }
              seen.put(ch,right);
              maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}
