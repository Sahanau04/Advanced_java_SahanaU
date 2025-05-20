package StringExercise;

public class PalindromeChecker {
	    public static boolean isPalindrome(String str) {
	        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        String reversed = new StringBuilder(cleaned).reverse().toString();
	        return cleaned.equals(reversed);
	    }

	    public static void main(String[] args) {
	        String test1 = "A man, a plan, a canal: Panama";
	        String test2 = "Hello";

	        System.out.println(isPalindrome(test1)); // true
	        System.out.println(isPalindrome(test2)); // false
	    }
	}


