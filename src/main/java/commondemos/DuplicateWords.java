package commondemos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) throws IOException {
        FileReader file=new FileReader("src/File.txt");
        BufferedReader br=new BufferedReader(file);
        Map<String,Integer> map=new HashMap<>();

        String line;
        int count=1;
        while((line=br.readLine())!=null){
            String words[]=line.replace(",","").replace(".","").split(" ");
            for(int i=0;i<words.length;i++){
                    for(int j=i+1;j<words.length;j++){
                        if(words[i].equalsIgnoreCase(words[j]) && words[i]!=""){
                            count++;
                            words[j]="";
                        }
                    }
                    if(count>1)
                        map.put(words[i],count);
                    count=1;
                }
            }
        }
}
