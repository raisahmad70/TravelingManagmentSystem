package traveling.Managment.System;

import javax.swing.*;
import java.awt.*;



    public class destination  extends JFrame implements Runnable {
        Thread t1;
        JLabel  j1,j2,j3,j4,j5,j6,j7,j8,j9,j10;
        JLabel[] jr=new JLabel[]{ j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};
        JLabel caption;

        destination()
        {
            setBounds(400,100,800,600);
            caption=new JLabel();
            caption.setBounds(50,500,1000,70);
            caption.setFont(new Font("Tahoma",Font.PLAIN,40));
            caption.setForeground(Color.white);
            add(caption);
            ImageIcon i1=null,i2=null,i3=null,i4=null,i5=null,i6=null,i7=null,i8=null,i9=null,i10=null;
            ImageIcon[] ar=new ImageIcon[]{ i1,i2,i3,i4,i5,i6,i7,i8,i9,i10};

            Image j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null,j8=null,j9=null,j10=null;
            Image[] ar1=new Image[]{ j1,j2,j3,j4,j5,j6,j7,j8,j9,j10};

            ImageIcon k1=null,k2=null,k3=null,k4=null,k5=null,k6=null,k7=null,k8=null,k9=null,k10=null;
            ImageIcon[] ar3=new ImageIcon[]{ k1,k2,k3,k4,k5,k6,k7,k8,k9,k10};



            for (int i=0;i<9;i++) {

                ar[i] = new ImageIcon(ClassLoader.getSystemResource("icons/dest"+(i+1)+".jpg"));
                ar1[i]  = ar[i].getImage().getScaledInstance(800, 600, Image.SCALE_DEFAULT);
                ar3[i] = new ImageIcon(ar1[i]);
                jr[i] = new JLabel(ar3[i]);
                jr[i].setBounds(0, 0, 800, 600);
                add(jr[i]);
            }
            t1=new Thread(this);
            t1.start();


            setVisible(true);


        }

        public static void main(String[] args) {
            new destination();
        }

        @Override
        public void run() {
            String[] hotelsname=new String[]{"Jw marriott Hotel","Madarin Oriental Hotel","Four seasons Hotels","Raddisson Blue Hotale","Classio Hotel","The bay club Hotel","Grand Hayat Hotel","The Lalit Hotel","the taj Hotel","Residency Srovar Hotel"};
            try
            {
                for (int i=0;i<8;i++)
                {
                    jr[i].setVisible(true);
                    Thread.sleep(2000);
                    jr[i].setVisible(false);
                }

            }catch (Exception e)
            {
                e.printStackTrace();
            }


        }
    }


