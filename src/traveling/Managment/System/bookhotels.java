
package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class bookhotels extends JFrame implements ActionListener {
    Choice chotel,cac,cfood;
    JTextField tfday,tfperson;
    String username;
    JLabel lableusername,lableid,lablenumber,lablephone,lableprice;
    JButton ccheckpeice,boopackage,back;
    bookhotels(String username)
    {
        this.username=username;
        setBounds(250,100,1000,600);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel heading = new JLabel("BOOK HOTEL");
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

        JLabel selecthot = new JLabel("Select Hotels");
        selecthot.setFont(new Font("tahoma",Font.PLAIN,16));
        selecthot.setForeground(Color.gray);
        selecthot.setBounds(30,110,120,25);
        add(selecthot);

        chotel = new Choice();
        chotel.setBounds(180,110,150,25);
        add(chotel);
        try{
            conn cn=new conn();
            ResultSet rs =cn.s.executeQuery("select * from hotel");
            while (rs.next())
            {
                chotel.add(rs.getString("name"));

            }

        }catch (Exception e)
        {
            e.printStackTrace();
        }

        JLabel lbperson = new JLabel("Total Person");
        lbperson.setFont(new Font("tahoma",Font.PLAIN,16));
        lbperson.setForeground(Color.gray);
        lbperson.setBounds(30,150,150,25);
        add(lbperson);

        tfperson=new JTextField("1");
        tfperson.setBounds(180,150,150,25);
        add(tfperson);

        JLabel lbday = new JLabel("No. of Days");
        lbday.setFont(new Font("tahoma",Font.PLAIN,16));
        lbday.setForeground(Color.gray);
        lbday.setBounds(30,190,150,25);
        add(lbday);

        tfday=new JTextField("1");
        tfday.setBounds(180,190,150,25);
        add(tfday);

        JLabel jac = new JLabel("Ac/Non Ac");
        jac.setFont(new Font("tahoma",Font.PLAIN,16));
        jac.setForeground(Color.gray);
        jac.setBounds(30,230,150,25);
        add(jac);
        cac = new Choice();
        cac.add("Ac");
        cac.add("Non Ac");
        cac.setBounds(180,230,150,25);
        add(cac);

        JLabel jfood = new JLabel("Food Included");
        jfood.setFont(new Font("tahoma",Font.PLAIN,16));
        jfood.setForeground(Color.gray);
        jfood.setBounds(30,270,150,25);
        add(jfood);
        cfood = new Choice();
        cfood.add("Yes");
        cfood.add("No");
        cfood.setBounds(180,270,150,25);
        add(cfood);


        JLabel lbid = new JLabel("Id");
        lbid.setFont(new Font("tahoma",Font.PLAIN,16));
        lbid.setForeground(Color.gray);
        lbid.setBounds(30,310,150,25);
        add(lbid);

        lableid = new JLabel();
        lableid.setBounds(180,310,150,25);
        add(lableid);

        JLabel lbnumber = new JLabel(" Id Number");
        lbnumber.setFont(new Font("tahoma",Font.PLAIN,16));
        lbnumber.setForeground(Color.gray);
        lbnumber.setBounds(30,350,150,25);
        add(lbnumber);

        lablenumber = new JLabel();
        lablenumber.setBounds(180,350,150,25);
        add(lablenumber);

        JLabel lbphone = new JLabel("Phone");
        lbphone.setFont(new Font("tahoma",Font.PLAIN,16));
        lbphone.setForeground(Color.gray);
        lbphone.setBounds(30,390,150,25);
        add(lbphone);

        lablephone = new JLabel();
        lablephone.setBounds(180,390,150,25);
        add(lablephone);

        JLabel lbprice = new JLabel("Total Price");
        lbprice.setFont(new Font("tahoma",Font.PLAIN,16));
        lbprice.setForeground(Color.gray);
        lbprice.setBounds(30,430,120,25);
        add(lbprice);

        lableprice = new JLabel();
        lableprice.setBounds(180,430,120,25);
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
        ccheckpeice.setBounds(60,480,110,25);
        ccheckpeice.addActionListener(this);
        add(ccheckpeice);

        boopackage =new JButton("Book Hotel");
        boopackage.setBackground(Color.darkGray);
        boopackage.setForeground(Color.white);
        boopackage.setBounds(180,480,120,25);
        boopackage.addActionListener(this);
        add(boopackage);

        back =new JButton("Back");
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.setBounds(112,518,120,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bookedDetails.jpg"));
        Image i2=i1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,20,600,500);
        add(image);


        setVisible(true);

    }
    public static void main(String[] args) {
        new bookhotels("sham");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==ccheckpeice)
        {
            try {


            conn cn =new conn();
            ResultSet rs=cn.s.executeQuery("select *from hotel where name='"+chotel.getSelectedItem()+"'");
            while (rs.next())
            {
                int cost= Integer.parseInt(rs.getString("costperperson"));
                int food= Integer.parseInt(rs.getString("foodinclude"));
                int ac= Integer.parseInt(rs.getString("acroom"));

                int persons =Integer.parseInt(tfperson.getText());
                int daye =Integer.parseInt(tfday.getText());
                String acselected=cac.getSelectedItem();
                String foodselected=cfood.getSelectedItem();

                if (persons*daye>0)
                {
                    int total=0;
                    total +=acselected.equals("Ac")?ac:0;
                    total +=foodselected.equals("Yes")?food:0;
                    total+=cost;
                    total=total*persons*daye;
                    lableprice.setText("Rs"+total);
                }
                else {
                    JOptionPane.showMessageDialog(null,"please Enter Valid number");
                }
            }

            }catch (Exception e)
            {
                e.printStackTrace();
            }
        } else if (ae.getSource()==boopackage) {
            try
            {
                conn cn=new conn();
                cn.s.executeUpdate("insert into bookhotel values('"+lableusername.getText()+"','"+chotel.getSelectedItem()+"','"+tfperson.getText()+"','"+tfday.getText()+"','"+cac.getSelectedItem()+"','"+cfood.getSelectedItem()+"','"+lableid.getText()+"','"+lablenumber.getText()+"','"+lablephone.getText()+"','"+lableprice.getText()+"')");
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully");
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
