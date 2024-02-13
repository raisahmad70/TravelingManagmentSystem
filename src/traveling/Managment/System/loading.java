package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;

public class loading extends JFrame implements Runnable{
    String username;
    Thread t;
    JProgressBar bar;
    public void run()
    {
        try
        {
            for (int i=1;i<=101;i++)
            {
                int max=bar.getMaximum();
                int value=bar.getValue();
                if (value<max) {
                    bar.setValue(bar.getValue() + 1);
                }else {
                    setVisible(false);
                    new dashbord(username);
                }

                Thread.sleep(50);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    loading(String username)
    {
        this.username=username;
        t=new Thread(this);

        setBounds(500,200,659,400);
        getContentPane().setBackground(Color.white);

        setLayout(null);

        JLabel text=new JLabel("Travel & Tour Application");
        text.setBounds(110,20,500,44);
        text.setForeground(Color.black);
        text.setFont(new Font("ralway",Font.BOLD ,35));
        add(text);

        bar=new JProgressBar();
        bar.setBounds(170,100,300,30);
        bar.setStringPainted(true);
        add(bar);

        JLabel loading=new JLabel("Loading Please Wait...");
        loading.setBounds(230,140,200,20);
        loading.setForeground(Color.red);
        loading.setFont(new Font("ralway",Font.BOLD ,15));
        add(loading);

        JLabel lbusername=new JLabel("Welcome "+username);
        lbusername.setBounds(20,310,200,20);
        lbusername.setForeground(Color.darkGray);
        lbusername.setFont(new Font("ralway",Font.BOLD ,15));
        add(lbusername);
        t.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new loading("");
    }
}
