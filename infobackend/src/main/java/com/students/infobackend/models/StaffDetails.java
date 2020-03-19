package com.students.infobackend.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Table(name = "staffdetails")
@Entity
public class StaffDetails {
    @Id
    public BigInteger pin;
    public String staffname;
    public int section;

    public BigInteger getPin() {
        return pin;
    }

    public void setPin(BigInteger pin) {
        this.pin = pin;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
}
