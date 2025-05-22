package C4;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class clockandhour extends JFrame implements ActionListener {
	    JButton digitalClockButton, hourGlassButton;
	    JLabel messageLabel;

	    public clockandhour() {
	        setTitle("Clock Button Demo");
	        setSize(400, 300);
	        setLayout(new FlowLayout());

	        // Load images (ensure the image files are in the same directory or use full path)
	        ImageIcon digitalIcon = new ImageIcon("digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("hour_glass.png");

	        // Buttons with images
	        digitalClockButton = new JButton("Digital Clock", digitalIcon);
	        hourGlassButton = new JButton("Hour Glass", hourGlassIcon);

	        // Label to show message
	        messageLabel = new JLabel("Click a button...");

	        // Add action listeners
	        digitalClockButton.addActionListener(this);
	        hourGlassButton.addActionListener(this);

	        // Add components to the frame
	        add(digitalClockButton);
	        add(hourGlassButton);
	        add(messageLabel);

	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setVisible(true);
	    }

	    @Override
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == digitalClockButton) {
	            messageLabel.setText("Digital Clock is pressed");
	        } else if (e.getSource() == hourGlassButton) {
	            messageLabel.setText("Hour Glass is pressed");
	        }
	    }

	    public static void main(String[] args) {
	        // Run GUI in the Event Dispatch Thread
	        SwingUtilities.invokeLater(() -> new clockandhour());
	    }
	}

