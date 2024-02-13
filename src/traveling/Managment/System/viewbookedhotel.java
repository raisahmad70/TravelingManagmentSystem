package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class viewbookedhotel extends JFrame implements ActionListener {
    JButton back;
    viewbookedhotel(String username)
    {
        setBounds(450,150,900,560);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel text=new JLabel("VIEW BOOKED HOTEL DETAILS");
        text.setFont(new Font("tahoma",Font.BOLD,20));
        text.setBounds(60,0,400,30);
        add(text);

        JLabel labusername = new JLabel("Username");
        labusername.setForeground(Color.gray);
        labusername.setBounds(30,50,120,25);
        add(labusername);

        JLabel lableusername = new JLabel();
        lableusername.setBounds(180,50,150,25);
        add(lableusername);

        JLabel lbhotelname = new JLabel("Hotel Name");
        lbhotelname.setForeground(Color.gray);
        lbhotelname.setBounds(30,90,120,25);
        add(lbhotelname);

        JLabel lablehotelname = new JLabel();
        lablehotelname.setBounds(180,90,120,25);
        add(lablehotelname);

        JLabel lbperson = new JLabel("Total persons");
        lbperson.setForeground(Color.gray);
        lbperson.setBounds(30,130,120,25);
        add(lbperson);

        JLabel lableperson = new JLabel();
        lableperson.setBounds(180,130,120,25);
        add(lableperson);

        JLabel lbdays = new JLabel("Total Days");
        lbdays.setForeground(Color.gray);
        lbdays.setBounds(30,170,120,25);
        add(lbdays);

        JLabel labledays = new JLabel();
        labledays.setBounds(180,170,120,25);
        add(labledays);

        JLabel lbac = new JLabel("Ac/Non Ac");
        lbac.setForeground(Color.gray);
        lbac.setBounds(30,210,120,25);
        add(lbac);

        JLabel lableac = new JLabel();
        lableac.setBounds(180,210,120,25);
        add(lableac);

        JLabel lbfoodin = new JLabel("Food Included?");
        lbfoodin.setForeground(Color.gray);
        lbfoodin.setBounds(30,250,120,25);
        add(lbfoodin);

        JLabel lablefoodin = new JLabel();
        lablefoodin.setBounds(180,250,120,25);
        add(lablefoodin);

        JLabel lbid = new JLabel("Id");
        lbid.setForeground(Color.gray);
        lbid.setBounds(30,290,120,25);
        add(lbid);

        JLabel lableid = new JLabel();
        lableid.setBounds(180,290,120,25);
        add(lableid);


        JLabel lbnumber = new JLabel(" Id Number");
        lbnumber.setForeground(Color.gray);
        lbnumber.setBounds(30,330,120,25);
        add(lbnumber);

        JLabel lablenumber = new JLabel();
        lablenumber.setBounds(180,330,120,25);
        add(lablenumber);

        JLabel lbphone = new JLabel("Phone Number");
        lbphone.setForeground(Color.gray);
        lbphone.setBounds(30,370,120,25);
        add(lbphone);

        JLabel lablephone = new JLabel();
        lablephone.setBounds(180,370,120,25);
        add(lablephone);

        JLabel lbcost = new JLabel("Total Cost");
        lbcost.setForeground(Color.gray);
        lbcost.setBounds(30,410,120,25);
        add(lbcost);

        JLabel lablecost = new JLabel();
        lablecost.setBounds(180,410,120,25);
        add(lablecost);


        back=new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(110,460,70,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/book.jpg"));
        Image i2=i1.getImage().getScaledInstance(550,450,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(260,50,650,450);
        add(image);

        try {
            conn cn=new conn();
            String query=" select * from bookhotel where username='"+username+"'";
            ResultSet rs=cn.s.executeQuery(query);
            while (rs.next())
            {
                lableusername.setText(rs.getString("username"));
                lablehotelname.setText(rs.getString("hotelname"));
                lableid.setText(rs.getString("id"));
                labledays.setText(rs.getString("daya"));
                lableac.setText(rs.getString("ac"));
                lablefoodin.setText(rs.getString("food"));
                lablenumber.setText(rs.getString("number"));
                lablecost.setText(rs.getString("Price"));
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
        new viewbookedhotel("sham");

    }

}
