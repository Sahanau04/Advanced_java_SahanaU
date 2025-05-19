package LinkedListprograms;
import java.util.*;
public class DisplayPositions {
	
	    public static void main(String[] args) {
	        LinkedList<String> list = new LinkedList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));

	        System.out.println("Elements with their positions:");
	        for (int i = 0; i < list.size(); i++) {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }
	}

