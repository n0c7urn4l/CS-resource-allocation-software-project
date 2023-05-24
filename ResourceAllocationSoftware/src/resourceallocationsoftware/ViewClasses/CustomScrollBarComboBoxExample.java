package resourceallocationsoftware.ViewClasses;



import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;
import javax.swing.plaf.basic.BasicComboPopup;
import javax.swing.plaf.basic.BasicScrollBarUI;
import javax.swing.plaf.basic.ComboPopup;

public class CustomScrollBarComboBoxExample {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Custom Scroll Bar JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a custom JComboBox
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Option 1", "Option 2", "Option 3"});
        comboBox.setUI(new CustomComboBoxUI());
        
        // Add the JComboBox to the JFrame
        frame.getContentPane().add(comboBox);
        
        // Set the JFrame size and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    
    // Custom UI implementation for JComboBox
    static class CustomComboBoxUI extends BasicComboBoxUI {
        @Override
        protected ComboPopup createPopup() {
            // Create a custom BasicComboPopup with modified scroll bar
            return new BasicComboPopup(comboBox) {
                @Override
                protected JScrollPane createScroller() {
                    // Create a JScrollPane with a custom scroll bar
                    JScrollPane scrollPane = new JScrollPane(list, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
                            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
                    scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
                    return scrollPane;
                }
            };
        }
    }
    
    // Custom UI implementation for ScrollBar
    static class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            // Set custom colors for the scroll bar
            thumbColor = Color.GRAY;
            thumbHighlightColor = Color.LIGHT_GRAY;
            thumbDarkShadowColor = Color.DARK_GRAY;
            thumbLightShadowColor = Color.LIGHT_GRAY;
            trackColor = Color.WHITE;
            trackHighlightColor = Color.LIGHT_GRAY;
        }
    }
}
