package C3StringExercise;

public class NumericChecker {
	    public static boolean isNumeric(String str) {
	        if (str == null || str.isEmpty()) {
	            return false;
	        }
	        for (char c : str.toCharArray()) {
	            if (!Character.isDigit(c)) {
	                return false;
	            }
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        String test1 = "123456";
	        String test2 = "abc123";
	        
	        System.out.println(isNumeric(test1)); // true
	        System.out.println(isNumeric(test2)); // false
	    }
	}

