package com.example.backendproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendproject.model.Student;

@Repository
public interface Sturepository extends JpaRepository<Student, Integer>{

}
