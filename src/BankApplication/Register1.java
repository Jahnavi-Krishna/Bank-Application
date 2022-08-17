package BankApplication;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Register1 extends JFrame {
    JLabel  t1, l1,l2, l3, l4;
    JTextField tf1, tf2, tf3, tf4;
    Register1() {
        setLayout(null);

        JLabel title = new JLabel("REGISTRATION");
        title.setFont(new Font("Raleway", Font.BOLD, 38));
        title.setBounds(200, 20, 600, 40);
        add(title);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("User Unique ID = " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 15));
        formno.setBounds(250, 75, 600, 20);
        add(formno);

        t1 = new JLabel("Kindly enter your details :");
        t1.setFont(new Font("Raleway", Font.BOLD, 25));
        t1.setBounds(125,105,375,30);
        add(t1);

        l1 = new JLabel("Full Name :");
        l1.setFont(new Font("Raleway", Font.BOLD, 15));
        l1.setBounds(125,158,375,20);
        add(l1);

        tf1 = new JTextField(25);
        tf1.setBounds(300,160,230,20);
        tf1.setFont(new Font("Arial", Font.BOLD, 15));
        add(tf1);

        l2 = new JLabel("Contact Number :");
        l2.setFont(new Font("Raleway", Font.BOLD, 15));
        l2.setBounds(125,198,375,20);
        add(l2);

        tf2 = new JTextField(25);
        tf2.setBounds(300,200,230,20);
        tf2.setFont(new Font("Arial", Font.BOLD, 15));
        add(tf2);

        l3 = new JLabel("Email Id :");
        l3.setFont(new Font("Raleway", Font.BOLD, 15));
        l3.setBounds(125,238,375,20);
        add(l3);

        tf3 = new JTextField(25);
        tf3.setBounds(300,240,230,20);
        tf3.setFont(new Font("Arial", Font.BOLD, 15));
        add(tf3);


        l4 = new JLabel("Password :");
        l4.setFont(new Font("Raleway", Font.BOLD, 15));
        l4.setBounds(125,278,375,20);
        add(l4);

        tf4 = new JTextField(25);
        tf4.setBounds(300,280,230,20);
        tf4.setFont(new Font("Arial", Font.BOLD, 15));
        add(tf4);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 15));
        next.setBounds(600, 350, 100, 25);
        add(next);

        getContentPane().setBackground(Color.white);

        setSize(800, 480);
        setLocation(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Register1();
    }
}
