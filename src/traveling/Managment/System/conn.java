package traveling.Managment.System;

import java.sql.*;
public class conn {
    Connection c;
    Statement s;
    conn()
    {

        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelingmanagementsystem","root","@2001Rais");
           s = c.createStatement();
       }catch (Exception e)
       {
          e.printStackTrace();
       }

    }

    public static void main(String[] args) {
        new conn();
    }
    }

