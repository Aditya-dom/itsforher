package swing;

import javax.swing.*;

public class SwingLibraryApp {
    public static void main(String[] args) {
        // Swing GUI code goes here
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Library Management - Swing");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
