package traveling.Managment.System;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class signup extends JFrame implements ActionListener {
    JTextField  tfusername,tfname,tfpassword,tfanswer;
    JButton create,back;
    Choice security;
    signup()
    {
        setBounds(350,200,900,360);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);

        JLabel lbusername=new JLabel("User Name");
        lbusername.setFont(new Font("Tahoma",Font.CENTER_BASELINE,14));
        lbusername.setBounds(50,20,125,25);
        p1.add(lbusername);

         tfusername=new JTextField();
        tfusername.setBounds(190,20,180,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        JLabel lbname=new JLabel("Name");
        lbname.setFont(new Font("Tahoma",Font.CENTER_BASELINE,14));
        lbname.setBounds(50,60,125,25);
        p1.add(lbname);

        tfname=new JTextField();
        tfname.setBounds(190,60,180,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lbpassword=new JLabel("Password");
        lbpassword.setFont(new Font("Tahoma",Font.CENTER_BASELINE,14));
        lbpassword.setBounds(50,100,125,25);
        p1.add(lbpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(190,100,180,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

        JLabel lbsecurity=new JLabel("Security Question");
        lbsecurity.setFont(new Font("Tahoma",Font.CENTER_BASELINE,14));
        lbsecurity.setBounds(50,140,125,25);
        p1.add(lbsecurity);

        security=new Choice();
        security.add("fav character from the boy");
        security.add("fav superHero from the marvel");
        security.add("your lucky number");
        security.add("fav cartoon show");
        security.setBounds(190,140,180,25);
        p1.add(security);

        JLabel lbanswer=new JLabel("Answer");
        lbanswer.setFont(new Font("Tahoma",Font.CENTER_BASELINE,14));
        lbanswer.setBounds(50,180,125,25);
        p1.add(lbanswer);

        tfanswer=new JTextField();
        tfanswer.setBounds(190,180,180,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        create=new JButton("Create");
        create.setBackground(Color.darkGray);
        create.setForeground(Color.white);
        create.setFont(new Font("tahoma",Font.CENTER_BASELINE,14));
        create.setBounds(80,250,100,30);
        create.addActionListener(this);
        p1.add(create);

        back=new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setFont(new Font("tahoma",Font.CENTER_BASELINE,14));
        back.setBounds(210,250,100,30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2= i1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(580,50,250,250);
        add(image);

        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==create)
        {
            String username=tfusername.getText();
            String  name=tfname.getText();
            String password=tfpassword.getText();
            String question=security.getSelectedItem();
            String answer= tfanswer.getText();
            String query="insert into account values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";


             try {
                 conn c = new conn();
                 c.s.executeUpdate(query);
                 JOptionPane.showMessageDialog(null,"Account created successfully");
                 setVisible(false);
                 new login();

             }catch (Exception e)
             {
                 System.out.println(" error "+e);
                 //e.printStackTrace();
             }
        } else if (ae.getSource()==back) {
            setVisible(false);
            new login();

        }

    }

    public static void main(String[] args) {
        new signup();
    }



}
