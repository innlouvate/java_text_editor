package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JPanel implements ActionListener {

    JLabel userL = new JLabel("Username: ");
    JTextField userTF = new JTextField();
    JLabel passL = new JLabel("Password: ");
    JPasswordField passTF = new JPasswordField();
    JPanel loginP = new JPanel(new GridLayout(3,2));
    JPanel panel = new JPanel();
    JButton loginB = new JButton("Login");
    JButton register = new JButton("Register");
    CardLayout cl;

    Login() {
        setLayout(new CardLayout());
        loginP.add(userL);
        loginP.add(userTF);
        loginP.add(passL);
        loginP.add(passTF);
        loginB.addActionListener(this);
        register.addActionListener(this);
        loginP.add(loginB);
        loginP.add(register);
        panel.add(loginP);
        add(panel, "login");
        cl = (CardLayout) getLayout();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        add(new Register(), "register");
        cl.show(this, "register");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Text editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        Login login = new Login();
        frame.add(login);
        frame.setVisible(true);
    }
}
