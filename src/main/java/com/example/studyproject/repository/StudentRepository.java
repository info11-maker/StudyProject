package com.example.studyproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.studyproject.domain.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
