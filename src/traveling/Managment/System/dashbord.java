package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashbord extends JFrame implements ActionListener {
    JButton view,addpersonal,updatepersonal,checkpakage,
            bookpakage,vpakage,vhotel,destinat,bhotel,vbh,payment,calcu,note,about,deletepersonal;
    String username;
    dashbord(String username)
    {
        this.username= username;
//        setBounds(0,0,1600,1000);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(1,5,192));
        p1.setLayout(null);
        p1.setBounds(0,0,1400,65);
        add(p1);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2=i1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon =new JLabel(i3);
        icon.setBounds(5,0,70,70);
        p1.add(icon);

        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80,10,300,40);
        heading.setFont(new Font("tahoma",Font.BOLD,30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(1,5,192));
        p2.setLayout(null);
        p2.setBounds(0,65,300,1000);
        add(p2);

        addpersonal =new JButton("Add personal Details");
        addpersonal.setBounds(0,0,300,50);
        addpersonal.setBackground(new Color(0,0,102));
        addpersonal.setForeground(Color.white);
        addpersonal.setFont(new Font("tahoma",Font.PLAIN,20));
        addpersonal.setMargin(new Insets(0,0,0,60));
        addpersonal.addActionListener(this);
        p2. add(addpersonal);

        updatepersonal =new JButton("Update personal Details");
        updatepersonal.setBounds(0,45,300,50);
        updatepersonal.setBackground(new Color(0,0,102));
        updatepersonal.setForeground(Color.white);
        updatepersonal.setFont(new Font("tahoma",Font.PLAIN,20));
        updatepersonal.setMargin(new Insets(0,0,0,60));
        updatepersonal.addActionListener(this);
        p2. add(updatepersonal);

        view =new JButton("View Details");
        view.setBounds(0,90,300,50);
        view.setBackground(new Color(0,0,102));
        view.setForeground(Color.white);
        view.setFont(new Font("tahoma",Font.PLAIN,20));
        view.setMargin(new Insets(0,0,0,60));
        view.addActionListener(this);
        p2. add(view);

        deletepersonal =new JButton("Delete Personal Details");
        deletepersonal.setBounds(0,135,300,50);
        deletepersonal.setBackground(new Color(0,0,102));
        deletepersonal.setForeground(Color.white);
        deletepersonal.setFont(new Font("tahoma",Font.PLAIN,20));
        deletepersonal.setMargin(new Insets(0,0,0,60));
        deletepersonal.addActionListener(this);
        p2. add(deletepersonal);

        checkpakage =new JButton("Check Package");
        checkpakage.setBounds(0,180,300,50);
        checkpakage.setBackground(new Color(0,0,102));
        checkpakage.setForeground(Color.white);
        checkpakage.setFont(new Font("tahoma",Font.PLAIN,20));
        checkpakage.setMargin(new Insets(0,0,0,60));
        checkpakage.addActionListener(this);
        p2. add(checkpakage);

        bookpakage =new JButton("Book Package");
        bookpakage.setBounds(0,225,300,50);
        bookpakage.setBackground(new Color(0,0,102));
        bookpakage.setForeground(Color.white);
        bookpakage.setFont(new Font("tahoma",Font.PLAIN,20));
        bookpakage.setMargin(new Insets(0,0,0,60));
        bookpakage.addActionListener(this);
        p2. add(bookpakage);
        vpakage =new JButton("View Package");
        vpakage.setBounds(0,270,300,50);
        vpakage.setBackground(new Color(0,0,102));
        vpakage.setForeground(Color.white);
        vpakage.setFont(new Font("tahoma",Font.PLAIN,20));
        vpakage.setMargin(new Insets(0,0,0,60));
        vpakage.addActionListener(this);
        p2. add(vpakage);

        vhotel =new JButton("View hotels");
        vhotel.setBounds(0,315,300,50);
        vhotel.setBackground(new Color(0,0,102));
        vhotel.setForeground(Color.white);
        vhotel.setFont(new Font("tahoma",Font.PLAIN,20));
        vhotel.setMargin(new Insets(0,0,0,60));
        vhotel.addActionListener(this);
        p2. add(vhotel);

        bhotel=new JButton("Book Hotels");
        bhotel.setBounds(0,360,300,50);
        bhotel.setBackground(new Color(0,0,102));
        bhotel.setForeground(Color.white);
        bhotel.setFont(new Font("tahoma",Font.PLAIN,20));
        bhotel.setMargin(new Insets(0,0,0,60));
        bhotel.addActionListener(this);
        p2. add(bhotel);

        vbh =new JButton("View Booked Hotels");
        vbh.setBounds(0,405,300,50);
        vbh.setBackground(new Color(0,0,102));
        vbh.setForeground(Color.white);
        vbh.setFont(new Font("tahoma",Font.PLAIN,20));
        vbh.setMargin(new Insets(0,0,0,60));
        vbh.addActionListener(this);
        p2. add(vbh);

        destinat =new JButton("Destination");
        destinat.setBounds(0,450,300,50);
        destinat.setBackground(new Color(0,0,102));
        destinat.setForeground(Color.white);
        destinat.setFont(new Font("tahoma",Font.PLAIN,20));
        destinat.setMargin(new Insets(0,0,0,60));
        destinat.addActionListener(this);
        p2. add(destinat);

        payment =new JButton("Payment");
        payment.setBounds(0,495,300,50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.white);
        payment.setFont(new Font("tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0,0,0,60));
        payment.addActionListener(this);
        p2. add(payment);

        calcu =new JButton("Calculator");
        calcu.setBounds(0,540,300,50);
        calcu.setBackground(new Color(0,0,102));
        calcu.setForeground(Color.white);
        calcu.setFont(new Font("tahoma",Font.PLAIN,20));
        calcu.setMargin(new Insets(0,0,0,60));
        calcu.addActionListener(this);
        p2. add(calcu);

        note =new JButton("Notepad");
        note.setBounds(0,585,300,50);
        note.setBackground(new Color(0,0,102));
        note.setForeground(Color.white);
        note.setFont(new Font("tahoma",Font.PLAIN,20));
        note.setMargin(new Insets(0,0,0,60));
        note.addActionListener(this);
        p2. add(note);

        about =new JButton("About");
        about.setBounds(0,630,300,50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.white);
        about.setFont(new Font("tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0,0,0,60));
        about.addActionListener(this);
        p2. add(about);


        ImageIcon i4=new  ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1450,900,Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image=new JLabel(i6);
        image.setBounds(0,0,1450,900);
        add(image);

        JLabel taxt =new JLabel("Traveling & tourism management System");
        taxt.setBounds(400,70,1000,70);
        taxt.setForeground(Color.white);
        taxt.setFont(new Font("tahoma",Font.PLAIN,40));
        image.add(taxt);


        setVisible(true);

    }
    public static void main(String[] args) {
        new  dashbord("");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==addpersonal)
        {
            new addcustomar(username);
        } else if (ae.getSource()==view)
        {
            new viewcustomer(username);
        }
        else if (ae.getSource()==updatepersonal)
        {
            new updatecustomer(username);
        }
        else if (ae.getSource()==checkpakage) {
            new checkpackage();
        } else if (ae.getSource()==bookpakage) {
            new bookpackage(username);

        } else if (ae.getSource()==vpakage) {
            new viewpackage(username);

        } else if (ae.getSource()==vhotel) {
            new chackhotels();

        } else if (ae.getSource()==destinat) {
            new destination();

        } else if (ae.getSource()==bhotel) {
            new bookhotels(username);

        } else if (ae.getSource()==vbh) {
            new viewbookedhotel(username);
        } else if (ae.getSource()==payment) {
            new pyment();

        } else if (ae.getSource()==calcu) {
            try{
                Runtime.getRuntime().exec("calc.exe");

            }catch (Exception e)
            {
                e.printStackTrace();
            }

        } else if (ae.getSource()==note) {
            try {
                Runtime.getRuntime().exec("notepad.exe");

            }catch (Exception e)
            {
                e.printStackTrace();
            }

        } else if (ae.getSource()==about) {

            new aboutproject();
        } else if (ae.getSource()==deletepersonal) {
            new deletedetils(username);

        }


    }

}
