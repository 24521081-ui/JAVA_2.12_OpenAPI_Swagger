# Hướng dẫn cài đặt môi trường

Tài liệu này dùng để hướng dẫn các thành viên trong nhóm Nhiều Hành chuẩn bị môi trường để chạy đề tài JAVA_2.12_OpenAPI_Swagger**.

## 1. Video tham khảo cài đặt môi trường
Video hướng dẫn:

- https://www.youtube.com/watch?v=5SrMw54iTYA

Nhóm có thể mở video này để xem cách cài đặt và chuẩn bị môi trường chạy project Java / Spring Boot.

---

## 2. Các bước chuẩn bị cơ bản

### Bước 1: Cài Java
Cần cài JDK để chạy project Java.

### Bước 2: Cài VS Code hoặc IntelliJ IDEA
Có thể dùng:
- VS Code
- IntelliJ IDEA

### Bước 3: Mở demo

### Bước 4: Kiểm tra Maven
Đảm bảo file `pom.xml` được load bình thường để project tải đúng các thư viện cần thiết.

### Bước 5: Kiểm tra file cấu hình
Mở file `application.properties` và xác nhận project đang chạy ở port:

```properties id="e98m6r"
server.port=8081
springdoc.swagger-ui.defaultModelsExpandDepth=-1
springdoc.swagger-ui.docExpansion=none
springdoc.swagger-ui.tagsSorter=alpha
springdoc.swagger-ui.operationsSorter=alpha
