import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PalindromeChecker extends JFrame {
    private JTextField numberField;
    private JLabel resultLabel;

    public PalindromeChecker() {
        // Set up the frame
        setTitle("Palindrome Checker");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        JLabel numberLabel = new JLabel("Enter a number: ");
        numberField = new JTextField(10);
        JButton checkButton = new JButton("Check");
        resultLabel = new JLabel("Result will appear here");

        // Add components to frame
        add(numberLabel);
        add(numberField);
        add(checkButton);
        add(resultLabel);

        // Add action listener to button
        checkButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });

        // Set frame properties
        setSize(300, 150);
        setLocationRelativeTo(null);
    }

    private void checkPalindrome() {
        try {
            int number = Integer.parseInt(numberField.getText());
            int original = number;
            int reverse = 0;

            // Reverse the number
            while (number > 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number = number / 10;
            }

            // Check and display result
            if (original == reverse) {
                resultLabel.setText(original + " is a palindrome!");
            } else {
                resultLabel.setText(original + " is not a palindrome!");
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Please enter a valid number!");
        }
    }

    public static void main(String[] args) {
        // Run GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new PalindromeChecker().setVisible(true);
            }
        });
    }
}
