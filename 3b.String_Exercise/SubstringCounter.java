package StringExercise;

public class SubstringCounter {
	    public static int countOccurrences(String mainStr, String subStr) {
	        int count = 0, index = 0;
	        while ((index = mainStr.indexOf(subStr, index)) != -1) {
	            count++;
	            index += subStr.length();
	        }
	        return count;
	    }

	    public static void main(String[] args) {
	        String main = "hellohellohello";
	        String sub = "hello";

	        System.out.println("Occurrences: " + countOccurrences(main, sub)); // 3
	    }
	}


