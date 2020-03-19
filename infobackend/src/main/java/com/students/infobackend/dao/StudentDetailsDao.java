package com.students.infobackend.dao;

import com.students.infobackend.models.StudentDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

public interface StudentDetailsDao extends JpaRepository<StudentDetails, BigInteger> {

    @Query(" SELECT v FROM StudentDetails v WHERE v.section= (:section)")
    public List<StudentDetails> findBySection(int section);

    @Query("UPDATE StudentDetails SET studentname = (:name) ,cgpa = (:cgpa), section = (:section) , attendance = (:attendance) WHERE pin = (:pin)")
    public void updateStudent(BigInteger pin,String name,float cgpa,float attendance,int section);
}
