package bank.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField panTextField,aadharTextField;
    
    JButton next;
    
    JComboBox religion,category,income,education,occupation;
    
    JRadioButton syes,sno,eyes,eno;
    
    ButtonGroup citizengroup,existgroup;
  
    String formno;
    
    
  
     
     
    public SignupTwo(String formno) {
        
        
        setLayout(null);
        
        this.formno = formno;
        
 
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        JLabel additionalDeatils = new JLabel("Page 2: Additional Details");
        additionalDeatils.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDeatils.setBounds(290,80,400,30);
        add(additionalDeatils);
        
        JLabel name = new JLabel("Religion :");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valreligion[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        religion = new JComboBox(valreligion);
        religion.setBackground(Color.WHITE);
        religion.setFont(new Font("Raleway", Font.BOLD, 14));
        religion.setBounds(300,140,400,30);
        add(religion);
        
        JLabel fname = new JLabel("Category :");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[] = {"General","OBC","SC","ST","Other"};
        category = new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        category.setFont(new Font("Raleway", Font.BOLD, 14));
        add(category);
        
        JLabel dob = new JLabel("Income :");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String valIncome[] = {"Null","< 1,50,000","< 2,50,00","< 5,00,00","Upto 10,00,000"};
        income = new JComboBox(valIncome);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        income.setFont(new Font("Raleway", Font.BOLD, 14));
        add(income);
        
        JLabel gender = new JLabel("Educational ");
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
       
        JLabel email = new JLabel("Qualification :");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        

        String valEducation[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        education = new JComboBox(valEducation);
        education.setBounds(300,315,400,30);
        education.setBackground(Color.WHITE);
        education.setFont(new Font("Raleway", Font.BOLD, 14));
        add(education);
        
        JLabel marital = new JLabel("Occupation :");
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,200,30);
        add(marital);
        
        String valOccupation[] = {"Farmer","Salaried","Self-Employed","Bussiness","Student","Others"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        occupation.setFont(new Font("Raleway", Font.BOLD, 14));
        add(occupation);
        
        
        JLabel address = new JLabel("Pan No :");
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        panTextField.setBounds(300,440,400,30);
        add(panTextField);
        
        JLabel city = new JLabel("Aadhar No :");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        aadharTextField.setBounds(300,490,400,30);
        add(aadharTextField);
        
        JLabel state = new JLabel("Senior Citizen :");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        citizengroup = new ButtonGroup();
        citizengroup.add(syes);
        citizengroup.add(sno);
        
        JLabel pincode = new JLabel("Exisiting Account:");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setBounds(450,590,60,30);
        eno.setBackground(Color.WHITE);
        add(eno);
        
        existgroup = new ButtonGroup();
        existgroup.add(syes);
        existgroup.add(sno);
        

        next = new JButton("Next");
        next.setBounds(620,660,80,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
    
                
                
        getContentPane().setBackground(Color.white);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        
      
        
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        
        String sreligion = (String) religion.getSelectedItem();
        String scatogory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seducaton = (String) education.getSelectedItem();
        
        String citizen = null;
        
        if(syes.isSelected())
        {
           citizen = "Yes";
        }else if(sno.isSelected()){
           citizen = "No";
        }
       
        String existing = null;
        
        if(eyes.isSelected()){
            
            existing = "Yes";
        }
        else if(eno.isSelected()){
            existing = "No";
        }

        
        try{
            
            if(pan.equals("")){
                JOptionPane.showMessageDialog(null,"Pan No. is required");
            }
            else if(aadhar.equals("")){
                JOptionPane.showMessageDialog(null,"Aadhar No. is required");
            }
            else if(citizen == null){
                JOptionPane.showMessageDialog(null,"Citizen is required");
            }
            else if(existing == null){
                JOptionPane.showMessageDialog(null,"please fill all the field");
            }
            else if(sincome.equals("")){
                JOptionPane.showMessageDialog(null,"State is required");
            }
            else if(soccupation.equals("")){
                JOptionPane.showMessageDialog(null,"Pin Code  is required");
            }
            else if(sreligion.equals("")){
                JOptionPane.showMessageDialog(null,"DOB  is required");
            }
            else if(scatogory.equals("")){
                JOptionPane.showMessageDialog(null,"Email Address is required");
            }
            else if(seducaton.equals("")){
                JOptionPane.showMessageDialog(null,"Education is required");
            }
            else{
                
                Conn c = new Conn();
            
                String query = "insert into signuptwo values('"+formno+"','" + sreligion + "','" + scatogory + "','"+sincome+"','"+seducaton+"','"+soccupation+"','"+pan+"','"+aadhar+"','"+citizen+"','"+existing+"')";
                
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            }
            
            
        }catch(Exception e){
            
            e.printStackTrace();
            
        }

    }
    public static void main(String args[]){
        
        new SignupTwo("");
    }  

    
}
