## Các đường link để test và mô tả

### 1. Giao diện Swagger UI
http://localhost:8081/swagger-ui.html

**Mô tả:**
- Đây là giao diện chính để xem tài liệu API trên trình duyệt.
- Mọi người có thể xem danh sách các endpoint, tham số đầu vào, dữ liệu mẫu và thử trực tiếp từng API bằng nút **Try it out**.
- Đây là phần thể hiện rõ nhất việc nhóm đã tích hợp **Swagger UI vào Java REST API**.
- Link này liên quan trực tiếp đến đề tài vì nó chính là giao diện tài liệu API được sinh tự động từ mã nguồn.

---

### 2. OpenAPI JSON
http://localhost:8081/v3/api-docs

**Mô tả:**
- Đây là dữ liệu mô tả toàn bộ API ở dạng JSON.
- File JSON này được **tự động sinh ra từ code Java** mà nhóm đã viết, cụ thể là từ các controller, endpoint và annotation như `@GetMapping`, `@PostMapping`, `@Operation`, `@Parameter`,...
- Swagger UI sử dụng chính dữ liệu JSON này để hiển thị giao diện tài liệu API trên trình duyệt.
- Thể hiện được ý tưởng **OpenAPI tự động sinh tài liệu API từ mã nguồn Java**, thay vì nhóm phải viết tài liệu API thủ công.

**Giải thích rõ hơn về “tự động sinh JSON”:**
- Nhóm tụi mình chỉ viết code Java REST API.
- Khi chạy ứng dụng, Spring Boot kết hợp với OpenAPI/Swagger sẽ tự quét code.
- Sau đó hệ thống tự tạo ra một file mô tả API ở dạng JSON tại đường dẫn `/v3/api-docs`.
- Nói đơn giản:  
  **code Java REST API → tự động tạo JSON mô tả API → Swagger UI đọc JSON đó để hiển thị tài liệu API**

---

### 3. Lấy toàn bộ danh sách sách
GET http://localhost:8081/books

**Mô tả:**
- Dùng để lấy tất cả sách hiện có trong hệ thống.
- Đây là ví dụ cho phương thức `GET` trong REST API.
- Endpoint này thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó là một endpoint REST API thật sự được viết bằng Java, sau đó được OpenAPI/Swagger tự động đưa vào tài liệu API.

---

### 4. Tra cứu sách theo mã
GET http://localhost:8081/books/search?id=B001

**Mô tả:**
- Dùng để tra cứu sách theo mã sách.
- Endpoint này minh họa cách sử dụng `@RequestParam` để nhận dữ liệu đầu vào từ URL.
- Thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó cho thấy hệ thống không chỉ có API đơn giản, mà còn có API có tham số đầu vào, và OpenAPI vẫn tự động mô tả được endpoint đó trong tài liệu.

---

### 5. Tra cứu sách theo tên sách
GET http://localhost:8081/books/search?tenSach=Java

**Mô tả:**
- Dùng để tìm sách theo tên sách.
- Minh họa chức năng tìm kiếm linh hoạt theo từ khóa.
- Thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó cho thấy tài liệu API được sinh tự động vẫn mô tả được các endpoint tìm kiếm theo điều kiện cụ thể.

---

### 6. Tra cứu sách theo tác giả
GET http://localhost:8081/books/search?tacGia=Do%20Van%20Nhon

**Mô tả:**
- Dùng để tìm sách theo tên tác giả.
- Minh họa thêm việc sử dụng parameter trong REST API.
- Thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó tiếp tục chứng minh API có thể nhận nhiều kiểu điều kiện tra cứu khác nhau và đều được Swagger tự động hiển thị.

---

### 7. Tra cứu sách theo thể loại
GET http://localhost:8081/books/search?theLoai=Cong%20nghe

**Mô tả:**
- Dùng để lọc sách theo thể loại.
- Minh họa việc sử dụng query parameter để lọc dữ liệu.
- Thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó cho thấy tài liệu API không chỉ mô tả đường dẫn, mà còn hỗ trợ mô tả tham số lọc dữ liệu trong endpoint.

---

### 8. Tra cứu kết hợp nhiều điều kiện
GET http://localhost:8081/books/search?tenSach=Java&theLoai=Cong%20nghe

**Mô tả:**
- Dùng để tra cứu sách theo nhiều điều kiện cùng lúc.
- Thể hiện REST API có thể nhận nhiều parameter trong cùng một endpoint.
- Thuộc nhóm **Tra cứu sách**.
- Link này liên quan đến đề tài vì nó minh họa rõ hơn khả năng của OpenAPI/Swagger trong việc tự động sinh tài liệu cho các API có nhiều tham số đầu vào.

---

## Kết luận về ý nghĩa của các link đối với đề tài

Các đường link trên không chỉ dùng để test chức năng của chương trình mà còn giúp chứng minh đúng trọng tâm đề tài:

- Nhóm đã xây dựng **REST API bằng Java**
- Hệ thống đã được tích hợp **OpenAPI / Swagger**
- `swagger-ui.html` thể hiện giao diện tài liệu API trực quan
- `v3/api-docs` thể hiện dữ liệu OpenAPI JSON được tự động sinh từ code
- Mọi người có thể vừa xem tài liệu API, vừa kiểm thử trực tiếp trên giao diện Swagger UI

Nói ngắn gọn, các link này chính là bằng chứng cho thấy đề tài đã thực hiện được việc:

**“Tích hợp OpenAPI / Swagger vào Java REST API để tự động sinh tài liệu API cho ứng dụng.”**
