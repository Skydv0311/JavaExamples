package commondemos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SortWords {

    public static void main(String[] args) throws IOException {
        FileReader file=new FileReader("src/File1.txt");
        BufferedReader br=new BufferedReader(file);

        String line;
        List<String> list=new ArrayList<>();
        while((line=br.readLine())!=null){
            String words[]=line.replace(",","").replace(".","").split(" ");
            list.addAll(Arrays.asList(words));
        }
        Collections.sort(list, (o1, o2) -> {
            if (o1.length() > o2.length()) {
                return -1;
            } else if (o1.length() < o2.length()) {
                return 1;
            } else {
                return o1.compareToIgnoreCase(o2);
            }
        });
        list.forEach(System.out::println);
    }
}
