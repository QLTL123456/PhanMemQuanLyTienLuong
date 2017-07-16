Chương 1: Cơ sở lý thuyết
<hr>
1.1. Netbean

NetBeans IDE là một công cụ hỗ trợ lập trình viết mã code miễn phí được cho là tốt nhất hiện nay, được sử dụng chủ yếu cho các lập trình viên phát triển Java tuy nhiên phần mềm có dung lượng khá là nặng dành cho các máy cấu hình có RAM, CPU tương đối cao để vận hành. Netbean được viết bằng ngôn ngữ Java và có thể chạy trên được hầu hết các hệ điều hành phổ biến như: Windows, Linux, OS X và Solaris và các nền tảng khác nhau chỉ cần một JVM (Java Virtual Machine) tương thích. NetBeans IDE được phát triển dựa trên một nền tảng có tên NetBeans Platform cho phép các ứng dụng được phát triển bởi một tập hợp các thành phần bên trong nó gọi là Mô đun ngoài ra còn hỗ trợ các ứng dụng do bên thứ 3 phát triển. Mỗi lần ra mắt phiên bản mới nhà phát triển sản phẩm này đều ra mắt thử nghiệm và nhận đánh giá từ người dùng trước khi phát hành phiên bản chính thức. Netbeans IDE có nhiều gói (Bundles) tùy chỉnh cho phép lập trình viên download về để tiết kiệm dung lượng, tốc độ vận hành ngoài một gói cài đặt đầy đủ hỗ trợ tất cả các ngôn ngữ lập trình còn lại. Netbeans hỗ trợ gợi ý cú pháp rất tốt, ngoài ra còn có các tính năng mạnh mẽ như (Format code) tự động căn chỉnh mã nguồn, Remote FTP, SVN …. và rất nhiều tĩnh năng hữu ích khác. Mã nguồn Netbean IDE mới nhất hiện nay là NetBean 8.2 .

1.2. Ngôn ngữ lập trình Java

1.1.1. Giới thiệu về ngôn ngữ lập trình JAVA

Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995 (Java 1.0 [J2SE]). Tính đến thời điểm này (tháng 2/2015) phiên bản mới nhất của Java Standard Edition (JSE) là 8. Với ưu thế về đa nền tảng (multi platform) Java càng lúc càng được ứng dụng rộng rãi trên nhiều thiết bị từ máy tính đến mobile và nhiều thiết bị phần cứng khác...Java là ngôn ngữ lập trình hướng đối tượng nên nó cũng có 4 đặc điểm chung của các ngôn ngữ hướng đối tượng

•	Tính trừu tượng (Abstraction): là tiến trình xác định và nhóm các thuộc tính, các hành động liên quan đến một thực thể đặc thù, xét trong mối tương quan với ứng dụng đang phát triển.

•	Tính đa hình (Polymorphism): cho phép một phương thức có các tác động khác nhau trên nhiều loại đối tượng khác nhau. Với tính đa hình, nếu cùng một phương thức ứng dụng cho các đối tượng thuộc các lớp khác nhau thì nó đưa đến những kết quả khác nhau. Bản chất của sự việc chính là phương thức này bao gồm cùng một số lượng các tham số.

•	Tính kế thừa (Inheritance): Điều này cho phép các đối tượng chia sẻ hay mở rộng các đặc tính sẵn có mà không phải tiến hành định nghĩa lại.

•	Tính đóng gói (Encapsulation):  là tiến trình che giấu việc thực thi những chi tiết của một đối tượng đối với người sử dụng đối tượng ấy.

Bên cạnh đó Java còn có một số đặc tính khác:

•	Độc lập nền (Write Once, Run Anywhere): Không giống như nhiều ngôn ngữ lập trình khác như C và C ++, khi Java được biên dịch, nó không được biên dịch sang mã máy cụ thể, mà thay vào đó là mã byte code chạy trên máy ảo Java (JVM). Điều này đồng nghĩa với việc bất cứ thiết bị nào có cài đặt JVM sẽ có thể thực thi được các chương trình Java.

•	Đơn giản: học Java thật sự dễ hơn nhiều so với C/C++, nếu bạn đã quen với các ngôn ngữ lập trình hướng đối tượng thì việc học Java sẽ dễ dàng hơn. Java trở nên đơn giản hơn so với C/C++ do đã loại bỏ tính đa kế thừa và phép toán con trỏ từ C/C++.

•	Bảo mật: Java hỗ trợ bảo mật rất tốt bởi các thuật toán mã hóa như mã hóa một chiều (one way hashing) hoặc mã hóa công cộng (public key)...

•	Đa luồng: Với tính năng đa luồng Java có thể viết chương trình có thể thực thi nhiều task cùng một lúc. Tính năng này thường được xử dụng rất nhiều trong lập trình game.

•	Hiệu suất cao nhờ vào trình thu gom rác (garbage collection), giải phóng bộ nhớ đối với các đối tượng không được dùng đến.

•	Linh hoạt: Java được xem là linh hoạt hơn C/C ++ vì nó được thiết kế để thích ứng với nhiều môi trường phát triển.

Java được sử dụng:

•	Viết ứng dụng web (J2EE): Java thường được sử dụng để xây dựng các hệ thống web lớn đòi hỏi độ bảo mật cao, số lượng người dùng lớn  như ngân hàng, phần mềm quản lý bệnh viện, CRM, HRM.... Đối với các website nhỏ thông thường rất ít viết bằng Java.
•	Viết ứng dụng mobile (J2ME): Trước đây nền tảng J2ME thường được sử dụng để viết game và app cho di động feature phone (file .jar) và giờ đây khi smartphone Android lên ngôi Java lại tiếp tục được sử dụng để viết app và game cho nền tảng Android (file .apk).
•	Viết ứng dụng desktop (J2SE): Các ứng dụng desktop viết bằng Java thật sự không nhiều có thể kể đến một số phần mềm như JMeter hoặc Designer Vista. Lợi thế lớn nhất của ứng dụng Java là bạn chỉ viết một lần và sau đó có thể đem chương trình lên Windows, Linux hay Mac để chạy mà không cần phải viết lại. Tuy nhiên do chạy trên JVM nên performance của ứng dụng thấp hơn một chút so với các ngôn ngữ như C/C++, C#.

Để lập trình Java bạn cần đến:

•	JDK (Java Development KIT): bao gồm JRE (Java Runtime Enviroment) và thư viện để phát triển.

•	IDE (Integrated Development Environment): là ứng dụng giúp lập trình viên phát triển dễ dàng và nhanh chóng hơn. Bạn có thể sử dụng Netbeans, Eclipse để phát triển.

1.1.2. Các thuộc tính được sử dụng

- Kiểu dữ liệu

- Sử dụng các toán tử

- Sử dụng cấu trúc lệnh If..else, do…while, switch case….

- Lập trình hướng đối tượng

1.3. Hệ quản trị CSDL SQL Server

Một cơ sở dữ liệu - CSDL(DataBase): Là một kho dữ liệu được tổ chức theo một nguyên tắc nào đó. Đó là một tập hợp các tập tin có liên quan với nhau, được thiết kế nhằm làm giảm thiểu sự dư thừa dữ liệu, đảm bảo tính tin cậy khi truy xuất dữ liệu. Các tập tin này chứa các thông tin biểu diễn các đối tượng trong một ứng dụng thế giới thực. CSDL lưu giữ thông tin của một trường đại học như : khoa, giảng viên, sinh viên, khóa học,…Thông thường, một cơ sở dữ liệu sẽ bao trùm tất cả các thông tin của một ứng dụng, không nên đặt hai cơ sở dữ liệu vào một ứng dụng.

- Dư thừa dữ liệu và tính không nhất quán (Data redundancy and inconsistency) : Do các file và các trình ứng dụng được tạo ra bởi các người lập trình khác nhau, nên các file có định dạng khác nhau, các chương trình được viết trong các ngôn ngữ lập trình khác nhau, cùng một thông tin có thể được lưu giữ trong các file khác nhau. Tính không thống nhất và dư thừa này sẽ làm tăng chi phí truy xuất và lưu trữ, hơn nũa, nó sẽ dẫn đến tính không nhất quán của dữ liệu: các bản sao của cùng một dữ liệu có thể không nhất quán .

- Khó khăn trong việc truy xuất dữ liệu: Môi trường của hệ thống xử lý file thông thường không cung cấp các công cụ cho phép truy xuất thông tin một cách hiệu quả và thuận lợi.

- Sự cô lập dữ liệu(Data isolation) : Các giá trị dữ liệu được lưu trữ trong cơ sở dữ liệu phải thoả mãn một số các ràng buộc về tính nhất quán của dữ liệu ( ràng buộc nhất quán / consistency contraints ).

- Trong hệ thống xử lý file thông thường, rất khó khăn trong việc thay đổi các chương trình để thoả mãn các yêu cầu thay đổi ràng buộc. Vấn đề trở nên khó khăn hơn khi các ràng buộc liên quan đến các hạng mục dữ liệu nằm trong các file khác nhau.

- Các vấn đề về tính nguyên tử (Atomicity problems):

+ Tính nguyên tử của một hoạt động (giao dịch) là: hoặc nó được hoàn tất trọn vẹn hoặc không có gì cả . Điều này có nghĩa là một hoạt động (giao dịch) chỉ làm thay đổi các dữ liệu bền vững khi nó đã hoàn tất (kết thúc thành công) nếu không, giao dịch không để lại một dấu vết nào trên CSDL. Trong hệ thống xử lý file thông thường khó đảm bảo được tính chất này.

+ Tính bất thường trong truy xuất cạnh tranh : Một hệ thống cho phép nhiều người sử dụng cập nhật dữ liệu đồng thời, có thể dẫn đến kết quả là dữ liệu không nhất quán. Điều này đòi hỏi một sự giám sát. Hệ thống xử lý file thông thường không cung cấp chức năng này.

- Vấn đề an toàn (Security problems): một người sử dụng hệ cơ sở dữ liệu không cần thiết và cũng không có quyền truy xuất tất cả các dữ liệu. Vấn đề này đòi hỏi hệ thống phải đảm bảo được tính phân quyền, chống truy xuất trái phép ... Các bất lợi nêu trên đã gợi mở sự phát triển các DBMS. Phần sau của giáo trình sẽ đề cập đến các quan niệm và các thuật toán được sử dụng để phát triển một hệ cơ sở dữ liệu nhằm giải quyết các vấn đề nêu trên .
<hr>
Chương 2: Phân tích và thiết kế hệ thống

2.1. Đặc tả hệ thống

Công ty có khoảng 40 cán bộ công nhân viên được phân bố hợp lý phù hợp với lĩnh vực kinh doanh đòi hỏi của nền kinh tế.

<p>Công ty có khoảng 40 cán bộ công nhân viên được phân bố hợp lý phù hợp với lĩnh vực kinh doanh đòi hỏi của nền kinh tế.</p>
	<p>Đứng đầu ban giám đốc: Thực hiện các chính sách phát triển của công ty, trực tiếp điều hành các phòng, ban chức năng. Cơ cấu tổ chức của ban giám đốc bao gồm: Giám đốc - người chịu trách nhiệm cao nhất của công ty. Sau giám đốc là 2 phó giám đốc chịu trách nhiệm phát triển kinh doanh và quản lý nguồn lực của công ty.</p>
<p>- Các phòng ban</p>
<p>+ Phòng kế toán gồm kế toán trưởng, kế toán bán hàng, kế toán các phân xưởng và thủ quỹ.</p>
<p>+ Phòng tổ chức nhân sự gồm trưởng phòng nhân sự, nhân viên văn phòng.</p>
<p><p>+ Quản đốc phân xưởng.</p>
<p>- Bộ phận kinh doanh bao gồm trưởng phòng kinh doanh, nhân viên bán hàng và nhân viên khai thác tìm kiếm thị trường.</p>

  
- Các phòng ban

+ Phòng kế toán gồm kế toán trưởng, kế toán bán hàng, kế toán các phân xưởng và thủ quỹ.

+ Phòng tổ chức nhân sự gồm trưởng phòng nhân sự, nhân viên văn phòng.

+ Quản đốc phân xưởng.

- Bộ phận kinh doanh bao gồm trưởng phòng kinh doanh, nhân viên bán hàng và nhân viên khai thác tìm kiếm thị trường.

2.2. Sơ đồ phân rã chức năng (BFD) - (Business Function Diagram)

Sơ Đồ Chức Năng Quản Lý Tiền Lương

![image](https://user-images.githubusercontent.com/27814649/28243846-49ebf402-6a03-11e7-9cd5-abd54e7a2b9a.png)

2.3. Sơ đồ dòng dữ liệu (DFD) - Data Flow Diagram 

	Biểu Đồ Mức Ngữ Cảnh – Quản Lý Tiền Lương
  
![image](https://user-images.githubusercontent.com/27814649/28243848-701cff18-6a03-11e7-9ef8-34643381bca1.png)

DFD mức đỉnh – Quản lý Tiền Lương

![image](https://user-images.githubusercontent.com/27814649/28243851-8b6f9474-6a03-11e7-8c1e-5e79bf43cde5.png)

DFD mức đỉnh chức năng 1 – Quản lý Tiền Lương

![image](https://user-images.githubusercontent.com/27814649/28243854-a23793d2-6a03-11e7-8e8a-6d01cee2336a.png)

DFD mức đỉnh chức năng 3 – Quản lý Tiền Lương

![image](https://user-images.githubusercontent.com/27814649/28243858-bca185b6-6a03-11e7-89fd-8addacecfbcf.png)

2.4. Sơ đồ thực thể - quan hệ (ERD)

<p>•	Thực thể PHONGBAN:</p>
<p>Mỗi thực thể tượng trưng cho phòng ban</p>
<p>Các thuộc tính: MAPB, TENPB.</p>
<p>Mô tả: mỗi phong ban sẽ lưu thông tin về mã phòng ban, tên phòng ban.</p>
<p>•	Thực thể NHANVIEN:</p>
<p>Mỗi thực thể tượng trưng cho một nhân viên</p>
<p>Các thuộc tính: MANV, HOTENNV, DIACHI, THUONGTRU, SODIENTHOAI, NGAYSINH, NOISINH, GIOITINH, CMND, QUEQUAN, DANTOC, SOSOBH, ANHNHANVIEN, GHICHU, MAPB, MACV.</p>
<p>Mô tả: mỗi thực thể sẽ có mã nhân viên, họ tên nhân viên, địa chỉ, thường trú, số điện thoại, ngày sinh, nơi sinh, giới tính, chứng minh nhân dân, quê quán, dân tộc, số sổ bảo hiểm, ảnh nhân viên, ghi chú, mã phòng ban, mã chức vụ. </p>
<p>•	Thực thể CHUCVU:</p>
<p>Mỗi thực thể tượng trưng cho chức vụ của nhân viên</p>
<p>Các thuộc tính: MACV, TENCV.</p>
<p>Mô tả: mỗi nhân viên làm các công việc theo mã chức vụ.</p>
<p>•	Thực thể QUATRINHCONGTAC:</p>
<p>Mỗi thực thể tượng trưng một quá trình công tác của một nhân viên.</p>
<p>Các thuộc tính: MAQTCT, MANV, TGBATDAU, TGKETTHUC, MACV, TENCONGTY.</p>
<p>Mô tả: Mỗi quá trình công tác đều có thời gian bắt đầu và thời gian kết thúc.</p>
<p>•	Thực thể BANGCAP: </p>
<p>Mỗi thực thể tượng trưng cho loại bằng cấp của mỗi nhân viên .</p>
<p>Các thuộc tính: MABC, MANV, TENPB, LOAIBC, NGAYCAP, DONVICAP.</p>
<p>Mô tả: Mỗi loại có chi tiết về bằng cấp của mỗi nhân viên.</p>
<p>•	Thực thể LUONG:</p>
<p>Mỗi thực thể tượng trưng cho tiền lương của mỗi nhân viên.</p>
<p>Các thuộc tính: MALUONG, MANV, THANG, LUONGTAMUNG, BHCH, BHYT, TIENLUONG, MATHUE.</p>
<p>Mô tả: Mỗi tháng sẽ cập nhật lương cho nhân viên vào bảng lương</p>
<p>•	Thực thể BANGCHAMCONG:</p>
<p>Mỗi thực thể tượng trưng cho bảng công của nhân viên</p>
<p>Các thuộc tính: MABCC, MANV, THANG, NGAYLAMVIEC, NGAYPHEP, NGAYKHONGPHEP.</p>
<p>Mô tả: Mỗi tháng sẽ cập nhật công làm việc của từng nhân viên vào bảng công.</p>
<p>•	Thực thể THUONG:</p></p>
<p>Mỗi thực thể tượng trưng cho một hệ số thưởng của mỗi nhân viên.</p>
<p>Các thuộc tính: MANV, DIPTHUONG, TIENTHUONG.</p>
<p>Mô tả: mỗi nhân viên sẽ nhận được tiền thưởng vào những dịp lễ.</p>

Mô hình ERD:

![image](https://user-images.githubusercontent.com/27814649/28243875-276efbee-6a04-11e7-83fc-7716184ed4c4.png)

2.5. Thiết kế hệ thống: Thiết kế và mô tả mô hình dữ liệu vật lý

- Mô tả chi tiết quan hệ PHONGBAN


![h1](https://user-images.githubusercontent.com/27814649/28243889-6e769dda-6a04-11e7-9285-71dc24133566.PNG)

- Mô tả chi tiết quan hệ CHUCVU

![h2](https://user-images.githubusercontent.com/27814649/28243890-7153cce4-6a04-11e7-82da-b86814167089.PNG)

- Mô tả chi tiết quan hệ  NHANVIEN

![h3](https://user-images.githubusercontent.com/27814649/28243891-73966f16-6a04-11e7-8e03-cefe1f7fb513.PNG)

- Mô tả chi tiết quan hệ QUATRINHCONGTAC

![h4](https://user-images.githubusercontent.com/27814649/28243892-75c76920-6a04-11e7-9c6d-c752467e39e8.PNG)

- Mô tả chi tiết quan hệ BANGCAP

![h5](https://user-images.githubusercontent.com/27814649/28243893-778df7a6-6a04-11e7-9066-08ca010621e7.PNG)

- Mô tả chi tiết quan hệ LUONG

![h6](https://user-images.githubusercontent.com/27814649/28243894-7a003bb6-6a04-11e7-9a50-8791a29f130c.PNG)

- Mô tả chi tiết quan hệ BANGCHAMCONG

![h7](https://user-images.githubusercontent.com/27814649/28243895-7cbd9c04-6a04-11e7-94eb-2bbd9e5fd7ed.PNG)

- Mô tả chi tiết quan hệ THUONG

![h8](https://user-images.githubusercontent.com/27814649/28243896-8275de54-6a04-11e7-9e4b-c6431704b1b2.PNG)
