package B4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtonDemo {
	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Country Button Press");
	        frame.setSize(400, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());
	        // Create label to display message
	        JLabel messageLabel = new JLabel("Press a button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 18));
	        // Create buttons
	        JButton indiaButton = new JButton("India");
	        JButton srilankaButton = new JButton("Srilanka");

	        // Add action listeners for the buttons
	        indiaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });
	        srilankaButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });
	        // Add components to the frame
	        frame.add(indiaButton);
	        frame.add(srilankaButton);
	        frame.add(messageLabel);

	        // Center the frame and make it visible
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);
	    }
	}


