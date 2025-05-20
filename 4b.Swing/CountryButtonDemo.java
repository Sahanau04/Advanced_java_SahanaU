package B4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CountryButtonDemo {
	    public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Country Button Demo");
	        frame.setSize(400, 200);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Create buttons
	        JButton btnIndia = new JButton("India");
	        JButton btnSrilanka = new JButton("Srilanka");

	        // Create label to display the message
	        JLabel messageLabel = new JLabel("Press a button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Add action listeners for the buttons
	        btnIndia.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("India is pressed");
	            }
	        });

	        btnSrilanka.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Srilanka is pressed");
	            }
	        });

	        // Add components to the frame
	        frame.add(btnIndia);
	        frame.add(btnSrilanka);
	        frame.add(messageLabel);

	        // Show the frame
	        frame.setVisible(true);
	    }
	}


