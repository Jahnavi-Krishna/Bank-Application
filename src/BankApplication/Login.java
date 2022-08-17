
package BankApplication;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Login extends JFrame {
    JLabel l1,l2;
    JTextField tf1;
    JPasswordField pf2;

    Login() {
        setLayout(null);

        JLabel title = new JLabel("LOGIN");
        title.setFont(new Font("Raleway", Font.BOLD, 38));
        title.setBounds(320, 50, 600, 40);
        add(title);


        l1 = new JLabel("Unique ID:");
        l1.setFont(new Font("Raleway", Font.BOLD, 28));
        l1.setBounds(125,150,375,30);
        add(l1);

        tf1 = new JTextField(15);
        tf1.setBounds(300,150,230,30);
        tf1.setFont(new Font("Arial", Font.BOLD, 14));
        add(tf1);

        l2 = new JLabel("PIN:");
        l2.setFont(new Font("Raleway", Font.BOLD, 28));
        l2.setBounds(125,220,375,30);
        add(l2);

        pf2 = new JPasswordField(15);
        pf2.setFont(new Font("Arial", Font.BOLD, 14));
        pf2.setBounds(300,220,230,30);
        add(pf2);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setLocation(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();
    }
}