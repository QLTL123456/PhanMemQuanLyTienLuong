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
public class NhanVien_DS {
    static ConnectionDB kn = new ConnectionDB();
    public static PreparedStatement pst = null;
    public static ResultSet rs = null;
    public static Connection conn = kn.getConnect();
    
    public static void themNhanVien(String maNV, String hotenNV, String dc, String tt, String sdt, String ns, String noisinh, String gt, String cmnd, String qq, String dt, String gc, String maPB, String maCV, String mk)
    {
        String sql="INSERT INTO dbo.NHANVIEN (MANV, HOTENNV, DIACHI, THUONGTRU, SODIENTHOAI, NGAYSINH, NOISINH, GIOITINH, CMND, QUEQUAN, DANTOC, GHICHU, MAPB, MACV, MATKHAU) values (?, ?, ?, ?, ?, ?,?,?,?,?,?,?,?,?,?)";
        try {
            pst=conn.prepareStatement(sql);
            pst.setString(1, maNV);
            pst.setString(2, hotenNV);
            pst.setString(3, dc);
            pst.setString(4, tt);
            pst.setString(5, sdt);
            pst.setString(6, ns);
            pst.setString(7, noisinh);
            pst.setString(8, gt);
            pst.setString(9, cmnd);
            pst.setString(10, qq);
            pst.setString(11, dt);
            pst.setString(12, gc);
            pst.setString(13, maPB);
            pst.setString(14, maCV);
            pst.setString(15, mk);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể thêm được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void suaNhanVien(String maNV, String hotenNV, String dc, String tt, String sdt, String ns, String noisinh, String gt, String cmnd, String qq, String dt, String gc, String maPB, String maCV, String mk)
    {
        String sql = "UPDATE dbo.NHANVIEN SET HOTENNV='"+hotenNV+"', DIACHI='"+dc+"', THUONGTRU='"+tt+"', SODIENTHOAI='"+sdt+"', NGAYSINH='"+ns+"', NOISINH='"+noisinh+"', GIOITINH='"+gt+"',CMND='"+cmnd+"',QUEQUAN='"+qq+"',DANTOC='"+dt+"',GHICHU='"+gc+"',MAPB='"+maPB+"',MACV='"+maCV+"',MATKHAU='"+mk+"' where MANV='"+maNV+"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã sữa thành thàng công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể sữa được, xin kiểm tra lại", "Thông báo",1);
        }
    }
    public static void xoaNhanVien(String maNV)
    {
        String sql ="DELETE FROM dbo.NHANVIEN WHERE MANV = '"+ maNV +"'";
        try {
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "Đã xóa thành công", "Thông báo",1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Không thể xóa xin kiểm tra lại!", "Thông báo",1);
        }
    }
}
