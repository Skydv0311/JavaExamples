package commondemos;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsWithFrequency {
    public static void main(String[] args) {
        String s="I am Shubham. I live in India.";
        String[] str=s.replace(".","").split(" ");
        Map<String,Integer> map=new HashMap<>();
        for(int i=0;i<str.length;i++) {
            map.put(str[i],map.getOrDefault(str[i],0)+1);
        }

        for(String m:map.keySet()){
            System.out.println(m+": "+map.get(m));
        }
    }
}
