package map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTest {
    public static void main(String[] args) {
        Map<String,Employee> staff=new LinkedHashMap<>();
        staff.put("a", new Employee("aaa"));
        staff.put("b", new Employee("bbb"));
        staff.put("c", new Employee("ccc"));
        Iterator<String> iterator=staff.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Iterator<Employee> iterator2=staff.values().iterator();
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
