package D5;
import javax.swing.*;
import java.awt.*;

public class Tabbedpane extends JFrame {
	    public Tabbedpane() {
	        setTitle("Tabbed Pane: Cyan, Magenta, Yellow");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Create tabbed pane
	        JTabbedPane tabbedPane = new JTabbedPane();

	        // Create panels with specific background colors
	        JPanel cyanPanel = new JPanel();
	        cyanPanel.setBackground(Color.CYAN);

	        JPanel magentaPanel = new JPanel();
	        magentaPanel.setBackground(Color.MAGENTA);

	        JPanel yellowPanel = new JPanel();
	        yellowPanel.setBackground(Color.YELLOW);

	        // Add tabs to the tabbed pane
	        tabbedPane.addTab("Cyan", cyanPanel);
	        tabbedPane.addTab("Magenta", magentaPanel);
	        tabbedPane.addTab("Yellow", yellowPanel);

	        // Add tabbed pane to frame
	        add(tabbedPane);

	        setVisible(true);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater( Tabbedpane::new);
	    }
	}



