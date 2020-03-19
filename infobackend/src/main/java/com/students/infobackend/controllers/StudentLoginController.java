package com.students.infobackend.controllers;

import com.students.infobackend.dao.StudentLoginDao;
import com.students.infobackend.models.StudentLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.processing.SupportedOptions;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class StudentLoginController {

    @Autowired
    public StudentLoginDao studentLoginDao;

    @GetMapping(path = "/studentLogin/getall")
    public Iterable<StudentLogin> getAllStudents (){
        return studentLoginDao.findAll();
    }

    @GetMapping(path = "/studentLogin/{pin}")
    public @ResponseBody Optional<StudentLogin> studentLoginCheck(@PathVariable BigInteger pin){
        return studentLoginDao.findById(pin);
    }
}
