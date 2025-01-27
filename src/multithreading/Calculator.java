package calculator;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    public static void main(String[] args) {
        new Calculator().setVisible(true);
    }

    public Calculator() {
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 300, 400);
        setLayout(null);

        // Panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));
        panel.setBounds(30, 80, 240, 250);
        add(panel);

        // TextField
        JTextField displayField = new JTextField();
        displayField.setBounds(30, 30, 240, 40);
        displayField.setFont(new Font("Arial", Font.BOLD, 20));
        displayField.setHorizontalAlignment(JTextField.RIGHT);
        add(displayField);

        // Buttons
        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        for (String button : buttons) {
            JButton btn = new JButton(button);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            panel.add(btn);
        }

        // Additional button for "Clear"
        JButton clearButton = new JButton("C");
        clearButton.setFont(new Font("Arial", Font.PLAIN, 18));
        clearButton.setBounds(30, 330, 240, 40);
        add(clearButton);

        // Set Layout Manager
        setLayout(null);
    }
}
