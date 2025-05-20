package C5;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

public class addcountries extends JFrame {
	    // HashMap to store countries and their capitals
	    private HashMap<String, String> countryCapitals;

	    public addcountries() {
	        setTitle("Country and Capitals");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setSize(400, 300);
	        setLayout(new BorderLayout());

	        // Array of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada", "Denmark",
	            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
	        };

	        // Initialize the HashMap
	        countryCapitals = new HashMap<>();
	        countryCapitals.put("USA", "Washington, D.C.");
	        countryCapitals.put("India", "New Delhi");
	        countryCapitals.put("Vietnam", "Hanoi");
	        countryCapitals.put("Canada", "Ottawa");
	        countryCapitals.put("Denmark", "Copenhagen");
	        countryCapitals.put("France", "Paris");
	        countryCapitals.put("Great Britain", "London");
	        countryCapitals.put("Japan", "Tokyo");
	        countryCapitals.put("Africa", "Varies (e.g., Abuja for Nigeria, Cairo for Egypt)");
	        countryCapitals.put("Greenland", "Nuuk");
	        countryCapitals.put("Singapore", "Singapore");

	        // Create JList
	        JList<String> countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

	        // Add selection listener
	        countryList.addListSelectionListener(e -> {
	            if (!e.getValueIsAdjusting()) {
	                String selectedCountry = countryList.getSelectedValue();
	                String capital = countryCapitals.get(selectedCountry);
	                System.out.println("Capital of " + selectedCountry + " is: " + capital);
	            }
	        });

	        // Add JList inside JScrollPane
	        add(new JScrollPane(countryList), BorderLayout.CENTER);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> new addcountries());
	    }
	}



