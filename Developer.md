<h4 color="red" align="center"> TÀI LIỆU CHO NHÀ PHÁT TRIỂN </h4>
<hr>
Bước 1: Tạo 1 project và thiết kế project theo mô hình 3 lớp:
File -> New project -> java -> java application -> Next ->...->Finish
![h1](https://user-images.githubusercontent.com/27814649/28240594-1b43f72a-69af-11e7-85ed-78eea7431ee8.PNG)

Bước 2: Tạo các package gồm DAL, BLL, GUI có thể có DTO tương tự như sau:
Click phải chuột vào Source package -> New -> Java packge
![h2](https://user-images.githubusercontent.com/27814649/28240595-1d749d2e-69af-11e7-8854-3d555a9cc417.PNG)

- GUI: Thành phần giao diện, là các form (windows form, webform, mobile form) của chương trình tương tác với người sử dụng.
- BLL: Xử lý các nghiệp vụ của chương trình như tính toán, xử lý hợp lệ và toàn vẹn về mặt dữ liệu.
- DTO: Tầng giao tiếp với các hệ quản trị CSDL.
Bước 3: Thêm các gói thư viên hổ trợ "rs2xml.jar & sqljdbc4.jar":
Bước 4: Tạo 1 class ở tầng DTO để kết nối CSDL:
Click phải chuột vào tầng DTO -> New -> Java class
![h3](https://user-images.githubusercontent.com/27814649/28240597-1fe4ec80-69af-11e7-9078-c7c2debeaec1.PNG)

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
Bước 5: Tạo các class ở tầng BLL để xử lý các form:
Click phải chuột vào tầng BLL -> New -> Java class
![h4](https://user-images.githubusercontent.com/27814649/28240598-2209a406-69af-11e7-85dc-c1c419ad2630.PNG)
![h5](https://user-images.githubusercontent.com/27814649/28240599-24e1e8aa-69af-11e7-9939-303adbb51f44.PNG)
Bước 6: Tạo các jframe form ở tầng GUI để tương tác với người dùng:
Click phải chuột vào tầng GUI -> New -> JFrame form
![h6](https://user-images.githubusercontent.com/27814649/28240601-27e6ca8e-69af-11e7-96a0-58fba622ec20.PNG)
