package C3StringExercise;

public class WordCounter {
	    public static int countWords(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            return 0;
	        }
	        String[] words = str.trim().split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) {
	        String input = "This is a string with multiple words.";
	        System.out.println("Word count: " + countWords(input)); // 7
	    }
	}

