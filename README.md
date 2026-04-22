# JAVA_2.12_OpenAPI_Swagger
OpenAPI / Swagger integration in Java REST API

Đây là Demo của nhóm Nhiều Hành nhằm tìm hiểu cách tích hợp OpenAPI / Swagger vào ứng dụng Java REST API sử dụng Spring Boot.

Mục tiêu của Demo:
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
## Tài liệu hướng dẫn

Nhóm **Nhiều Hành** có chuẩn bị thêm tài liệu hướng dẫn chi tiết trong thư mục `docs`:

- [Hướng dẫn cài đặt môi trường](docs/huong-dan-cai-dat-moi-truong.md)
- [Hướng dẫn test API](docs/huong-dan-test-api.md)

Video tham khảo cài đặt môi trường:
- [YouTube - Hướng dẫn cài đặt môi trường](https://www.youtube.com/watch?v=5SrMw54iTYA)
---

## Bộ source code tối thiểu cần dùng

Để chạy project, các thành viên trong nhóm chỉ cần chuẩn bị đúng cấu trúc source code tối thiểu sau:

- `Book.java`
- `BookController.java`
- `NewDemoApplication.java`
- `application.properties`
- `pom.xml`

Trong đó:
- 3 file Java là phần code chính của project
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
