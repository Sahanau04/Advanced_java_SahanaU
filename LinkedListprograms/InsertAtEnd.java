package LinkedListprograms;
import java.util.*;
public class InsertAtEnd {
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue"));
	        System.out.println("Before adding: " + list);

	        list.offerLast("Pink");
	        System.out.println("After adding 'Pink' at the end: " + list);
	    }
	}

