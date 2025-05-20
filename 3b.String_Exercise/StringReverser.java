package StringExercise;

public class StringReverser {
	    public static String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public static void main(String[] args) {
	        String original = "Java";
	        System.out.println("Reversed: " + reverseString(original)); // avaJ
	    }
	}

 
