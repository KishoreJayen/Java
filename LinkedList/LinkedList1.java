package LinkedList;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>();

        list.add(30);
        list.add(40);
        list.addLast(10);
        list.addFirst(20);

        System.out.println("Before Sorting"  + list);
        list.sort((a,b) -> a.compareTo(b));
        System.out.println("After Sorting" + list);
        list.removeLast();
        System.err.println(list);
       
        for(int count: list){
            System.out.print(" " + count);
        }

    }
}
