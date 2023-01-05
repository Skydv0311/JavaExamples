package commondemos;

import java.util.*;

public class MinimumNoCurrenciesNotesRequired {

    public static Map<Integer,Integer> getMinimumNotes(List<Integer> currencies, Integer useramount){
        Collections.sort(currencies, Comparator.reverseOrder());
        Map<Integer,Integer> result=new HashMap<>();
        for(int i=0;i<currencies.size();i++)
            if(useramount>=currencies.get(i)){
                int note=currencies.get(i);
                int noOfnote=useramount/note;
                useramount=useramount%note;
                result.put(note,noOfnote);
            }
        return result;
    }


    public static void main(String[] args) {
        List<Integer> currencies=Arrays.asList(2000,500,100);
        Map<Integer,Integer> map=getMinimumNotes(currencies,2500);
        map.forEach((key,value)-> System.out.println(key+" : "+value));
    }
}
