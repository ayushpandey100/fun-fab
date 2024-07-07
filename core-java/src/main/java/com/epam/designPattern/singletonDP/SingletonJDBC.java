package com.epam.designPattern.singletonDP;

import java.sql.*;

public class SingletonJDBC {
    private static SingletonJDBC singletonJDBC=null;

    private SingletonJDBC(){
    }
    public static SingletonJDBC getInstance(){
        if(singletonJDBC==null){
            singletonJDBC=new SingletonJDBC();
        }
        return singletonJDBC;
    }
    private Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/world","root","1234");
        return con;

    }
    private Statement getStatement() throws SQLException, ClassNotFoundException {
        return getConnection().createStatement();
    }
    public ResultSet getResult(String myQuery) throws SQLException, ClassNotFoundException {
        return getStatement().executeQuery(myQuery);
    }
}
