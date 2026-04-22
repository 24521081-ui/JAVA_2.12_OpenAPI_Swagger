package com.nhieuhanh.__demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.*;
/*này là import rút gọn của các anonotaion của Spring để tạo API như:
@RestController: dùng để báo cho Spring biết class này là nơi chứa các API REST, nhận request từ trình duyệt Swagger
@GetMapping: API lấy dữ liệu ra
@PostMapping: Thêm dữ liệu mới lên server
@PutMapping: Cập nhật dữ liệu đã có, sửa thông tin
@DeleteMapping: Xóa dữ liệu
@RequestParam: Dùng để lấy dữ liệu nằm sau dấu ?. Ví dụ như /books/search?keyword=java&theLoai=Cong nghe thì key word = java và theLoai = Cong nghe. phù hợp với các chức năng tìm kiếm, lọc và truyền các tham số tùy chọn.
@PathVariable: Dùng để lấy dữ liệu nằm trong đường dẫn. Ví dụ như /books/B001
@RequestBody: Dùng để lấy dữ liệu người dùng gửi trong phần body của request, thường là JSON, rồi Spring tự đổi dữ liệu đó thành object Java.
Ví dụ về RequestBody khi mình gọi API POST /books kèm theo thông tin (khối Json) thì đó gọi là request body 
*/

import io.swagger.v3.oas.annotations.Operation;//Operation: dùng để mô tả một API cụ thể (chú thích cho từng endpoint)
import io.swagger.v3.oas.annotations.tags.Tag;//Tags: Book API trên Swagger UI
import io.swagger.v3.oas.annotations.Parameter;//Parameter: dùng để mô tả tham số đầu vào của API

@RestController
@RequestMapping("/books") // mặc định đường dẫn gốc là /books
@Tag(name = "Book API", description = "API quản lý sách") /*
tags ở đây đang gắn cho cả class, chứ kh phải cho từng
phương thức, nên là mình sẽ gọp được thêm xóa sửa vào trong
cụm Book API như trên giao diện swagger
*/
public class BookController {

    private List<Book> books = new ArrayList<>();
    private int nextId = 21;// tự động tăng id sách nếu user kh nhập id trong phương thức thêm sách

    public BookController() {
        books.add(new Book("B001", "Toán rời rạc", "PGS.TS. Đỗ Văn Nhơn", "Toan hoc", true));
        books.add(new Book("B002", "Hệ điều hành", "Trần Hạnh Nhi, Lê Khắc Nhiên Ân", "Cong nghe", true));
        books.add(new Book("B003", "Cấu trúc dữ liệu 2", "Trương Hải Bằng", "Cong nghe", true));
        books.add(new Book("B004", "Đồ họa máy tính", "Dương Anh Đức, Vũ Hải Quân, Lê Đình Duy", "Cong nghe", true));
        books.add(new Book("B005", "Khai thác dữ liệu", "GS.TS. Đỗ Phúc", "Cong nghe", true));
        books.add(new Book("B006", "Thiết kế cơ sở dữ liệu", "Trịnh Minh Tuấn", "Cong nghe", true));
        books.add(new Book("B007", "Giáo trình lập trình trên Windows", "Vũ Thanh Nguyên", "Cong nghe", false));
        books.add(new Book("B008", "Hệ điều hành Redhat Linux", "Nguyễn Anh Tuấn", "Cong nghe", true));
        books.add(new Book("B009", "Quản lý dự án công nghệ thông tin", "Ngô Trung Việt", "Cong nghe", true));
        books.add(new Book("B010", "Cấu trúc dữ liệu và giải thuật", "Trần Hạnh Nhi, Dương Anh Đức", "Cong nghe", true));
        books.add(new Book("B011", "Mạng máy tính", "Nguyễn Bình Dương, Đàm Quang Hồng Hải", "Cong nghe", true));
        books.add(new Book("B012", "Cơ sở dữ liệu", "Nguyễn Đăng Tỵ, GS.TS. Đỗ Phúc", "Cong nghe", true));
        books.add(new Book("B013", "Kiến trúc máy tính", "Võ Đức Khánh", "Cong nghe", false));
        books.add(new Book("B014", "Xử lý ảnh", "Võ Đức Khánh, GS.TSKH. Hoàng Kiếm", "Cong nghe", true));
        books.add(new Book("B015", "Lập trình C trên Windows", "Nguyễn Đình Quyền, Mai Xuân Hùng", "Cong nghe", true));
        books.add(new Book("B016", "Thiết kế và lập trình Web với ASP", "Nguyễn Thị Thanh Trúc, Mai Xuân Hùng, Phạm Phú Hội", "Cong nghe", true));
        books.add(new Book("B017", "Giáo trình nhập môn Công nghệ phần mềm", "PGS.TS. Đỗ Văn Nhơn, Nguyễn Thị Thanh Trúc, Nguyễn Trác Thức", "Cong nghe", true));
        books.add(new Book("B018", "Lập trình hướng đối tượng C++", "Trương Hải Bằng", "Cong nghe", false));
        books.add(new Book("B019", "Nhập môn trí tuệ nhân tạo", "GS.TSKH. Hoàng Kiếm, ThS. Đinh Nguyễn Anh Dũng", "Tri tue nhan tao", true));
        books.add(new Book("B020", "Giáo trình lập trình Java", "Huỳnh Ngọc Tín, Nguyễn Trác Thức, Tôn Thất Hòa An", "Cong nghe", true));
    }
    // =========================
    // GET - TRA CỨU SÁCH
    // =========================

    @GetMapping 
    @Operation(summary = "Lấy danh sách tất cả sách", description = "API dùng để lấy toàn bộ danh sách sách hiện có trong hệ thống.",
     tags = {"1. Tra cứu sách" })//này chỉ là phần mô tả trên giao diện th
    public List<Book> getAllBooks() {
        return books;
    }//đây là phần in ra danh sách tất cả sách kh cần tham số đầu vào

    @GetMapping("/search")
    @Operation(summary = "Tra cứu sách theo mã, tên sách, tác giả hoặc thể lọai", description = "API dùng để tìm sách theo một hoặc nhiều điều kiện. Nếu không tìm thấy, hệ thống sẽ trả về thông báo phù hợp.", tags = {
            "1. Tra cứu sách" })
    public Object searchBooks(
            @Parameter(description = "Nhập mã sách cần tra cứu", example = "B001") @RequestParam(required = false) String id,
             //như trên import Parameter là tham số đầu vào                         requied = false: không bắt buộc phải nhập ID
            @Parameter(description = "Nhập tên sách cần tìm", example = "Java") @RequestParam(required = false) String tenSach,

            @Parameter(description = "Nhập tên tác giả cần tìm", example = "Đỗ Văn Nhơn") @RequestParam(required = false) String tacGia,

            @Parameter(description = "Nhập thể loại sách cần lọc", example = "Công nghệ") @RequestParam(required = false) String theLoai) {

        List<Book> result = new ArrayList<>();
        //Danh sách này để chứa các quyền sách thỏa điều kiện tra cứu
        for (Book book : books)/*Duyệt qua từng quyển sách*/ {
            boolean dungId = true;//Vì nếu như không nhập ID mà nhập thông tin khác, mặc định là đúng luôn không cần kiểm tra nên chat có gợi ý là để true 
            boolean dungTenSach = true;
            boolean dungTacGia = true;
            boolean dungTheLoai = true;
    
            if (id != null && !id.isEmpty()) {
                dungId = book.getId().equalsIgnoreCase(id);
            }//nếu mà nhập id thì mình mới kiểm tra, equalsIgnoreCase hàm so sánh chuỗi mình đã học, bỏ qua chữ hoa hoặc thường

            if (tenSach != null && !tenSach.isEmpty()) {
                dungTenSach = book.getTenSach().toLowerCase().contains(tenSach.toLowerCase());
            }

            if (tacGia != null && !tacGia.isEmpty()) {
                dungTacGia = book.getTacGia().toLowerCase().contains(tacGia.toLowerCase());
            }

            if (theLoai != null && !theLoai.isEmpty()) {
                dungTheLoai = book.getTheLoai().equalsIgnoreCase(theLoai);
            }

            if (dungId && dungTenSach && dungTacGia && dungTheLoai) {
                result.add(book);
            }
        }

        if (result.isEmpty()) {
            return "Không tìm thấy sách phù hợp với điều kiện tra cứu.";
        }

        return result;
    }

    // =========================
    // POST - THÊM SÁCH
    // =========================

    @PostMapping
    @Operation(summary = "Thêm sách mới", description = "API dùng để thêm một quyển sách mới vào danh sách. Mã sách được hệ thống tự động tạo, nếu người dùng không nhập id.",
     tags = {"2. Quản lý sách" })
    public String createBook(@RequestBody Book newBook)/*đây là phần lấy dữ liệu JSON mà người dùng gửi lên trong body chuyển thành object r mang tên là newBook     */ {
        String newId = String.format("B%03d", nextId);//Tạo mã sách mới theo form B là chữ cái đầu và sau đó là 3 số nguyên 
        nextId++;//mã sách tự động tăng lên 

        newBook.setId(newId);
        books.add(newBook);//lưu vào hệ thống, trước đó chỉ lưu trong biến newBook th

        return "Thêm sách thành công. Mã sách mới là " + newId + ", tên sách: " + newBook.getTenSach() + ", tác giả: " + newBook.getTacGia();
    }

    // =========================
    // PUT - CẬP NHẬT SÁCH
    // =========================

    @PutMapping("/{id}")
    @Operation(summary = "Cập nhật thông tin sách", description = "API dùng để cập nhật thông tin của một quyển sách theo mã sách.", 
     tags = {"2. Quản lý sách" })
    public String updateBook(
            @Parameter(description = "Nhập mã sách cần cập nhật", example = "B001") @PathVariable String id,
            @RequestBody Book updatedBook)/*tương tự như trên thì cũng chuyển dữ liệu JSON vào trong biến updatedBook thôi */ {

        for (Book book : books) {
            if (book.getId().equalsIgnoreCase(id)) {
                //sau khi tìm đúng mã sách thì mình cập nhật thông tin
                book.setTenSach(updatedBook.getTenSach());
                book.setTacGia(updatedBook.getTacGia());
                book.setTheLoai(updatedBook.getTheLoai());
                book.setConSan(updatedBook.isConSan());

                return "Cập nhật sách thành công. Mã sách: " + book.getId() + ", tên sách mới: " + book.getTenSach();
            }
        }
        return "Không tìm thấy sách có mã: " + id;
    }

    // =========================
    // DELETE - XÓA SÁCH
    // =========================

    @DeleteMapping("/{id}")
    @Operation(summary = "Xóa sách theo mã", description = "API dùng để xóa một quyển sách khỏi danh sách theo mã sách.",
     tags = {"2. Quản lý sách" })
    public String deleteBook(
            @Parameter(description = "Nhập mã sách cần xóa", example = "B001") @PathVariable String id) {

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            if (book.getId().equalsIgnoreCase(id)) {
                books.remove(i);
                return "Đã xóa sách thành công. Mã sách: " + book.getId() + ", tên sách: " + book.getTenSach() + ", tác giả: " + book.getTacGia();
            }
        }

        return "Không tìm thấy sách có mã: " + id;
    }
}
