package com.example.backendproject.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backendproject.model.Student;
//This Interface extends JpaRepository interface, so that @Repository is not needed to be annotated manually
@Repository
public interface Sturepository extends JpaRepository<Student, Integer>{

}
