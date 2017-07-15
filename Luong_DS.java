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
public class Luong_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themLuong(String maL, String maNV, String thang, String ltu, String nlv, String bhxh, String bhyt, String tienluong)
    {
        String sql="INSERT INTO dbo.LUONG (MALUONG, MANV, THANG, LUONGTAMUNG, NGAYLAMVIEC, BHXH, BHYT, TIENLUONG) values (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, maL);
            pst.setString(2, maNV);
            pst.setString(3, thang);
            pst.setString(4, ltu);
            pst.setString(5, nlv);
            pst.setString(6, bhxh);
            pst.setString(7, bhyt);
            pst.setString(8, tienluong);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaLuong(String maL, String maNV, String thang, String ltu, String nlv, String bhxh, String bhyt, String tienluong)
    {
        String sql = "UPDATE dbo.LUONG SET MANV='"+maNV+"', THANG='"+thang+"', LUONGTAMUNG='"+ltu+"', NGAYLAMVIEC='"+nlv+"', BHXH='"+bhxh+"',BHYT='"+bhyt+"',TIENLUONG='"+tienluong+"' where MALUONG='"+maL+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaLuong(String maL)
    {
        String sql ="DELETE FROM dbo.LUONG WHERE MALUONG = '"+ maL +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
