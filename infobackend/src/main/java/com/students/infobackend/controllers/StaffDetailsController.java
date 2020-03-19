package com.students.infobackend.controllers;

import com.students.infobackend.dao.StaffDetailsDao;
import com.students.infobackend.models.StaffDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
public class StaffDetailsController {

    @Autowired
    public StaffDetailsDao staffDetailsDao;

    @GetMapping(path = "/staffdetails/{pin}")
    public @ResponseBody
    Optional<StaffDetails> getStaffDetails(@PathVariable BigInteger pin){
        return staffDetailsDao.findById(pin);
    }
}
