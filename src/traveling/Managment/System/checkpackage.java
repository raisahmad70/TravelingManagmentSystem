package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;

public class checkpackage extends JFrame {
    checkpackage()
    {
        setBounds(300,80,900,600);

        String[] package1={"GOLD PACKAGE" ,"5 day & 6 night","Airport Assistance","Daily buffet","Night Safari","Full day 3 island","Toll free","Free gaming","Book now","Summer Spacial","Price   12000/-","package1.jpg"};
        String[] package2={"SILVER PACKAGE","5 day & 6 night","Toll free "," Entrance free ticket","Meet & greet at Airport","Welcome to drink arrival","Daily buffet","Horse ridding","Book now","Winter Spacial","Price   20000/-","package2.jpg"};
        String[] package3={"BRONZE PACKAGE" ," 6 day & 7 night","Return Airfare","Free clubbing ","Free games","Welcome to drink arrival","Night safari","Horse ridding","Book now","Monsoon Spacial","Price   28000/-","package3.jpg"};

        JTabbedPane tab=new JTabbedPane();

        JPanel p1= createpackage(package1);
        tab.addTab("package 1",null,p1);
        JPanel p2= createpackage(package2);
        tab.addTab("package 2",null,p2);
        JPanel p3= createpackage(package3);
        tab.addTab("package 3",null,p3);
        add(tab);


        setVisible(true);
    }
    public JPanel createpackage(String[] pack)
    {
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.white);

        JLabel l1=new JLabel(pack[0]);
        l1.setBounds(50,5,300,45);
        l1.setForeground(Color.black);
        l1.setFont(new Font("tahoma",Font.BOLD,30));
        p1.add(l1);

        JLabel l2=new JLabel(pack[1]);
        l2.setBounds(50,60,300,30);
        l2.setForeground(Color.gray);
        l2.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l2);

        JLabel l3=new JLabel(pack[2]);
        l3.setBounds(50,110,300,30);
        l3.setForeground(Color.gray);
        l3.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l3);

        JLabel l4=new JLabel(pack[3]);
        l4.setBounds(50,160,300,30);
        l4.setForeground(Color.gray);
        l4.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l4);

        JLabel l5=new JLabel(pack[4]);
        l5.setBounds(50,210,300,30);
        l5.setForeground(Color.gray);
        l5.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l5);

        JLabel l6=new JLabel(pack[5]);
        l6.setBounds(50,260,300,30);
        l6.setForeground(Color.gray);
        l6.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l6);

        JLabel l7=new JLabel(pack[6]);
        l7.setBounds(50,310,300,30);
        l7.setForeground(Color.gray);
        l7.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l7);

        JLabel l8=new JLabel(pack[7]);
        l8.setBounds(50,360,300,40);
        l8.setForeground(Color.gray);
        l8.setFont(new Font("tahoma",Font.BOLD,20));
        p1.add(l8);



        JLabel l10=new JLabel(pack[8]);
        l10.setBounds(70,410,300,40);
        l10.setForeground(Color.darkGray);
        l10.setFont(new Font("tahoma",Font.BOLD,22));
        p1.add(l10);

        JLabel l9=new JLabel(pack[9]);
        l9.setBounds(50,460,300,40);
        l9.setForeground(Color.red);
        l9.setFont(new Font("tahoma",Font.BOLD,22));
        p1.add(l9);

        JLabel l11=new JLabel(pack[10]);
        l11.setBounds(450,460,300,40);
        l11.setForeground(new Color(03,153,33));
        l11.setFont(new Font("tahoma",Font.BOLD,22));
        p1.add(l11);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/"+pack[11]));
        Image i2=i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(300,20,550,450);
        p1.add(image);


        return p1;




    }

    public static void main(String[] args) {
        new checkpackage();
    }
}
