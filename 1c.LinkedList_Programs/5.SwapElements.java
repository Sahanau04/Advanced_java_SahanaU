package LinkedListprograms;
import java.util.*;
public class SwapElements {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
	        System.out.println("Before swapping: " + list);

	        Collections.swap(list, 0, 2); // Swaps first (0) and third (2)
	        System.out.println("After swapping first and third elements: " + list);
	    }
	}


