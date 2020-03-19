package com.students.infobackend.dao;

import com.students.infobackend.models.StaffDetails;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

public interface StaffDetailsDao extends CrudRepository<StaffDetails, BigInteger> {
}
