package Set;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Hashtable {
    
    public static void main(String[] args) {
        
        Map<String, Integer> mapList = new HashMap<>();
        mapList.put("One", 1);
        mapList.put("Two", 2);
        mapList.put("Three", 3);
        mapList.put("Four", 4);
        mapList.put("Five", 5);

        System.err.println(mapList);
        
        Set<String> keys = mapList.keySet();
        System.err.println("Only the Keys are Printed: " + keys);

        Collection<Integer> values = mapList.values();
        System.err.println("The Values only Printed: " +  values);

        
    }
}
