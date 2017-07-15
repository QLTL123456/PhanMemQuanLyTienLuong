<h4 color="red" align="center"> TÀI LIỆU CHO NHÀ PHÁT TRIỂN </h4>
<hr>
<p>Bước 1: Tạo 1 project và thiết kế project theo mô hình 3 lớp:</p>
<p>File -> New project -> java -> java application -> Next ->...->Finish</p>
<p>![h1](https://user-images.githubusercontent.com/27814649/28240594-1b43f72a-69af-11e7-85ed-78eea7431ee8.PNG)</p>

<p>Bước 2: Tạo các package gồm DAL, BLL, GUI có thể có DTO tương tự như sau:</p>
<p>Click phải chuột vào Source package -> New -> Java packge</p>
<p>![h2](https://user-images.githubusercontent.com/27814649/28240595-1d749d2e-69af-11e7-8854-3d555a9cc417.PNG)</p>

<p>- GUI: Thành phần giao diện, là các form (windows form, webform, mobile form) của chương trình tương tác với người sử dụng.</p>
<p>- BLL: Xử lý các nghiệp vụ của chương trình như tính toán, xử lý hợp lệ và toàn vẹn về mặt dữ liệu.</p>
<p>- DAL: Tầng giao tiếp với các hệ quản trị CSDL.</p>
<p>Bước 3: Thêm các gói thư viên hổ trợ "rs2xml.jar & sqljdbc4.jar":</p>
<p>![h6](https://user-images.githubusercontent.com/27814649/28240601-27e6ca8e-69af-11e7-96a0-58fba622ec20.PNG)</p>
<p>Bước 4: Tạo 1 class ở tầng DAL để kết nối CSDL:</p>
<p>Click phải chuột vào tầng DAL -> New -> Java class</p>
<p>![h3](https://user-images.githubusercontent.com/27814649/28240597-1fe4ec80-69af-11e7-9078-c7c2debeaec1.PNG)</p>

<p>Bước 5: Tạo các class ở tầng BLL để xử lý các form:</p>
<p>Click phải chuột vào tầng BLL -> New -> Java class</p>
<p>![h4](https://user-images.githubusercontent.com/27814649/28240598-2209a406-69af-11e7-85dc-c1c419ad2630.PNG)</p>

<p>Bước 6: Tạo các jframe form ở tầng GUI để tương tác với người dùng:</p>
<p>Click phải chuột vào tầng GUI -> New -> JFrame form</p>
<p>![h5](https://user-images.githubusercontent.com/27814649/28240599-24e1e8aa-69af-11e7-9939-303adbb51f44.PNG)</p>
