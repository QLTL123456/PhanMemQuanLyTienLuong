/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import java.sql.*;
import javax.swing.*;
import DAL.*;
public class QuanTri_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themQuanTri(String id, String mk, String ht)
    {
        String sql="INSERT INTO dbo.QUANTRI(ID, MATKHAU, HOTEN) values (?, ?, ?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, id);
            pst.setString(2, mk);
            pst.setString(3, ht);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaQuanTri(String id, String mk, String ht)
    {
        String sql = "UPDATE dbo.QUANTRI SET MATKHAU='"+mk+"', HOTEN='"+ht+"' where ID='"+id+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaQuanTri(String id)
    {
        String sql ="DELETE FROM dbo.QUANTRI WHERE ID = '"+ id +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
