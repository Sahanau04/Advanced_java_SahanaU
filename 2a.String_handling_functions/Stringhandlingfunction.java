package Stringhandlingfunction;

public class Stringhandlingfunction {
	    public static void main(String[] args) {
	        // 1. String Creation and Basic Operations
	        String str1 = "Hello";
	        String str2 = "World";
	        System.out.println("String 1: " + str1);
	        System.out.println("String 2: " + str2);

	        // 2. Length and Character Access
	        System.out.println("Length of str1: " + str1.length());
	        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

	        // 3. String Comparison
	        String str3 = "hello";
	        System.out.println("str1.equals(str3): " + str1.equals(str3));
	        System.out.println("str1.equalsIgnoreCase(str3): " + str1.equalsIgnoreCase(str3));

	        // 4. String Searching
	        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
	        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));

	        // 5. Substring Operations
	        System.out.println("Substring from index 1 to 4 in str1: " + str1.substring(1, 4));

	        // 6. String Modification
	        String str4 = str1.replace("l", "x");
	        System.out.println("After replacing 'l' with 'x': " + str4);

	        // 7. Whitespace Handling
	        String strWithSpace = "  Java Programming  ";
	        System.out.println("Original: '" + strWithSpace + "'");
	        System.out.println("After trim(): '" + strWithSpace.trim() + "'");

	        // 8. String Concatenation
	        String fullStr = str1.concat(" ").concat(str2);
	        System.out.println("Concatenated String: " + fullStr);

	        // 9. String Splitting
	        String fruits = "Apple,Banana,Orange";
	        String[] fruitArray = fruits.split(",");
	        System.out.println("Splitted fruits:");
	        for (String fruit : fruitArray) {
	            System.out.println(fruit);
	        }

	        // 10. StringBuilder Demo
	        StringBuilder sb = new StringBuilder("Hello");
	        sb.append(" Java");
	        sb.insert(5, " World");
	        sb.replace(6, 11, "Programmer");
	        sb.delete(0, 5);
	        System.out.println("StringBuilder result: " + sb.toString());

	        // 11. String Formatting
	        String name = "Sahana";
	        int age = 22;
	        String formatted = String.format("Name: %s, Age: %d", name, age);
	        System.out.println("Formatted String: " + formatted);

	        // 12. Validate Email with contains(), startsWith(), endsWith()
	        String email = "example@gmail.com";
	        System.out.println("Email: " + email);
	        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
	            System.out.println("Valid email format");
	        } else {
	            System.out.println("Invalid email format");
	        }
	    }
	}
