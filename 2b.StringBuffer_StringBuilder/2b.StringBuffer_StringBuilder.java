package b2sbsf;

public class StringBufferandStringBuilder {
	public static void main(String[] args) {
        int iterations = 10000;
        String text = "AIET";

        // Testing StringBuffer
        StringBuffer buffer = new StringBuffer();
        long startBuffer = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            buffer.append(text);
        }
        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        // Testing StringBuilder
        StringBuilder builder = new StringBuilder();
        long startBuilder = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            builder.append(text);
        }
        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        // Output the results
        System.out.println("Performance Test Results for 10000 Appends:");
        System.out.println("Time taken by StringBuffer  : " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Justification
        if (timeBuilder < timeBuffer) {
            System.out.println("\n Justification:");
            System.out.println("StringBuilder is faster than StringBuffer.");
            System.out.println("Reason: StringBuilder is not synchronized, making it faster for single-threaded operations.");
        } else {
            System.out.println("\n Justification:");
            System.out.println("StringBuffer is faster or equal to StringBuilder in this case.");
            System.out.println("However, this is rare and may be due to JVM optimizations or system load.");
        }

        System.out.println("\n Conclusion:");
        System.out.println("Use StringBuilder for faster performance in single-threaded environments.");
        System.out.println("Use StringBuffer only when thread safety is required.");
    }



}
