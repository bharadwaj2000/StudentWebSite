package com.students.infobackend.models;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Table(name = "stafflogin")
@Entity
public class StaffLogin {
    @Id
    public BigInteger pin;
    public String pass;
    public int section;

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

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
