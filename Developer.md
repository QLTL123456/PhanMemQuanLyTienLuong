<h4 color="red" align="center"> TÀI LIỆU CHO NHÀ PHÁT TRIỂN </h4>
<hr>
Bước 1: Tạo 1 project và thiết kế project theo mô hình 3 lớp:
File -> New project -> java -> java application -> Next ->...->Finish

Bước 2: Tạo các package gồm DAL, BLL, GUI có thể có DTO tương tự như sau:
Click phải chuột vào Source package -> New -> Java packge 
- GUI: Thành phần giao diện, là các form (windows form, webform, mobile form) của chương trình tương tác với người sử dụng.
- BLL: Xử lý các nghiệp vụ của chương trình như tính toán, xử lý hợp lệ và toàn vẹn về mặt dữ liệu.
- DTO: Tầng giao tiếp với các hệ quản trị CSDL.
Bước 3: Thêm các gói thư viên hổ trợ "rs2xml.jar & sqljdbc4.jar":
Bước 3: Tạo 1 class ở tầng DTO để kết nối CSDL:
Click phải chuột vào tầng DTO -> New -> Java class

package DAL;
import java.sql.*;
import javax.swing.*;

public class ConnectionDB {
    Connection conn = null;
    public Connection getConnect(){
        try 
        {
            String URL = "jdbc:sqlserver://127.0.0.1:1433;databaseName=QLTL";
            String user = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(URL, user, pass);
            System.out.println("Ket noi thanh cong!");
        } 
        catch(Exception e){
            System.out.println("Không ket noi duoc!");
        }
        return conn;
    }
}
Bước 4: Tạo các class ở tầng BLL để xử lý các form:
Click phải chuột vào tầng BLL -> New -> Java class

Bước 5: Tạo các jframe form ở tầng GUI để tương tác với người dùng:
Click phải chuột vào tầng GUI -> New -> JFrame form
