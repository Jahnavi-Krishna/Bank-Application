package BankApplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

    JButton login, register;

    Home() {
        setTitle("BANK APPLICATION");

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("BankApplication\\icons\\logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(50, 10, 100, 100);
        add(label);

        JLabel text = new JLabel("Welcome to Apna Bank!");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200, 40, 500, 40);
        add(text);

        JLabel text2 = new JLabel("Select an option : ");
        text2.setFont(new Font("Osward", Font.BOLD, 30));
        text2.setBounds(280, 140, 500, 35);
        add(text2);

        login = new JButton("Login");
        login.setBounds(300, 200, 200, 35);
//        login.setBackground(Color.BLACK);
//        login.setForeground(Color.white);
//        login.addActionListener(this);
        add(login);

        register = new JButton("Register");
        register.setBounds(300, 250, 200, 35);
//        register.addActionListener(this);
        add(register);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setVisible(true);
        setLocation(500, 200);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == login){

        } else if(ae.getSource() == register) {

        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
