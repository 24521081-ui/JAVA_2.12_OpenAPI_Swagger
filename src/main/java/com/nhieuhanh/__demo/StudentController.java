package com.nhieuhanh.__demo;

// import các annotation của Spring Boot để tạo REST API
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// đánh dấu đây là controller trả dữ liệu dạng JSON
@RestController

// tất cả API trong class này đều bắt đầu bằng /student
@RequestMapping("/student")
public class StudentController {

    private Student student = new Student("24520001", "Nguyen Van Minh");
    // truy cập: GET http://localhost:8080/student
    @GetMapping
    public Student getStudent() {
        return student;
    }

    // API POST: thêm sinh viên mới
    // gửi JSON lên để thay dữ liệu hiện tại
    @PostMapping
    public String createStudent(@RequestBody Student newStudent) {
        student = newStudent;
        return "Them sinh vien thanh cong";
    }

    // API PUT: cập nhật thông tin sinh viên
    // gửi JSON mới để cập nhật lại dữ liệu
    @PutMapping
    public String updateStudent(@RequestBody Student updatedStudent) {
        student = updatedStudent;
        return "Cap nhat sinh vien thanh cong";
    }

    // API DELETE: xóa sinh viên hiện tại
    @DeleteMapping
    public String deleteStudent() {
        student = null;
        return "Xoa sinh vien thanh cong";
    }
}