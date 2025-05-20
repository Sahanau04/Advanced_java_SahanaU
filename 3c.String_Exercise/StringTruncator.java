package C3StringExercise;

public class StringTruncator {
	    public static String truncate(String str, int length) {
	        if (str.length() <= length) {
	            return str;
	        }
	        return str.substring(0, length) + "...";
	    }

	    public static void main(String[] args) {
	        String input = "This is a long string example.";
	        System.out.println("Truncated: " + truncate(input, 10)); // This is a...
	    }
	}


