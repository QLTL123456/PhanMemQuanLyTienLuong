/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
/**
 *
 * @author Administrator
 */
public class KT_connectionDB {
    static ConnectionDB kn = new ConnectionDB();
    public static void main(String[] args){
        Connection cn = kn.getConnect();
        Statement stm = null;
        ResultSet rs = null;
        try{
                
            } catch (Exception e) {
            }
    }
}
