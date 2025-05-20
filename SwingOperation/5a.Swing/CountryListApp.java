package A5;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
public class CountryListApp {
	    public static void main(String[] args) {
	        // Create the frame
	        JFrame frame = new JFrame("Country List");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(400, 300);

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa",
	            "Greenland", "Singapore"
	        };

	        // Create JList with country names
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        JScrollPane scrollPane = new JScrollPane(countryList);

	        // Add selection listener
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selected = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selected) {
	                        System.out.println(country);
	                    }
	                    System.out.println("----------------------");
	                }
	            }
	        });

	        // Add components to frame
	        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
	        frame.setVisible(true);
	    }
	}


