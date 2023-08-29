package Hasing;

import java.util.HashMap;
import java.util.Map;

public class charactersHashingUsingMap
{
    public static void main(String[] args) {

        String s = "abcdabehf";
        char[] sa = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < sa.length; i++) {
            //logic 1
            if(map.containsKey(sa[i]))
            {
             map.put(sa[i],map.get(sa[i])+1) ;
            }
            else {
                map.put(sa[i],1) ;
            }
            //logic 2:
           // map.put(sa[i], map.getOrDefault(sa[i], 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " appears" + ":" + entry.getValue());
        }
    }
}
