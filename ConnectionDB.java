/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author Administrator
 */
public class ConnectionDB {
    Connection conn = null;
    public Connection getConnect(){
        try 
        {
            String URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLTL";
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL, user, pass);
            System.out.println("Ket noi thanh cong!");
        } 
        catch(Exception e){
            System.out.println("Không ket noi duoc!");
        }
        return conn;
    }
}
