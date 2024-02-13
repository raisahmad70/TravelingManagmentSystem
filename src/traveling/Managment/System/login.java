package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class login extends JFrame implements ActionListener {
    JTextField tfusername,tfpassword;
    JButton login,sign,forget;
    login()
    {
        setSize(800,400);
        setLocation(350,200);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBounds(0,0,400,400);
        p1.setBackground(Color.gray);
        p1.setLayout(null);
        add(p1);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2= i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(100,70,200,200);
        p1.add(image);

        JPanel p2=new JPanel();
        p2.setBackground(new Color(133,190,0233));
        p2.setBounds(400,30,350,300);
        p2.setLayout(null);
        add(p2);

        JLabel lbusername=new JLabel("User Name");
        lbusername.setBounds(60,15,100 ,25);
        lbusername.setFont(new Font("SEN_SERIF",Font.PLAIN,20));
        p2.add(lbusername);

        tfusername=new JTextField();
        tfusername.setBounds(60,50,200,25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfusername);

        JLabel lbpassword=new JLabel("Password");
        lbpassword.setBounds(60,85,100 ,25);
        lbpassword.setFont(new Font("SEN_SERIF",Font.PLAIN,20));
        p2.add(lbpassword);

        tfpassword=new JTextField();
        tfpassword.setBounds(60,120,200,25);
        tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p2.add(tfpassword);

        login=new JButton("Login");
        login.setFont(new Font("SEN_SARIF",Font.PLAIN,15));
        login.setBackground(Color.darkGray);
        login.setForeground(Color.white);
        login.setBounds(70,165,80,25);
        login.addActionListener(this);
        p2.add(login);

        sign=new JButton("Sign Up");
        sign.setFont(new Font("SEN_SARIF",Font.PLAIN,12));
        sign.setBackground(Color.darkGray);
        sign.setForeground(Color.white);
        sign.setBounds(170,165,80,25);
        sign.addActionListener(this);
        p2.add(sign);

        forget=new JButton("Forget Password");
        forget.setFont(new Font("SEN_SARIF",Font.PLAIN,12));
        forget.setBackground(Color.darkGray);
        forget.setForeground(Color.white);
        forget.setBounds(100,210,120,25);
        forget.addActionListener(this);
        p2.add(forget);

        JLabel lbtrable=new JLabel("Trouble login...");
        lbtrable.setBounds(120,240,100 ,25);
        lbtrable.setFont(new Font("SEN_SERIF",Font.PLAIN,12));
        lbtrable.setForeground(Color.red);
        p2.add(lbtrable);

        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==login)
        {
            try {
                conn cn=new conn();

                String login=tfusername.getText();
            String password=tfpassword.getText();
            String qoery="select * from account where username='"+login+"'AND password='"+password+"'";
            ResultSet rs=cn.s.executeQuery(qoery);
            if (rs.next())
            {
                setVisible(false);
                new loading(login);
            } else
            {

                JOptionPane.showMessageDialog(null,"Incorrect username & password");
            }

            }
            catch (Exception e)
              {
                e.printStackTrace();
              }


        } else if (ae.getSource()==sign) {
            setVisible(false);
            new signup();

        }else {
            setVisible(false);
            new forgetpassword();
        }
    }

        public static void main(String[] args) {
        new login();


    }

   }

