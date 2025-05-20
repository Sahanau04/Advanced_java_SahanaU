package C3StringExercise;
import java.util.Random;
public class RandomStringGenerator {
	    public static String generateRandomString(int length) {
	        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	        StringBuilder randomString = new StringBuilder();
	        Random rand = new Random();

	        for (int i = 0; i < length; i++) {
	            int index = rand.nextInt(characters.length());
	            randomString.append(characters.charAt(index));
	        }

	        return randomString.toString();
	    }

	    public static void main(String[] args) {
	        int length = 10;
	        System.out.println("Random String: " + generateRandomString(length)); // Example: "1a2B3C4D5E"
	    }
	}


