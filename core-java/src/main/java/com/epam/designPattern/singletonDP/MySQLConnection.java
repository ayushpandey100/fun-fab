package com.epam.designPattern.singletonDP;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnection {
   static SingletonJDBC singletonJDBC=SingletonJDBC.getInstance();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            ResultSet rs = singletonJDBC.getResult("Select * from city");
            while(rs.next()){
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
