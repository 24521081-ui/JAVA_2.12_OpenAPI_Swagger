
<p align="center">
  <a href="https://www.uit.edu.vn/" title="Trường Đại học Công nghệ Thông tin">
    <img src="https://i.imgur.com/WmMnSRt.png" alt="Trường Đại học Công nghệ Thông tin | University of Information Technology" width="750">
  </a>
</p>

<h1 align="center"><b>IS216 - Lập Trình Java</b></h1>

<h2 align="center">JAVA_2.12_OpenAPI_Swagger</h2>
<h3 align="center">OpenAPI / Swagger integration in Java REST API</h3>
## THÀNH VIÊN NHÓM NHIỀU HÀNH


| STT | MSSV     | Họ và tên |
|-----|----------|-----------|
| 1 | 24520322 | Nguyễn Thành Đức |
| 2 | 24520336 | Huỳnh Đức Dũng |
| 3 | 24520409 | Sơn Nguyễn Kỳ Duyên |
| 4 | 24520663 | Lai Mộc Huy |
| 5 | 24520978 | Dương Đức Lộc |
| 6 | 24520986 | Phương Thiên Lộc |
| 7 | 24521034 | Châu Gia Lương |
| 8 | 24521081 | Nguyễn Văn Minh |
| 9 | 24521093 | Nguyễn Thế Mỹ | 


# JAVA_2.12_OpenAPI_Swagger
OpenAPI / Swagger integration in Java REST API

Đây là demo của nhóm Nhiều Hành nhằm tìm hiểu cách tích hợp OpenAPI / Swagger vào ứng dụng Java REST API sử dụng Spring Boot.

Mục tiêu của demo:
- Xây dựng một REST API đơn giản để quản lý sách
- Tích hợp Swagger UI để tự động sinh tài liệu API
- Giúp mọi người dễ xem, dễ test và dễ hiểu các endpoint
---

## 1. Nội dung chính của Demo

Demo hiện tại gồm các chức năng chính:

### Nhóm tra cứu sách
- Lấy danh sách tất cả sách
- Tra cứu sách theo một trong những các điều kiện sau:
  + Mã sách
  + Tên sách
  + Tác giả
  + Thể loại

### Nhóm quản lý sách
- Thêm sách mới
- Cập nhật thông tin sách
- Xóa sách theo mã

---

## 2. Công nghệ sử dụng

- Java
- Spring Boot
- Maven
- OpenAPI / Swagger UI

---

## 3. Cấu trúc Demo cơ bản

- `Book.java`  
  Class mô tả đối tượng sách

- `BookController.java`  
  Nơi chứa các REST API để tra cứu và quản lý sách

- `DemoApplication.java`  
  File chạy chính của ứng dụng Spring Boot

- `application.properties`  
  File cấu hình port và giao diện Swagger

---
## Tài liệu hướng dẫn

Nhóm **Nhiều Hành** có chuẩn bị thêm tài liệu hướng dẫn chi tiết trong thư mục `docs`:

- [Hướng dẫn cài đặt môi trường](docs/huong-dan-cai-dat-moi-truong.md)
- [Hướng dẫn test API](docs/links-test-cung-mo-ta.md)

Video tham khảo cài đặt môi trường:
- [YouTube - Hướng dẫn cài đặt môi trường](https://www.youtube.com/watch?v=5SrMw54iTYA)
---

## Bộ source code tối thiểu cần dùng

Để chạy project, các bạn chỉ cần chuẩn bị đúng cấu trúc source code tối thiểu sau:

- `Book.java`
- `BookController.java`
- `NewDemoApplication.java`
- `application.properties`
- `pom.xml`

Trong đó:
- 3 file Java là phần code chính của demo
- `application.properties` dùng để cấu hình port và giao diện Swagger
- `pom.xml` dùng để quản lý thư viện Spring Boot và Swagger

## Tụi mình dùng
- Java 17
- Maven (check phiên bản trong pom.xml)
- Kết nối Internet để tải dependency lần đầu

## Cách chạy
1. Mở project
2. Đợi Maven tải dependency
3. Chạy file DemoApplication.java
4. Truy cập vào file các docs để test các links
