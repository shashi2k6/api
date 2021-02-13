package com.speedway.api;

import com.speedway.api.entity.Course;
import com.speedway.api.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;
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

        Course course1 = new Course();
        course1.setId(1);
        course1.setName("Spring");

        Course course2 = new Course();
        course2.setId(2);
        course2.setName("Boot");

        Course course3 = new Course();
        course3.setId(3);
        course3.setName("Application");

        student.setLikedCourses(Set.of(course1, course2, course3));

        Student student1 = new Student();
        student1.setId(2);
        student1.setName("kumar");
        student1.setLikedCourses(Set.of(course1, course2, course3));

        apiRepository.save(student);
        apiRepository.save(student1);

        Optional<Student> studentFromDB = apiRepository.findById(1);
        System.out.println("studentFromDB = " + studentFromDB);
        studentFromDB.get().getLikedCourses().stream().forEach(System.out::println);

    }
}
