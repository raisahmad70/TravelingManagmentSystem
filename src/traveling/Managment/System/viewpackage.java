package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewpackage extends JFrame implements ActionListener {
    JButton back;
    viewpackage(String username)
    {
        setBounds(450,200,900,450);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel("VIEW PACKAGE DETAILS");
        text.setFont(new Font("tahoma",Font.BOLD,20));
        text.setBounds(60,0,300,30);
        add(text);

        JLabel labusername = new JLabel("Username");
        labusername.setForeground(Color.gray);
        labusername.setBounds(30,50,120,25);
        add(labusername);

        JLabel lableusername = new JLabel();
        lableusername.setBounds(180,50,150,25);
        add(lableusername);

        JLabel lbpackage = new JLabel("Package Name");
        lbpackage.setForeground(Color.gray);
        lbpackage.setBounds(30,90,120,25);
        add(lbpackage);

        JLabel lablepackage = new JLabel();
        lablepackage.setBounds(180,90,120,25);
        add(lablepackage);

        JLabel lbperson = new JLabel("Total persons");
        lbperson.setForeground(Color.gray);
        lbperson.setBounds(30,130,120,25);
        add(lbperson);

        JLabel lableperson = new JLabel();
        lableperson.setBounds(180,130,120,25);
        add(lableperson);

        JLabel lbid = new JLabel("Id");
        lbid.setForeground(Color.gray);
        lbid.setBounds(30,170,120,25);
        add(lbid);

        JLabel lableid = new JLabel();
        lableid.setBounds(180,170,120,25);
        add(lableid);

        JLabel lbnumber = new JLabel(" Id Number");
        lbnumber.setForeground(Color.gray);
        lbnumber.setBounds(30,210,120,25);
        add(lbnumber);

        JLabel lablenumber = new JLabel();
        lablenumber.setBounds(180,210,120,25);
        add(lablenumber);

        JLabel lbphone = new JLabel("Phone Number");
        lbphone.setForeground(Color.gray);
        lbphone.setBounds(30,250,120,25);
        add(lbphone);

        JLabel lablephone = new JLabel();
        lablephone.setBounds(180,250,120,25);
        add(lablephone);

        JLabel lbprice = new JLabel("Price");
        lbprice.setForeground(Color.gray);
        lbprice.setBounds(30,290,120,25);
        add(lbprice);

        JLabel lableprice = new JLabel();
        lableprice.setBounds(180,290,120,25);
        add(lableprice);


        back=new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(110,350,70,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(550,350,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(250,0,650,430);
        add(image);

        try {
            conn cn=new conn();
            String query=" select * from bookpackage where username='"+username+"'";
            ResultSet rs=cn.s.executeQuery(query);
            while (rs.next())
            {
                lableusername.setText(rs.getString("username"));
                lablepackage.setText(rs.getString("Package"));
                lableid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("number"));
                lableprice.setText(rs.getString("Price"));
                lablephone.setText(rs.getString("phone"));
                lableperson.setText(rs.getString("Persons"));

            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }





        setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==back)
        {
            setVisible(false);
        }
//
    }
    public static void main(String[] args) {
        new viewpackage("sham");

    }

}
