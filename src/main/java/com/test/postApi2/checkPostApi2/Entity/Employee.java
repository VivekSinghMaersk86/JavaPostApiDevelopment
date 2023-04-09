package com.test.postApi2.checkPostApi2.Entity;

import javax.persistence.*;

@Entity
@Table(name="employeedetails")
public class Employee {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="eid")
    int eid;

    @Column(name="Ename")
    String name;

    @Column(name="salary")
    String salary;

    @Column(name="Desination")
    String Designation;
    @Column(name="Empemail")
    String EmpEmail;

    @Column(name="Address")
    String Address;

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDesignation() {
        return Designation;
    }

    public void setDesignation(String designation) {
        Designation = designation;
    }

    public String getEmpEmail() {
        return EmpEmail;
    }

    public void setEmpEmail(String empEmail) {
        EmpEmail = empEmail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
