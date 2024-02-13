package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class addcustomar extends JFrame implements ActionListener {
    JLabel lblusername,labelname,lebleusername;
    JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphonenumber;
    JComboBox comboid;
    JButton addbotton,backbotton;
    JRadioButton rmale,rfemale;
    addcustomar(String username)
    {
        setBounds(270,120,850,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);


        lblusername =new JLabel("User name");
        lblusername.setBounds(30,50,150,25);
        add(lblusername);

        lebleusername =new JLabel();
        lebleusername.setBounds(220,50,150,25);
        add(lebleusername);

        JLabel lbid =new JLabel("Id");
        lbid.setBounds(30,90,150,25);
        add(lbid);

        comboid= new JComboBox(new String[] {"passport","Addhar Card","Pan Card","drivery licence"});
        comboid.setBounds(220,90,150,25);
        comboid.setBackground(Color.white);
        add(comboid);

        JLabel lbnumber=new JLabel("Number");
        lbnumber.setBounds(30,130,150,25);
        add(lbnumber);

        tfnumber= new JTextField();
        tfnumber.setBounds(220,130,150,25);
        add(tfnumber);

        JLabel lbname=new JLabel("Name");
        lbname.setBounds(30,170,150,25);
        add(lbname);


        labelname=new JLabel();
        labelname.setBounds(220,170,150,25);
        add(labelname);

        JLabel lbgender=new JLabel("Gender");
        lbgender.setBounds(30,210,150,25);
        add(lbgender);

        rmale = new JRadioButton("Male");
        rmale.setBounds(220,210,70,25);
        rmale.setBackground(Color.white);
        add(rmale);

        rfemale = new JRadioButton("Female");
        rfemale.setBounds(300,210,70,25);
        rfemale.setBackground(Color.white);
        add(rfemale);

        ButtonGroup bg=new ButtonGroup();
        bg.add(rmale);
        bg.add(rfemale);

        JLabel lbcountry=new JLabel("Country");
        lbcountry.setBounds(30,250,150,25);
        add(lbcountry);

        tfcountry= new JTextField();
        tfcountry.setBounds(220,250,150,25);
        add(tfcountry);

        JLabel lbaddress=new JLabel("Address");
        lbaddress.setBounds(30,290,150,25);
        add(lbaddress);

        tfaddress= new JTextField();
        tfaddress.setBounds(220,290,150,25);
        add(tfaddress);

        JLabel lbemail=new JLabel("Email");
        lbemail.setBounds(30,330,150,25);
        add(lbemail);

        tfemail= new JTextField();
        tfemail.setBounds(220,330,150,25);
        add(tfemail);

        JLabel lbphonenumber=new JLabel("Phone Number");
        lbphonenumber.setBounds(30,370,150,25);
        add(lbphonenumber);

        tfphonenumber= new JTextField();
        tfphonenumber.setBounds(220,370,150,25);
        add(tfphonenumber);

        backbotton=new JButton("Back");
        backbotton.setBackground(Color.darkGray);
        backbotton.setForeground(Color.white);
        backbotton.setBounds(70,420,80,25);
        backbotton.addActionListener(this);
        add(backbotton);


        addbotton=new JButton("Add");
        addbotton.setBackground(Color.darkGray);
        addbotton.setForeground(Color.white);
        addbotton.setBounds(220,420,80,25);
        addbotton.addActionListener(this);
        add(addbotton);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2=i1.getImage().getScaledInstance(440,600,Image.SCALE_DEFAULT);
        ImageIcon icn=new ImageIcon(i2);
        JLabel image =new JLabel(icn);
        image.setBounds(390,0,450,500);
        add(image);

        try {
            conn cn=new conn();
            ResultSet rs= cn.s.executeQuery("select * from account where username ='"+username+"'");
            while (rs.next())
           {
               lebleusername.setText(rs.getString("username"));
               labelname.setText(rs.getString("name"));
           }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==addbotton)
        {
            String username= lebleusername.getText();
            String id= (String) comboid.getSelectedItem();
            String number= tfnumber.getText();
            String name=labelname.getText();
            String gender=null;
            if (rmale.isSelected())
            {
                gender="male";
            }else {
                gender="female";
            }
            String country=tfcountry.getText();
            String address=tfaddress.getText();
            String phone= tfnumber.getText();
            String emai=tfemail.getText();
            try {
                conn cn=new conn();
                String query="insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+address+"','"+phone+"','"+emai+"')";
                cn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Customer Details Added Successfully ");
                setVisible(false);
            }catch (Exception e)
            {
                e.printStackTrace();
            }


        }else {
            setVisible(false);
        }

    }

    public static void main(String[] args) {
        new addcustomar("");

    }


}

