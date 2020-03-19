package com.students.infobackend.controllers;

import com.students.infobackend.dao.StaffDetailsDao;
import com.students.infobackend.dao.StudentDetailsDao;
import com.students.infobackend.models.StudentDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class StudentDetailsController {

    @Autowired
    public StudentDetailsDao studentDetailsDao;

    @Autowired
    public StaffDetailsDao staffDetailsDao;

    @GetMapping(path = "/studentdetails/{pin}")
    public Optional<StudentDetails> getStudentDetails(@PathVariable BigInteger pin){
        return studentDetailsDao.findById(pin);
    }

    @GetMapping(path="/studentdetails/staffauth/{pin}")
    public @ResponseBody  Iterable<StudentDetails> studentStaffAuth(@PathVariable BigInteger pin){
        int section = staffDetailsDao.findById(pin).get().getSection();
        return studentDetailsDao.findBySection(section);
    }

    @PostMapping(path="/studentdetails/staffauth/update")
    public @ResponseBody String studentUpdate(@RequestBody StudentDetails studentDetails){
//        System.out.print(studentDetails.getPin());
        studentDetailsDao.deleteById(studentDetails.getPin());
        studentDetailsDao.save(studentDetails);
//        studentDetailsDao.updateStudent(studentDetails.getPin(),studentDetails.getStudentname(),studentDetails.getCgpa(),studentDetails.getAttendance(),studentDetails.getSection());
        return "Ok!";
    }
}
