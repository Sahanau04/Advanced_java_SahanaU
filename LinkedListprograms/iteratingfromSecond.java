package LinkedListprograms;
import java.util.*;

public class iteratingfromSecond {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
	        System.out.println("Original list: " + list);

	        // Start from index 1 (i.e., second element)
	        ListIterator<String> iterator = list.listIterator(1);
	        System.out.println("Iterating from second element:");
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }
	}


