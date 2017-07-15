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
public class PhongBan_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themPhongBan(String maPB, String tenPB)
    {
        String sql="INSERT INTO dbo.PHONGBAN(MAPB, TENPB) values (?, ?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, maPB);
            pst.setString(2, tenPB);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaPhongBan(String maPB, String tenPB)
    {
        String sql = "UPDATE dbo.PHONGBAN SET TENPB='"+tenPB+"' where MAPB='"+maPB+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaPhongBan(String maPB)
    {
        String sql ="DELETE FROM dbo.PHONGBAN WHERE MAPB = '"+ maPB +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
