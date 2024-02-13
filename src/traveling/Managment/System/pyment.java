package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pyment extends JFrame implements ActionListener {
    JButton pay,back;
    pyment()
    {
        setBounds(200,50,800,600);
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("Icons/paytm.jpeg"));
        Image i2=i1.getImage().getScaledInstance(800,600,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,800,600);
        add(image);
        pay=new JButton("Pay");
        pay.setBounds(420,0,80,30);
        pay.setForeground(Color.green);
        pay.setBackground(Color.darkGray);
        pay.addActionListener(this);
        image.add(pay);

        back=new JButton("Back");
        back.setBounds(520,0,80,30);
        back.setBackground(Color.darkGray);
        back.setForeground(Color.white);
        back.addActionListener(this);
        image.add(back);



        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==pay)
        {
            setVisible(false);
            new paytm();


        }else
        {
            setVisible(false);
        }
    }
}
