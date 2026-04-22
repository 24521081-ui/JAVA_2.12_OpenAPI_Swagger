package com.nhieuhanh.__demo;

import org.springframework.boot.SpringApplication;//class này giúp khởi động ứng dụng Spring Boot
import org.springframework.boot.autoconfigure.SpringBootApplication;//đánh dấu đây là class chính để khởi động ứng dụng Spring Boot

@SpringBootApplication//Đây là điểm bắt đầu của demo, hệ thống sẽ chạy từ đây
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }// Lệnh chạy ứng dụng Spring Boot, quét tất cả các lớp liên quan là book và book controller và truy cập vào link này http://localhost:8081/swagger-ui.html
}
