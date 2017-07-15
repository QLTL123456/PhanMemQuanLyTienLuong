/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import java.sql.*;
import javax.swing.*;
import DAL.*;
import net.proteanit.sql.*;
//import net.proteanit.sql.*;

/**
 *
 * @author Administrator
 */
public class UpdataTable {
    static ConnectionDB kn = new ConnectionDB(); // biến thực thi sql
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void loadData(String sql, JTable tb)
    {
        try
        {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            tb.setModel((DbUtils.resultSetToTableModel(rs)));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e, "Thông báo lỗi",1);
        }
    }

    public static ResultSet showTextfield(String sql)
    {
        try
        {
            pst = conn.prepareStatement(sql);
            return pst.executeQuery();
        }
        catch(Exception e)
        {
            return null;        
        }
    }
}
