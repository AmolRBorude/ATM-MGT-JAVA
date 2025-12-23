package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;

class BalanceEnquiry extends JFrame implements ActionListener {

    JButton b1;
    JLabel l1;
    String pin;

    BalanceEnquiry(String pin) {
        this.pin = pin;

        // Background image
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel background = new JLabel(i3);
        background.setBounds(0, 0, 900, 900);
        add(background);

        // Back button
        b1 = new JButton("BACK");
        b1.setBounds(355, 520, 150, 30);
        background.add(b1);

        setLayout(null);

        // Fetch balance from DB
        Conn c = new Conn();
        int balance = 0;
        try {
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pin + "'");
            while (rs.next())
            {
                if (rs.getString("type").equals("Deposit")) 
                {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Balance label
        l1 = new JLabel("Your Current Account Balance is Rs " + balance);
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(170, 300, 400, 30);
        background.add(l1);

        b1.addActionListener(this);

        // Frame settings
        setSize(900, 900);
        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("").setVisible(true);
    }
}
