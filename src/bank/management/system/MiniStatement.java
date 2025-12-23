package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class MiniStatement extends JFrame implements ActionListener {

    JButton exitButton;
    JLabel statementLabel, cardLabel, balanceLabel;

    MiniStatement(String pin) {
        super("Mini Statement");

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(400, 600);
        setLocation(20, 20);

        // Bank title
        JLabel bankTitle = new JLabel("Indian Bank");
        bankTitle.setBounds(150, 20, 200, 20);
        bankTitle.setFont(new Font("System", Font.BOLD, 16));
        add(bankTitle);

        // Card number label
        cardLabel = new JLabel();
        cardLabel.setBounds(20, 80, 350, 20);
        add(cardLabel);

        // Statement transactions
        statementLabel = new JLabel();
        statementLabel.setBounds(20, 140, 360, 200);
        statementLabel.setVerticalAlignment(SwingConstants.TOP);
        add(statementLabel);

        // Balance
        balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 350, 20);
        add(balanceLabel);

        // Exit button
        exitButton = new JButton("Exit");
        exitButton.setBounds(20, 500, 100, 25);
        exitButton.addActionListener(this);
        add(exitButton);

        // Fetch card number
        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from login where pin = '" + pin + "'");
            while (rs.next()) {
                String cardno = rs.getString("cardnumber");
                cardLabel.setText("Card Number: " + cardno.substring(0, 4) + "XXXXXXXX" + cardno.substring(12));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Fetch transactions & balance
        try {
            int balance = 0;
            StringBuilder sb = new StringBuilder("<html>");
            Conn c1 = new Conn();
            ResultSet rs = c1.s.executeQuery("SELECT * FROM bank where pin = '" + pin + "'");
            while (rs.next()) {
                sb.append(rs.getString("date"))
                  .append("&nbsp;&nbsp;&nbsp;")
                  .append(rs.getString("type"))
                  .append("&nbsp;&nbsp;&nbsp;Rs. ")
                  .append(rs.getString("amount"))
                  .append("<br><br>");

                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            sb.append("</html>");
            statementLabel.setText(sb.toString());
            balanceLabel.setText("Your total Balance is Rs " + balance);
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
