package com.nhieuhanh.__demo;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Tag(name = "Students", description = "CRUD demo: GET, POST, PUT, DELETE (in-memory)")
@RestController
@RequestMapping("/students")
public class StudentController {

    private final Map<Long, Student> db = new ConcurrentHashMap<>();
    private final AtomicLong idGen = new AtomicLong(0);

    public StudentController() {
        // dữ liệu mẫu để demo nhanh
        create(new Student(null, "Minh"));
        create(new Student(null, "Lan"));
    }

    @Operation(summary = "GET: Lấy danh sách sinh viên")
    @GetMapping
    public Collection<Student> getAll() {
        return db.values();
    }

    @Operation(summary = "POST: Tạo sinh viên mới")
    @PostMapping
    public Student create(@RequestBody Student student) {
        long id = idGen.incrementAndGet();
        student.setId(id);
        db.put(id, student);
        return student;
    }

    @Operation(summary = "PUT: Cập nhật sinh viên theo id")
    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        if (!db.containsKey(id)) throw new NoSuchElementException("Student not found: " + id);
        student.setId(id);
        db.put(id, student);
        return student;
    }

    @Operation(summary = "DELETE: Xóa sinh viên theo id")
    @DeleteMapping("/{id}")
    public Map<String, Object> delete(@PathVariable Long id) {
        boolean existed = db.remove(id) != null;
        return Map.of("deleted", existed, "id", id);
    }
}