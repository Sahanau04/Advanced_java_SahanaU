package StringExercise;

public class NullOrEmpty {
	    public static boolean isNullOrEmpty(String str) {
	        return str == null || str.trim().isEmpty();
	    }

	    public static void main(String[] args) {
	        String test1 = "   ";
	        String test2 = null;
	        String test3 = "Hello";

	        System.out.println(isNullOrEmpty(test1)); // true
	        System.out.println(isNullOrEmpty(test2)); // true
	        System.out.println(isNullOrEmpty(test3)); // false
	    }
	}


