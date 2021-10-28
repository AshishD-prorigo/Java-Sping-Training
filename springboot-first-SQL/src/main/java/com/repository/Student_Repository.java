package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Sql.springbootfirstSQL.Student;

@Repository
public interface Student_Repository extends JpaRepository<Student, Long> {

	
}
