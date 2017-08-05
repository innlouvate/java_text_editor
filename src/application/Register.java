package application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.sun.javafx.fxml.expression.Expression.add;

public class Register {

    JLabel userL = new JLabel("Choose a username: ");
    JTextField userTF = new JTextField();
    JLabel passL = new JLabel("Password");
    JPasswordField passTF = new JPasswordField();
    JLabel passLC = new JLabel("Confirm password");
    JPasswordField passC = new JPasswordField();
    JButton back = new JButton("Back");
    JButton register = new JButton("Register");

    public Register() {
        JPanel loginP = new JPanel();
        loginP.setLayout(new GridLayout(4,2));
        loginP.add(userL);
        loginP.add(userTF);
        loginP.add(passL);
        loginP.add(passTF);
        loginP.add(passLC);
        loginP.add(passC);
        back.addActionListener((ActionListener) this);
        register.addActionListener((ActionListener) this);
        loginP.add(back);
        loginP.add(register);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back) {
            Login login = (Login) getParent();
            login.cl.show(login, "login");

        }
        add(new Register(), "register");
    }

}
