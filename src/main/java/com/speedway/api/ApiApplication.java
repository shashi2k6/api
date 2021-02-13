package com.speedway.api;

import com.speedway.api.entity.Course;
import com.speedway.api.entity.Student;
import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sun.jvm.hotspot.code.Stub;

import java.util.Set;

@SpringBootApplication
public class ApiApplication implements CommandLineRunner {

    @Autowired
    public APIRepository apiRepository;

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Student student = new Student();
        student.setId(1);
        student.setName("Shashi kumar");
        Course course = new Course();
        course.setId(1);
        course.setName("Spring boot");
        student.setLikedCourses(Set.of(course));
        apiRepository.save(student);
    }
}
