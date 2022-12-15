package commondemos;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencyOfCharacter {

    static void getOccuringChar(String str){
        int len=str.length();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<len;i++){
            int count=1;
            if(!map.containsKey(str.charAt(i))){
                for(int j=i+1;j<len;j++){
                    if(str.charAt(i)==str.charAt(j))
                    count++;
                }
                map.put(str.charAt(i),count);
            }
        }
        map.forEach((key,value)->{
            System.out.println(key+" : "+value);
        });
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        getOccuringChar(str);
    }
}
