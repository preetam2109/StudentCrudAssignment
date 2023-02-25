package com.preetamlahre.studentCrud.repository;

import org.springframework.data.repository.CrudRepository;


import com.preetamlahre.studentCrud.bean.Student;

public interface StudentRepository extends CrudRepository<Student,String> {
	

}
