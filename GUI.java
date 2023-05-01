import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordLabel;
    private static JPasswordField passwordText;
    private static JButton button;
    private static JLabel success;
 
    public static void main(String[] args){

        JFrame frame = new JFrame("SimianStock");
        JPanel panel = new JPanel();
        frame.setSize(350,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        
        panel.setLayout(null);

        userLabel = new JLabel("Usuário");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        passwordLabel = new JLabel("Senha");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new GUI());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);



        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        String user = userText.getText();
        String password = passwordText.getText();

        if(user.equals("Monkey") && password.equals("macaquito123")){
            success.setText("Acesso bem sucedido!");
        }

    }

}
