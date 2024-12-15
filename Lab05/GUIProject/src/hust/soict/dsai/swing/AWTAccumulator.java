package hust.soict.dsai.swing;
import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
    private TextField tfInput;
    private TextField tfOutput;
    private int sum = 0; // Initialize accumulated sum to 0

    // Constructor to set up the GUI components and event handlers
    public AWTAccumulator() {
        setLayout(new GridLayout(2, 2));

        // Input Label and TextField
        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        // Output Label and TextField
        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false); // Make the output TextField non-editable
        add(tfOutput);

        // Frame settings
        setTitle("AWT Accumulator");
        setSize(350, 120);
        setVisible(true);
    }

    // Main method to launch the application
    public static void main(String[] args) {
        new AWTAccumulator();
    }

    // Inner class to handle ActionEvents for the input TextField
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Retrieve input, parse it as an integer, and update the sum
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");
            tfOutput.setText(sum + "");
        }
    }
}
