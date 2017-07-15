<h4 style="color:red; text-align:center;"> THÔNG TIN VỀ TỔ CHỨC MÃ NGUỒN </h4>
<hr>
Gồm 3 lớp (not Class) chính:
+ Graphic User Interface (GUI): Thành phần giao diện, là các form (windows form, webform, mobile form) của chương trình tương tác với người sử dụng.
+ Business Logic Layer (BLL): Xử lý các nghiệp vụ của chương trình như tính toán, xử lý hợp lệ và toàn vẹn về mặt dữ liệu.
+ Data Access Layer (DAL): Tầng giao tiếp với các hệ quản trị CSDL
Trong 1 số trường hợp vì lượng thông tin gởi nhiều ta có thể dùng Data Tranfer Object (DTO) để chuyển đối tượng hoặc danh sách đối tượng giữa các tầng với nhau cho tiện dụng. (Entity- Thuc the)
<p><img src="https://user-images.githubusercontent.com/27814649/28239868-ebfff4e6-699f-11e7-99e0-1483300d0881.PNG"></p>
Theo như hình vẽ: mô tả sự hoạt động của mô hình 3-layer gồm 2 tiến trình sau:
Các đường mũi tên màu cam biểu diễn cho 1 tiến trình giao tiếp từ GUI đến Data Acess Layer:
- (1) Người sử dụng tác động lên GUI yêu cầu hiển thị thông tin lên màn hình. Tại đây GUI sẽ kiểm tra yêu cầu của người dùng nhập có hợp lệ hay không, nếu không hợp lệ sẽ thông báo cho người dùng.
- Ngược lại yêu cầu sẽ được gởi trực tiếp đến BLL (2) hoặc thông qua lớp object DTO hỗ trợ luân chuyển (2.1 & 2.2), tại đây BLL sẽ xử lý nghiệp vụ về yêu cầu của người dùng, nếu yêu cầu không hợp lệ hoặc tự xử lý yêu cầu không cần phải truy vấn thì BLL sẽ gởi thông tin về GUI (3) và GUI sẽ hiển thị kết quả cho người dùng.
- Trong trường hợp BLL cần thao tác trên dữ liệu từ CSDL thì BLL sẽ gởi yêu cầu đến trực tiếp đến DAL (4) hoặc thông qua DTO (4.1 & 4.2), nhờ DAL giao tiếp với hệ quản trị CSDL (5) lấy hoặc thêm, xóa, sửa dữ liệu.
- DAL sẽ giao tiếp hệ quản trị CSDL (5) với các truy vấn (sử dụng công nghệ ADO, LINQ to SQL, NHibernate, Entity Framework)
Tại đây tiếp tục thực hiện tiến trình thứ 2 được biểu diễn bằng các mũi tên màu xanh:
- Sau khi DAL thực hiện giao tiếp, hệ quản trị CSDL sẽ trả kết quả truy vấn về DAL (7), DAL sẽ gởi thông tin về dữ liệu vừa lấy trực tiếp sang BLL (8) hoặc thông qua DTO (8.1 & 8.2) xử lý tiếp nghiệp vụ với yêu cầu đã gởi từ trước, sau khi xử lý xong nghiệp vụ, BLL sẽ gởi thông tin đến GUI (10), GUI sẽ hiển thị thông báo và kết quả yêu cầu lên màn hình.
VD: Mô tả hoạt động của mô hình 3-layer với ứng dụng liệt kê danh sách điểm sinh viên:
Từ màn hình form quản lý sinh viên gồm có 1 combobox chọn lớp, 1 gridview để hiển thị danh sách sinh viên và 1 button để thực hiện lệnh liệt kê danh sách
(1) Người dùng chọn combobox lớp trên GUI và ấn button liệt kê (2) GUI kiểm tra yêu cầu chọn combobox hợp lệ và gởi mã lớp (**) vừa chọn sang BUS xử lý yêu cầu hiển thị danh sách điểm sinh viên (4) Tại BUS vì yêu cầu từ GUI khá đơn giản nên BUS sẽ không xử lý gì mà sẽ gởi mã lớp sang DAL lấy danh sách điểm (5) Tại DAL sau khi đã nhận được yêu cầu lấy danh sách điểm từ mã lớp, DAL sẽ tương tác với hệ quản trị CSDL. (6) qua các lệnh mở tập tin, kết nối, truy vấn,… để lấy được danh sách điểm (7) với mã số yêu cầu, DAL tiếp tục gởi danh sách (**) này sang BUS để xử lý.
(8) Tại BUS sau khi nhận được danh sách điểm từ DAL gởi sang, BUS thực hiện nghiệp vụ của mình bằng cách tính điểm trung bình, kết luận đậu/rớt của từng sinh viên (tất cả xử lý về mặt nghiệp vụ), sau đó gởi danh sách điểm đã xử lý (**) sang GUI để hiển thị (9) 1 lần nữa GUI có thể kiểm tra tính hợp lệ của dữ liệu và hiển thị thông tin và thông báo lên màn hình cho người dùng (10) (**) Trong 1 số trường hợp vì lượng thông tin gởi nhiều, ví dụ như 1 sinh viên gồm nhiều thuộc tính như họ tên, tuổi, ngày sinh,… ta có thể dùng DTO để chuyển đối tượng hoặc danh sách đối tượng giữa các tầng với nhau cho tiện dụng.
3. Cách tổ chức mô hình trên ứng dụng .NET
- Với mỗi tầng (DAL,BLL) ta tạo 1 project mới kiểu Class Library, sau khi build ra các dll như: BLL.dll, DAL.dll . Khi đó:
+ Tầng GUI là project chính chương trình, vì đặc điểm GUI chỉ thấy BLL nên ta sẽ add references BLL.dll từ tab project vào GUI
+ Tầng BLL chỉ thấy được DAL, ta tiếp tục add references DAL.dll vào BUS
+ Tầng DAL giao tiếp được với database nên ta chỉ sử dụng các namespace data provider để tương tác với hệ quản trị CSDL
4. Một số câu kinh nghiệm khi sử dụng:
- Các thao tác trên control như: kiểm tra nhập hợp lệ, ẩn hiện các control, và các xử lý thông tin trên control thì ta đặt các hàm xử lý ngay trên GUI
- Các thao tác trên các dữ liệu cơ bản như: List, Array List, Object, DataTable, string, int, long, float,… ta xử lý ngay chính tầng nghiệp vụ BLL, vì bản chất khi thay đổi hệ quản trị hay các platform thì BLL không thay đổi
- Các thao tác với CSDL như truy vấn, kết nối, đóng kết nối,… ta xử lý trong DAL
- Khi có nhu cầu thay đổi hệ quản trị CSDL, ta chỉ cần thay đổi DAL phù hợp với hệ quản trị mới, giữ nguyên BLL, GUI và build lại project.
- Khi có nhu cầu chuyển đổi qua lại giữa ứng dụng web forms hoặc win forms ta chỉ cần thay GUI, giữ nguyên DAL, BUS và build lại project.
5. Sự khác biệt giữa 3-tiers và 3-layer:
3-tiers có nghĩa là 3 tầng, 3-layer có nghĩa là 3 lớp. Về mặt ý nghĩa tầng sẽ lớn hơn lớp, mỗi tầng sẽ có nhiều lớp

