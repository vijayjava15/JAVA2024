package multithreading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LoginPage extends JFrame implements ActionListener {

    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton submitButton, b2, b3;

    private JTextArea responseArea; // JTextArea to display the response



    public static void main(String[] args) {

        new LoginPage().setVisible(true);
    }

    public LoginPage(){
        setTitle("Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(600, 300, 600, 400);

        panel = new JPanel();
        setContentPane(panel);
        panel.setLayout(null);


        JLabel bookName = new JLabel("book name");
        bookName.setBounds(124, 89, 195, 24);
        panel.add(bookName);
        textField = new JTextField();
        textField.setBounds(210, 93, 157, 20);
        panel.add(textField);
        submitButton = new JButton("submit");
        submitButton.addActionListener(this);
        submitButton.setForeground(new Color(46, 139, 87));
        submitButton.setBackground(new Color(250, 250, 210));
        submitButton.setBounds(149, 181, 93, 30);
        panel.add(submitButton);


        responseArea = new JTextArea();
        responseArea.setBounds(50, 220, 500, 100); // Size and position of JTextArea
        responseArea.setEditable(false); // Set to non-editable
        responseArea.setLineWrap(true);  // Optional: Allow wrapping
        panel.add(responseArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getSource() == submitButton){
         String query = textField.getText(); // Replace with your search query
         String apiUrl = "https://openlibrary.org/search.json?q=" + query.replace(" ", "+");

         try {
             // Establish HTTP connection
             URL url = new URL(apiUrl);
             HttpURLConnection connection = (HttpURLConnection) url.openConnection();
             connection.setRequestMethod("GET");
             connection.setRequestProperty("Accept", "application/json");

             // Read the response
             BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
             String line;
             StringBuilder response = new StringBuilder();
             while ((line = reader.readLine()) != null) {
                 response.append(line);
             }
             reader.close();

             // Print the response
             System.out.println("Response: " + response.toString());
             responseArea.setText(response.toString());
         } catch (Exception ex) {
             ex.printStackTrace();
         }
     }
    }
}
