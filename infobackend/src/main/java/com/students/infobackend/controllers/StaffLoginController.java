package com.students.infobackend.controllers;

import com.students.infobackend.dao.StaffLoginDao;
import com.students.infobackend.models.StaffLogin;
import com.students.infobackend.models.StudentLogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;


@CrossOrigin(origins = "*")
@RestController
public class StaffLoginController {

    @Autowired
    public StaffLoginDao staffLoginDao;

    @GetMapping(path = "/staffLogin/{pin}")
    public @ResponseBody Optional<StaffLogin> staffLoginCheck(@PathVariable BigInteger pin){
        return staffLoginDao.findById(pin);
    }

}
