Thời gian: 70 phút

Mỗi **Hóa đơn** có các thuộc tính: Mã, ngày xuất, họ và tên khách hàng, tiền thanh toán(không nhập vào).

**Hóa đơn theo ngày** có: số ngày thuê.
**Hóa đơn theo giờ** có: số giờ thuê.

I. Tạo lớp **HoaDon** (0.5)

II. Tạo interface **IHoaDon**, tính số tiền thanh toán **(getTienTT())**. Trong đó với hóa đơn ngày tiền = 300 x số ngày thuê (nếu số ngày nhỏ hơn 7) và được giảm 10% khi thuê từ 7 ngày trở lên. Còn hóa đơn giờ, tiền = 50 x số giờ thuê (nếu số giờ nhỏ hơn 5 giờ) và được giảm 30% khi từ 5 giờ trở lên. (0.5)

III. Tạo 2 lớp **HoaDonNgay** và **HoaDonGio** (kế thừa từ lớp **HoaDon** và cài đặt interface **IHoaDon**).(2)

IV. Tạo interface **IChucNang** với 7 chức năng(menu)

V. Tạo 1 lớp **QLKS** có 1 danh sách chứa các đối tượng trên, và cài đặt các phương thức trong interface **IChucNang**. Các chức năng như sau:
    
1. Nhập hóa đơn theo ngày (không trùng mã bắt đầu là N hoặc X rồi 2 số, ngày xuất 2 hoặc 1 số cho ngày, 2 hoặc 1 số cho tháng và 4 số cho năm) (1.5)
2. Nhập hóa đơn theo giờ (1)
3. Viết ra danh sách toàn bộ hóa đơn của khách sạn - có tính số lượng ở cuối (1)
4. Lưu hóa đơn vào file hd.dat 
5. Sửa 1 **hóa đơn theo ngày** khi nhập mã (1)
6. Sắp xếp **hóa đơn** theo ngày xuất (1)
7. Đưa ra tổng số tiền của các **hóa đơn** theo từng năm (1)

***Thêm:*** 
   - Nhập hay sửa đều có hợp lệ dữ liệu cho: mã, ngày xuất và các thuộc tính số
   - Khi chạy chương trình thì tự động đọc danh sách hóa đơn từ file ra