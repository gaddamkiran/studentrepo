package com.xyz.api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xyz.api.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>  {

}
