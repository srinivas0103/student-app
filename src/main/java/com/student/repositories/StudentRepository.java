package com.student.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.models.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

}
