package com.speedway.api;

import com.speedway.api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface APIRepository extends JpaRepository<Student, Long> {
}
