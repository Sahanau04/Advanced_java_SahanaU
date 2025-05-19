package ArrayListprograms;

import java.util.*;

public class RemoveNthColor {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        int n = 2; 
        if (n < colors.size()) {
            colors.remove(n);
            System.out.println("After removing element at index " + n + ": " + colors);
        } else {
            System.out.println("Index out of range.");
        }
    }
}
