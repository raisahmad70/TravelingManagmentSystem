package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;




    public class updatecustomer extends JFrame implements ActionListener {
        JLabel lblusername,labelname,lebleusername;
        JTextField tfnumber,tfcountry,tfaddress,tfemail,tfphonenumber,tfgender,tfid;
        JComboBox comboid;
        JButton updatebotton,backbotton;
        JRadioButton rmale,rfemale;
        updatecustomer(String username)
        {
            setBounds(270,120,850,550);
            getContentPane().setBackground(Color.white);
            setLayout(null);
            JLabel updatedetails=new JLabel("UPDATE CUSTOMER DETAILS");
            updatedetails.setBounds(50,0,300,30);
            updatedetails.setFont(new Font("tahoma",Font.PLAIN,20));
            add(updatedetails);


            lblusername =new JLabel("User name");
            lblusername.setBounds(30,50,150,25);
            add(lblusername);

            lebleusername =new JLabel();
            lebleusername.setBounds(220,50,150,25);
            add(lebleusername);

            JLabel lbid =new JLabel("Id");
            lbid.setBounds(30,90,150,25);
            add(lbid);

            tfid= new JTextField();
            tfid.setBounds(220,90,150,25);
            add(tfid);

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

            tfgender= new JTextField();
            tfgender.setBounds(220,210,150,25);
            add(tfgender);

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


            updatebotton=new JButton("Update");
            updatebotton.setBackground(Color.darkGray);
            updatebotton.setForeground(Color.white);
            updatebotton.setBounds(220,420,80,25);
            updatebotton.addActionListener(this);
            add(updatebotton);

            ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/update.png"));
            Image i2=i1.getImage().getScaledInstance(240,400,Image.SCALE_DEFAULT);
            ImageIcon icn=new ImageIcon(i2);
            JLabel image =new JLabel(icn);
            image.setBounds(390,0,450,500);
            add(image);

            try {
                conn cn=new conn();
                ResultSet rs= cn.s.executeQuery("select * from customer where username ='"+username+"'");
                while (rs.next())
                {
                    lebleusername.setText(rs.getString("username"));
                    labelname.setText(rs.getString("name"));
                    tfid.setText(rs.getString("id"));
                    tfnumber.setText(rs.getString("number"));
                    labelname.setText(rs.getString("name"));
                    tfgender.setText(rs.getString("gender"));
                    tfcountry.setText(rs.getString("country"));
                    tfaddress.setText(rs.getString("address"));
                    tfemail.setText(rs.getString("email"));
                    tfphonenumber.setText(rs.getString("phone"));
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
            if (ae.getSource()==updatebotton)
            {
                String username= lebleusername.getText();
                String id= tfid.getText();
                String number= tfnumber.getText();
                String name=labelname.getText();
                String gender=tfgender.getText();
                String country=tfcountry.getText();
                String address=tfaddress.getText();
                String phone= tfphonenumber.getText();
                String email=tfemail.getText();
                try {
                    conn cn=new conn();
                    String query="update customer set username='"+username+"',id='"+id+"',number='"+number+"',name='"+name+"',gender='"+gender+"',country='"+country+"',address='"+address+"',phone='"+phone+"',email='"+email+"'";
                    cn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Customer Details Updated Successfully ");
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
            new updatecustomer("");

        }


    }



