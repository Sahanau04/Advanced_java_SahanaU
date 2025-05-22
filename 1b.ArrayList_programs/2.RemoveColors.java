package ArrayListprograms;
import java.util.*;
public class RemoveColors {
	

	    public static void main(String[] args) {
	        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
	        System.out.println("Original Colors: " + colors);
	        colors.remove(1); // Removes 2nd element
	        colors.remove("Blue");
	        System.out.println("After removal: " + colors);
	    }
	}


