package C3StringExercise;

public class capitalizeWords {
	    public static String capitalizeWords(String str) {
	        String[] words = str.split("\\s+");
	        StringBuilder capitalized = new StringBuilder();

	        for (String word : words) {
	            if (!word.isEmpty()) {
	                capitalized.append(Character.toUpperCase(word.charAt(0)))
	                        .append(word.substring(1).toLowerCase())
	                        .append(" ");
	            }
	        }
	        return capitalized.toString().trim();
	    }

	    public static void main(String[] args) {
	        String input = "java programming language";
	        System.out.println("Capitalized: " + capitalizeWords(input)); // Java Programming Language
	    }
	}


