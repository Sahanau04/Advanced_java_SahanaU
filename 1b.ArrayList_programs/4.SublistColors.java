package ArrayListprograms;

import java.util.*;

public class SublistColors {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        List<String> subColors = colors.subList(0, 2);
        System.out.println("Sublist (1st & 2nd): " + subColors);
    }
}
