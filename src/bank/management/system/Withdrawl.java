package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    
    JLabel l1;
    
    JTextField amount;
    
    JButton withdraw,back;
    
    String pin;
    
    
    
    Withdrawl(String pin){
        
        this.pin = pin;
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        l1 = new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System", Font.BOLD, 16));
        l1.setBounds(155,300,400,20);
        image.add(l1);
        
        amount = new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(170,350,320,20);
        image.add(amount);
        
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(355,465,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
      
        
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
        
        if(ae.getSource() == withdraw){
            
            String number = amount.getText();
            Date  date = new Date();
            
            if(number.equals("")){
                
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw !");
            }
             else{
                try{
                    Conn c1 = new Conn();
                    String query = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawl', '"+number+"')";
                    c1.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrawl Successfully");
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
        new Withdrawl("");
        
    }
    
}
