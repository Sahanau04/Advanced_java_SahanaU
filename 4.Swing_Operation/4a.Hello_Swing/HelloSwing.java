package A4;
import javax.swing.*;
import java.awt.*;

public class HelloSwing{

	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Welcome Message");

	        // Create the label with the message
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming", SwingConstants.CENTER);

	        // Set font to plain, size 32, and color blue
	        label.setFont(new Font("Arial", Font.PLAIN, 32));
	        label.setForeground(Color.BLUE);

	        // Add label to the frame
	        frame.add(label);

	        // Set frame properties
	        frame.setSize(800, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLocationRelativeTo(null); // Center the frame
	        frame.setVisible(true);            // Show the frame
	    }
	}


