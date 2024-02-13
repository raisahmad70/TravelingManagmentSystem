package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class viewcustomer extends JFrame implements ActionListener {
    JButton back;
    viewcustomer(String username)
    {
        setBounds(360,110,670,525);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel labusername = new JLabel("Username");
        labusername.setForeground(Color.gray);
        labusername.setBounds(30,50,120,25);
        add(labusername);

        JLabel lableusername = new JLabel();
        lableusername.setBounds(180,50,150,25);
        add(lableusername);

        JLabel userid = new JLabel("Id");
        userid.setForeground(Color.gray);
        userid.setBounds(30,110,120,25);
        add(userid);

        JLabel lbid = new JLabel();
        lbid.setBounds(180,110,120,25);
        add(lbid);

        JLabel lbnumber = new JLabel("Id Number");
        lbnumber.setForeground(Color.gray);
        lbnumber.setBounds(30,170,120,25);
        add(lbnumber);

        JLabel lablenumber = new JLabel();
        lablenumber.setBounds(180,170,120,25);
        add(lablenumber);

        JLabel lbname = new JLabel("Name");
        lbname.setForeground(Color.gray);
        lbname.setBounds(30,230,120,25);
        add(lbname);

        JLabel lablename = new JLabel();
        lablename.setBounds(180,230,120,25);
        add(lablename);

        JLabel lbgender = new JLabel("Gender");
        lbgender.setForeground(Color.gray);
        lbgender.setBounds(30,290,120,25);
        add(lbgender);

        JLabel lablegender = new JLabel();
        lablegender.setBounds(180,290,120,25);
        add(lablegender);

        JLabel lbcountry = new JLabel("Country");
        lbcountry.setForeground(Color.gray);
        lbcountry.setBounds(350,50,120,25);
        add(lbcountry);

        JLabel lablecountry = new JLabel();
        lablecountry.setBounds(510,50,120,25);
        add(lablecountry);

        JLabel lbaddress = new JLabel("Address");
        lbaddress.setForeground(Color.gray);
        lbaddress.setBounds(350,110,120,25);
        add(lbaddress);

        JLabel lableaddress = new JLabel();
        lableaddress.setBounds(510,100,120,25);
        add(lableaddress);

        JLabel lbemail = new JLabel("Email");
        lbemail.setForeground(Color.gray);
        lbemail.setBounds(350,170,120,25);
        add(lbemail);

        JLabel lableemail = new JLabel();
        lableemail.setBounds(510,170,120,25);
        add(lableemail);

        JLabel lbphone = new JLabel("Phone Number");
        lbphone.setForeground(Color.gray);
        lbphone.setBounds(350,230,120,25);
        add(lbphone);

        JLabel lablephone = new JLabel();
        lablephone.setBounds(510,230,120,25);
        add(lablephone);

        back=new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(350,290,70,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(20,250,650,330);
        add(image);

        try {
            conn cn=new conn();
            String query=" select * from customer where username='"+username+"'";
            ResultSet rs=cn.s.executeQuery(query);
            while (rs.next())
            {
                lableusername.setText(rs.getString("username"));
                lbid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("number"));
                lablename.setText(rs.getString("name"));
                lablegender.setText(rs.getString("gender"));
                lablecountry.setText(rs.getString("country"));
                lableaddress.setText(rs.getString("address"));
                lablephone.setText(rs.getString("phone"));
                lableemail.setText(rs.getString("email"));

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

    }
    public static void main(String[] args) {
        new viewcustomer("sham");

    }


}
