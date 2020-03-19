package com.students.infobackend.dao;

import com.students.infobackend.models.StudentLogin;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface StudentLoginDao extends CrudRepository<StudentLogin,BigInteger> {

}
