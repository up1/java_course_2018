package democollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * package java.util
 * List
 * Set
 * Deque
 * Map
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
//        demo01.demoList();
//        demo01.demoMap();
        demo01.demoSet();
    }
    
    private void demoSet() {
        Set<String> names = new HashSet<>();
        names.add("n1");
        names.add("n1");
        names.add("n1");
        for (String name : names) {
            System.out.println(name);
        }
    }

    private void demoMap() {
        Map<String, Integer> names = new HashMap<>();
        names.put("n1", 20);
        names.put("n2", 30);
        names.put("n2", 40); // Duplication key
        names.put("n0", 20);
        names.containsKey("XXX");
        Set<String> keys = names.keySet();
        for (String key : keys) { // Iterate by key
            System.out.println(key +" = " + names.get(key));
        }
    }

    private void demoList() {
        System.out.println("Call demoList");
        // Generic
        List<String> names = new ArrayList<>();
        System.out.println(names.size());
        //Don't ArrayList<String> names = new ArrayList<>();
        names.add("Name1");
        names.add("Name2");
        
        for(Iterator<String> i = names.iterator(); i.hasNext();) {
            System.out.println(i.next());
        }
        for (String name : names) {
            System.out.println(name);
        }
        names.forEach(name -> System.out.println(name));
        names.forEach(System.out::println);
        
        
        
    }
}
