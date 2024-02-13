package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class forgetpassword extends JFrame implements ActionListener {
    JTextField tfusername,tfname,tfanswer,tfpassword,tfsecurity;
    JButton search,retrive,back;
    forgetpassword()
    {
        setBounds(350,200,850,380);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon((i2));
        JLabel image=new JLabel(i3);
        image.setBounds(580,70,200,200);
        add(image);


        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30,30,500,280);
        add(p1);

        JLabel lbusername=new JLabel("User Name");
        lbusername.setBounds(40,20,120,25);
        lbusername.setFont(new Font("tohama",Font.BOLD,14));
        p1.add(lbusername);

        tfusername=new JTextField();
        tfusername.setBounds(190,20,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);

        search=new JButton("Search");
        search.setBackground(Color.darkGray);
        search.setForeground(Color.white);
        search.setBounds(400,20,80,25);
        search.addActionListener(this);
        p1.add(search);

        JLabel lbname=new JLabel("Name");
        lbname.setBounds(40,60,150,25);
        lbname.setFont(new Font("tohama",Font.BOLD,14));
        p1.add(lbname);

        tfname=new JTextField();
        tfname.setBounds(190,60,200,25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);

        JLabel lbsecurity=new JLabel("Security Question");
        lbsecurity.setBounds(40,100,150,25);
        lbsecurity.setFont(new Font("tohama",Font.BOLD,14));
        p1.add(lbsecurity);

        tfsecurity=new JTextField();
        tfsecurity.setBounds(190,100,200,25);
        tfsecurity.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfsecurity);

        JLabel lbansew=new JLabel("Answer");
        lbansew.setBounds(40,140,150,25);
        lbansew.setFont(new Font("tohama",Font.BOLD,14));
        p1.add(lbansew);

        tfanswer=new JTextField();
        tfanswer.setBounds(190,140,200,25);
        tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfanswer);

        retrive=new JButton("Retrive");
        retrive.setBackground(Color.darkGray);
        retrive.setForeground(Color.white);
        retrive.setBounds(400,140,80,25);
        retrive.addActionListener(this);
        p1.add(retrive);

        JLabel lbpasword=new JLabel("Password");
        lbpasword.setBounds(40,180,150,25);
        lbpasword.setFont(new Font("tohama",Font.BOLD,14));
        p1.add(lbpasword);

        tfpassword=new JTextField();
        tfpassword.setBounds(190,180,200,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);

         back=new JButton("back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(150,220,80,25);
        back.addActionListener(this);
        p1.add(back);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent ea) {
        if (ea.getSource()==search){
            try {
                String query="select*from account where username='"+tfusername.getText()+"'";
               conn c= new conn();
             ResultSet rs= c.s.executeQuery(query);
               while (rs.next())
               {
                tfname.setText(rs.getString("name"));
                tfsecurity.setText(rs.getString("security"));
               }

            }catch (Exception e){
                e.printStackTrace();
            }

        }else if (ea.getSource()==retrive)
         {
            try {
                String query = "select*from account where answer='" + tfanswer.getText() + "' AND username='" + tfusername.getText() + "'";
                conn c = new conn();
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    tfpassword.setText(rs.getString("password"));
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

        }else {
            setVisible(false);
            new login();
        }

    }

    public static void main(String[] args) {
        new forgetpassword();

    }


}
