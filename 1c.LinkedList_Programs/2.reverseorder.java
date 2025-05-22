package LinkedListprograms;
import java.util.*;
public class reverseorder {
	

	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
	        System.out.println("Original list: " + list);

	        Iterator<String> descIterator = list.descendingIterator();
	        System.out.println("Iterating in reverse order:");
	        while (descIterator.hasNext()) {
	            System.out.println(descIterator.next());
	        }
	    }
}
