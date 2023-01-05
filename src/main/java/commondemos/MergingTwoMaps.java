package commondemos;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
    private Long Id;
    private String name;

    public Employee(long Id, String name) {
        this.setId(Id);
        this.setName(name);
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        Id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class MergingTwoMaps {
    public static void main(String[] args) {
        Map<String,Employee> map1=new HashMap<>();
        Map<String,Employee> map2=new HashMap<>();

        Employee employee1 = new Employee(1L, "Henry");
        map1.put(employee1.getName(), employee1);
        Employee employee2 = new Employee(22L, "Annie");
        map1.put(employee2.getName(), employee2);
        Employee employee3 = new Employee(8L, "John");
        map1.put(employee3.getName(), employee3);

        Employee employee4 = new Employee(2L, "George");
        map2.put(employee4.getName(), employee4);
        Employee employee5 = new Employee(3L, "Henry");
        map2.put(employee5.getName(), employee5);

        /**
         * Solution 1
         */
        System.out.println("========================Collection map merger===============================================");
        Map<String,Employee> map3=new HashMap<>(map1);
        map2.forEach((key,value)->map3.merge(key,value,(v1,v2)-> new Employee(v1.getId(),v2.getName())));

        map3.forEach((key,value)-> System.out.println(key+" "+value.getId()));

        /**
         * Solution 2
         */
        System.out.println("========================Stream Concatenation===============================================");
        Stream.concat(map1.entrySet().stream(),map2.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(value1,value2)->new Employee(value2.getId(),value1.getName()))).forEach((v1,v2)-> System.out.println(v1+" "+v2.getId()));

        System.out.println("========================Stream of===============================================");
        Stream.of(map1,map2).flatMap(map->map.entrySet().stream()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->new Employee(v1.getId(),v2.getName()))).forEach((v1,v2)-> System.out.println(v1+" "+v2.getId()));

        System.out.println("========================Simple Streaming===============================================");

        map2.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(v1,v2)->new Employee(v1.getId(),v2.getName()),()->new HashMap<>(map1))).forEach((v1,v2)-> System.out.println(v1+" "+v2.getId()));


    }
}
