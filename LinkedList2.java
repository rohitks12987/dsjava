import java.util.*;
public class LinkedList2 {
    public static void main(String[] args) {
        List<String> l1 = new LinkedList<String>();
        l1.add("Violet");
        l1.add("Indigo");
        l1.add("Blue");
        l1.add("Green");
        l1.add("Orange");
        l1.add("Yellow");
        l1.add("Red");
        System.out.println("Reverse Order");
        Iterator<String> i = ((LinkedList<String>)l1).descendingIterator(); 
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}