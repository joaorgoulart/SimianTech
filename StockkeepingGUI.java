import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StockkeepingGUI extends JFrame implements ActionListener {

    // Declare GUI components
    private JLabel nameLabel, quantityLabel, priceLabel;
    private JTextField nameTextField, quantityTextField, priceTextField;
    private JButton addButton, clearButton;

    public StockkeepingGUI() {

        // Set the window title and size
        setTitle("Agricultural Company Stockkeeping");
        setSize(400, 200);

        // Create a panel to hold the GUI components
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        // Add the GUI components to the panel
        nameLabel = new JLabel("Product Name:");
        panel.add(nameLabel);
        nameTextField = new JTextField(20);
        panel.add(nameTextField);

        quantityLabel = new JLabel("Quantity:");
        panel.add(quantityLabel);
        quantityTextField = new JTextField(20);
        panel.add(quantityTextField);

        priceLabel = new JLabel("Price:");
        panel.add(priceLabel);
        priceTextField = new JTextField(20);
        panel.add(priceTextField);

        addButton = new JButton("Add to Inventory");
        addButton.addActionListener(this);
        panel.add(addButton);

        clearButton = new JButton("Clear Fields");
        clearButton.addActionListener(this);
        panel.add(clearButton);

        // Add the panel to the frame
        add(panel);

        // Set the window to be visible
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {

            // Retrieve data from the text fields
            String name = nameTextField.getText();
            int quantity = Integer.parseInt(quantityTextField.getText());
            double price = Double.parseDouble(priceTextField.getText());

            // Add the data to the inventory database
            // ... code to add data to the inventory database ...

            // Clear the text fields
            nameTextField.setText("");
            quantityTextField.setText("");
            priceTextField.setText("");

        } else if (e.getSource() == clearButton) {

            // Clear the text fields
            nameTextField.setText("");
            quantityTextField.setText("");
            priceTextField.setText("");

        }

    }

    public static void main(String[] args) {
        StockkeepingGUI gui = new StockkeepingGUI();
    }

}