package Set;

import java.util.HashSet;
import java.util.Set;

public class Hashset {
   public static void main(String[] args) {
    Set<String> list = new HashSet<String>();
    list.add("Java");
    list.add("Python");
    list.add("Java");// It cannot contains duplicate value
    list.add("ES6");
    list.add("React JS");
    
    for(String courses: list){
        System.out.print(" " + courses);
    }
   }

}
