package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class bookpackage extends JFrame implements ActionListener {
    Choice cpackage;
    JTextField tfperson;
    String username;
    JLabel lableusername,lableid,lablenumber,lablephone,lableprice;
    JButton ccheckpeice,boopackage,back;
    bookpackage(String username)
    {
        this.username=username;
        setBounds(250,150,1000,550);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("BOOK PACKAGE");
        heading.setBounds(100,10,200,30);
        heading.setFont(new Font("ahoma",Font.BOLD,22));
        add(heading);


        JLabel labusername = new JLabel("Username");
        labusername.setFont(new Font("tahoma",Font.PLAIN,16));
        labusername.setForeground(Color.gray);
        labusername.setBounds(30,70,120,25);
        add(labusername);

        lableusername = new JLabel();
        lableusername.setFont(new Font("tahoma",Font.PLAIN,16));
        lableusername.setBounds(180,70,150,25);
        add(lableusername);

        JLabel selectpak = new JLabel("Select Package");
        selectpak.setFont(new Font("tahoma",Font.PLAIN,16));
        selectpak.setForeground(Color.gray);
        selectpak.setBounds(30,115,120,25);
        add(selectpak);

        cpackage = new Choice();
        cpackage.add("Gold Package");
        cpackage.add("Silver Package");
        cpackage.add("Bronze Package");
        cpackage.setBounds(180,115,150,25);
        add(cpackage);

        JLabel lbperson = new JLabel("Total Person");
        lbperson.setFont(new Font("tahoma",Font.PLAIN,16));
        lbperson.setForeground(Color.gray);
        lbperson.setBounds(30,160,150,25);
        add(lbperson);

        tfperson=new JTextField();
        tfperson.setBounds(180,160,150,25);
        add(tfperson);

        JLabel lbid = new JLabel("Id");
        lbid.setFont(new Font("tahoma",Font.PLAIN,16));
        lbid.setForeground(Color.gray);
        lbid.setBounds(30,205,150,25);
        add(lbid);

        lableid = new JLabel();
        lableid.setBounds(180,205,150,25);
        add(lableid);

        JLabel lbnumber = new JLabel(" Id Number");
        lbnumber.setFont(new Font("tahoma",Font.PLAIN,16));
        lbnumber.setForeground(Color.gray);
        lbnumber.setBounds(30,250,150,25);
        add(lbnumber);

        lablenumber = new JLabel();
        lablenumber.setBounds(180,250,150,25);
        add(lablenumber);

        JLabel lbphone = new JLabel("Phone");
        lbphone.setFont(new Font("tahoma",Font.PLAIN,16));
        lbphone.setForeground(Color.gray);
        lbphone.setBounds(30,295,150,25);
        add(lbphone);

        lablephone = new JLabel();
        lablephone.setBounds(180,295,150,25);
        add(lablephone);

        JLabel lbprice = new JLabel("Total Price");
        lbprice.setFont(new Font("tahoma",Font.PLAIN,16));
        lbprice.setForeground(Color.gray);
        lbprice.setBounds(30,340,120,25);
        add(lbprice);

        lableprice = new JLabel();
        lableprice.setBounds(180,340,120,25);
        add(lableprice);

        try {
            conn cn=new conn();
            String query=" select * from customer where username='"+username+"'";
            ResultSet rs=cn.s.executeQuery(query);
            while (rs.next())
            {
                lableusername.setText(rs.getString("username"));
                lableid.setText(rs.getString("id"));
                lablenumber.setText(rs.getString("Number"));
                lablephone.setText(rs.getString("phone"));


            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        ccheckpeice =new JButton("Check Price");
        ccheckpeice.setBackground(Color.darkGray);
        ccheckpeice.setForeground(Color.white);
        ccheckpeice.setBounds(60,430,120,25);
        ccheckpeice.addActionListener(this);
        add(ccheckpeice);

        boopackage =new JButton("Book Package");
        boopackage.setBackground(Color.darkGray);
        boopackage.setForeground(Color.white);
        boopackage.setBounds(200,430,120,25);
        boopackage.addActionListener(this);
        add(boopackage);

        back =new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(340,430,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookpackage.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,20,600,400);
        add(image);


        setVisible(true);

    }
    public static void main(String[] args) {
        new bookpackage("");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==ccheckpeice)
        {
            String pack=cpackage.getSelectedItem();
            int cost=0;
            if (pack.equals("GOld Package"))
            {
                cost +=12000;
            } else if (pack.equals("Silver Package")) {
                cost +=20000;

            }else {
                cost += 28000;
            }
            int person= Integer.parseInt(tfperson.getText());
            cost*=person;
            lableprice.setText("Rs "+cost);
        } else if (ae.getSource()==boopackage) {
            try
            {
                conn cn=new conn();
                cn.s.executeUpdate("insert into bookpackage values('"+lableusername.getText()+"','"+cpackage.getSelectedItem()+"','"+tfperson.getText()+"','"+lableid.getText()+"','"+lablenumber.getText()+"','"+lablephone.getText()+"','"+lableprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Package Book Successfully");
                setVisible(false);

            }catch (Exception e)
            {
                e.printStackTrace();

            }

        }else {
            setVisible(false);

        }

    }
}
