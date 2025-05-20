package helloswing;
import javax.swing.*;
import java.awt.*;

public class Helloswing {
	    public static void main(String[] args) {
	        // Create a JFrame
	        JFrame frame = new JFrame("Swing Hello Program");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 200);
	        frame.setLayout(new FlowLayout());

	        // Create a JLabel with message
	        JLabel label = new JLabel("Hello! VI C, Welcome to Swing Programming");

	        // Set font: plain, size 32
	        label.setFont(new Font("Serif", Font.PLAIN, 32));

	        // Set text color to blue
	        label.setForeground(Color.BLUE);

	        // Add label to frame
	        frame.add(label);

	        // Set frame visibility
	        frame.setVisible(true);
	    }
	}
