package traveling.Managment.System;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class paytm extends JFrame implements ActionListener {
    JButton back;
    paytm()
    {
        setBounds(500,200,800,600);
        JEditorPane pane=new JEditorPane();
        pane.setEditable(false);
        try {
            {
                pane.setPage("https://paytm.com/rent-payment");
            }
        }catch (Exception e)
        {
            e.printStackTrace();
            pane.setContentType("text/html");
            pane.setText("<html>could not load,Error 404");
        }
        JScrollPane sp=new JScrollPane(pane);
        getContentPane().add(sp);

        back =new JButton("Back");
        back.setBounds(610,20,80,30);
        back.addActionListener(this);
        pane.add(back);

        setVisible(true);
    }
    public static void main(String[] args) {
        new paytm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new pyment();

    }
}
