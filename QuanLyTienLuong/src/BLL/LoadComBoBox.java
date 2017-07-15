/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import java.sql.*;
import javax.swing.*;
import DAL.*;
/**
 *
 * @author Administrator
 */
public class LoadComBoBox {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void loadComBo(String sql, JComboBox cb, String bien)
    {
        try {
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next())
            {
                cb.addItem(rs.getString(bien));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Thông báo lỗi",1);
        }
    }
}
