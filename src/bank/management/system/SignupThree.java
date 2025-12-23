package bank.management.system;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    
    ButtonGroup acctypegroup;
    
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    
    JButton b1,b2;
    
    String formno;
    
    SignupThree(String formno){
        
        setLayout(null);
        
        setVisible(true);

        this.formno = formno;

     
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        JLabel accountDeatils = new JLabel("Page 3: Account Details");
        accountDeatils.setFont(new Font("Raleway",Font.BOLD,22));
        accountDeatils.setBounds(280,40,400,40);
        add(accountDeatils);
        
        
        JLabel type = new JLabel("Account Type : ");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100,180,150,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        
        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setBounds(350,180,300,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        
        r3 = new JRadioButton("Current Account");
        r3.setBounds(100,220,250,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        
        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setBounds(350,220,250,20);
        r4.setBackground(Color.WHITE);
        add(r4);
        
        acctypegroup = new ButtonGroup();
        acctypegroup.add(r1);
        acctypegroup.add(r2);
        acctypegroup.add(r3);
        acctypegroup.add(r4);
        
        JLabel card = new JLabel("Card Number : ");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cnumber = new JLabel("Your 16 digit card number ");
        cnumber.setFont(new Font("Raleway",Font.BOLD,12));
        cnumber.setBounds(100,330,300,20);
        add(cnumber);
        
        JLabel pin = new JLabel("PIN : ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel pindetail = new JLabel("Your 4 digit password ");
        pindetail.setFont(new Font("Raleway",Font.BOLD,12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel services = new JLabel("Services required :");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,300,30);
        add(services);
        
        JLabel formNumber = new JLabel("Form No:");
        formNumber.setFont(new Font("Raleway", Font.BOLD, 14));
        
        JLabel fnumber = new JLabel(formno);
        fnumber.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(250,720,100,30);
        add(b1);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(420,720,100,30);
        add(b2);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",true);
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100,680,600,20);
        add(c7);

       
        
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        
        
        
        
        
        
        
        
        
        getContentPane().setBackground(Color.white);
        
        setSize(850,820);
        setLocation(350,10);
        setVisible(true);
    
    }
    
     @Override
    public void actionPerformed(ActionEvent ae) {
        
        if(ae.getSource() == b1){
            
            String accountType = null;
            
            if(r1.isSelected()){
                
               accountType = "Saving Account";
            }
            else if(r2.isSelected()){
                
               accountType = "Fixed Deposite Account";
            }
            else if(r3.isSelected()){
                
               accountType = "Current Account";
            }
            else if(r4.isSelected()){
                
               accountType = "Recurring Deposite Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = ""+Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            
            if(c1.isSelected()){
                facility = facility + " ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + " Internet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + " EMAIL Alert";
            }
            else if(c5.isSelected()){
                facility = facility + " Cheque Book";
            }
            else if(c6.isSelected()){
                facility = facility + " E-Statement";
            }
           
            try{
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is required");
                }
                else{
                    Conn c = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    
                    String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')"; 
                    
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                     
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardnumber+"\n Pin : "+pinnumber);
                    
                    setVisible(false);
                    new Deposite(pinnumber).setVisible(true);
                    
                    
           
                }
            }
            catch(Exception e){
                e.printStackTrace();
            }
            
            
          } else if(ae.getSource() == b2){
              
              
              setVisible(false);
              new Login().setVisible(true);
              
            
            }
        }
    public static void main(String[] args) 
    {
        new SignupThree("");
    }

   
    
}
