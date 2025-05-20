package StringExercise;

public class WhitespaceRemover {

	    public static String removeWhitespace(String str) {
	        return str.replaceAll("\\s+", "");
	    }

	    public static void main(String[] args) {
	        String input = "  Java   Programming \n Language\t";
	        System.out.println("Without whitespace: '" + removeWhitespace(input) + "'");
	    }
	}


