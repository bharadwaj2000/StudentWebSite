package com.students.infobackend.dao;

import com.students.infobackend.models.StaffLogin;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface StaffLoginDao extends CrudRepository<StaffLogin, BigInteger> {
}
