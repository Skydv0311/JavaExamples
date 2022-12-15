package commondemos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Emp{
    private String name;

    public String getName() {
        return name;
    }

    public Emp(String name) {
        this.name = name;
    }
}
public class Filter {
    public static void main(String[] args) {
        List<Emp> list=new ArrayList<>();
        Emp e1=new Emp("Shubham Kumar");
        Emp e2=new Emp("Shubham Gupta");
        list.add(e1);
        list.add(e2);

        List<Emp> result = list.stream().filter(e -> e.getName().substring(e.getName().length() - 5).equalsIgnoreCase("gupta")).collect(Collectors.toList());
        System.out.println(result.size()+" "+result.get(0).getName());
    }
}
