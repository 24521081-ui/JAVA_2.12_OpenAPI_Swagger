# JAVA_2.12_OpenAPI_Swagger
OpenAPI / Swagger integration in Java REST API

Đây là Demo của nhóm Nhiều Hành nhằm tìm hiểu cách tích hợp OpenAPI / Swagger vào ứng dụng Java REST API sử dụng Spring Boot.

Mục tiêu của project:
- Xây dựng một REST API đơn giản để quản lý sách
- Tích hợp Swagger UI để tự động sinh tài liệu API
- Giúp các thành viên trong nhóm dễ xem, dễ test và dễ hiểu các endpoint
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
