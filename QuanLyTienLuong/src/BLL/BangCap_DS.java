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
public class BangCap_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themBangCap(String maBC, String maNV, String tenBC, String loaiBC, String ngaycap, String donvicap)
    {
        String sql="INSERT INTO dbo.BANGCAP(MABC, MANV, TENBC, LOAIBC, NGAYCAP, DONVICAP) values (?, ?, ?, ?, ?, ?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, maBC);
            pst.setString(2, maNV);
            pst.setString(3, tenBC);
            pst.setString(4, loaiBC);
            pst.setString(5, ngaycap);
            pst.setString(6, donvicap);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaBangCap(String maBC, String maNV, String tenBC, String loaiBC, String ngaycap, String donvicap)
    {
        String sql = "UPDATE dbo.BANGCAP SET MANV='"+maNV+"', TENBC='"+tenBC+"', LOAIBC='"+loaiBC+"', NGAYCAP='"+ngaycap+"', DONVICAP='"+donvicap+"' where MABC='"+maBC+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaBangCap(String maBC)
    {
        String sql ="DELETE FROM dbo.BANGCAP WHERE MABV = '"+ maBC +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
