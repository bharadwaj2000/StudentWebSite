package com.students.infobackend.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigInteger;

@Table(name = "studentdetails")
@Entity
public class StudentDetails {

    @Id
    public BigInteger pin;

    public String studentname;
    public int section;
    public float cgpa;
    public float attendance;

    public BigInteger getPin() {
        return pin;
    }

    public void setPin(BigInteger pin) {
        this.pin = pin;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }

    public float getCgpa() {
        return cgpa;
    }

    public void setCgpa(float cgpa) {
        this.cgpa = cgpa;
    }

    public float getAttendance() {
        return attendance;
    }

    public void setAttendance(float attendance) {
        this.attendance = attendance;
    }

}
