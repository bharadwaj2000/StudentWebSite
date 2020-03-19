package com.students.infobackend.models;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;


@Entity
@Table(name = "studentlogin")
public class StudentLogin {

    @Id
    @NotNull
    public BigInteger pin;

    @NotNull
    public String pass;

    public BigInteger getPin() {
        return pin;
    }

    public void setPin(BigInteger pin) {
        this.pin = pin;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
