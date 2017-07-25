package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConnection {
    private static Connection con;
    static{
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_online_exam","root", "password");
            } 
            catch (ClassNotFoundException ex) {
                System.err.println(ex);
            } catch (SQLException ex) {
                System.err.println(ex);
        }
    }
    public static Connection establishConnection() {
        if(con != null){
            System.out.println("Connection Successfully Established to Database Server");
        }
        else{
            System.out.println("Connection to Databse server Failed ");
        }
        return con;
    }
    public static void closeConnection(Connection con) throws SQLException{
        //con.close();
        System.out.println("Connection To Database Server Successfully Closed ");
    }
}
