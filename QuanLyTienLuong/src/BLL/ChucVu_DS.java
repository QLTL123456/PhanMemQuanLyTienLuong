/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

/**
 *
 * @author Administrator
 */
import java.sql.*;
import javax.swing.*;
import DAL.*;
/**
 *
 * @author Administrator
 */
public class ChucVu_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themChucVu(String maCV, String tenCV)
    {
        String sql="INSERT INTO dbo.CHUCVU(MACV, TENCV) values (?, ?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, maCV);
            pst.setString(2, tenCV);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaChucVu(String maCV, String tenCV)
    {
        String sql = "UPDATE dbo.CHUCVU SET TENCV='"+tenCV+"' where MACV='"+maCV+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaChucVu(String maCV)
    {
        String sql ="DELETE FROM dbo.CHUCVU WHERE MACV = '"+ maCV +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
