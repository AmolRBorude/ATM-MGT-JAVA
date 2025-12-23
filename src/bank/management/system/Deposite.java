package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Deposite extends JFrame implements ActionListener{
    
    JLabel l1;
    
    JTextField amount;
    
    JButton deposite,back;
    
    String pin;
    
    
    
    Deposite(String pin){
        
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(170,300,400,20);
        image.add(l1);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170,350,320,20);
        image.add(amount);
        
        deposite = new JButton("DEPOSIT");
        deposite.setBounds(355,465,150,30);
        deposite.addActionListener(this);
        image.add(deposite);
      
        
        back = new JButton("BACK");
        back.setBounds(355,500,150,30);
        back.addActionListener(this);
        image.add(back);

        
        
        getContentPane().setBackground(Color.white);
        
        setSize(900,900);
        setVisible(true);
        setLocation(300,0);
        setLayout(null);
  
        
    
    
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == deposite){
            
            String number = amount.getText();
            Date  date = new Date();
            
            if(number.equals("")){
                
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposite !");
            }
             else{
                try{
                    Conn c1 = new Conn();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'Deposit', '"+number+"')";
                    c1.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Deposited Successfully");
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
              }
           
            
        }
        else if(ae.getSource() == back){
            
            setVisible(false);
            new Transactions(pin).setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        new Deposite("");
        
    }
    
}
