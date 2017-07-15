/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;
import javax.swing.*;
import BLL.*;
import DAL.*;
import java.sql.*;
import java.sql.ResultSet;

public class KT_DangNhap {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static boolean KTDNAdmin(String id, String mk)
    {
        try {
        String sql1 = "select * from QUANTRI where ID = '" + id + "' and MATKHAU = '" + mk + "'";
                Statement stm = conn.createStatement();
                rs = stm.executeQuery(sql1);
                if (rs.next())
                    return true;
                else
                    return false;
                } catch (Exception e) {
        }
        return true;
    }
    
    public static boolean KTDN(String tendn, String mk)
    {
        try {
        String sql1 = "select * from NHANVIEN where MANV = '" + tendn + "' and MATKHAU = '" + mk + "'";
                Statement stm = conn.createStatement();
                rs = stm.executeQuery(sql1);
                if (rs.next())
                    return true;
                else
                    return false;
                } catch (Exception e) {
        }
        return true;
    }
}
