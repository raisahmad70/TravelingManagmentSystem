package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class aboutproject extends JFrame implements ActionListener {
    JButton back;
    aboutproject()
    {
        setBounds(400,100,500,600);
        setLayout(null);
        getContentPane().setBackground(Color.gray);

        back=new JButton("Back");
        back.setBounds(200,450,80,30);
        back.addActionListener(this);
        add(back);

        JLabel l1=new JLabel("ABOUT THE APPLICATION");
        l1.setBounds(110,20,300,40);
        l1.setForeground(Color.black);
        l1.setFont(new Font("tahoma",Font.PLAIN,20));
        add(l1);

        TextArea area=new TextArea("Hello",10,40, JScrollBar.VERTICAL);
        area.setBounds(20,100,450,300);
        area.setBackground(Color.darkGray);
        area.setForeground(Color.white);
        add(area);
        setVisible(true);

    }

    public static void main(String[] args) {
        new aboutproject();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==back)
        {
            setVisible(false);
        }
    }
}
