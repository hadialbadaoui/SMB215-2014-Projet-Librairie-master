/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Employee;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Employee {
    private int emp_id;
    private int emp_ssn;
    private String emp_username;
    private String emp_password;
    private String emp_firstname;
    private String emp_lastname;
    enum emp_gender {Male,Female};
    enum emp_maritalstatus {Married,Widowed,Separated,Divorced,Single};
    private Date emp_dateofbirth;
    private int emp_city;
    private String emp_address;
    private String emp_homephone;
    private String emp_mobile;
    private String emp_personalemail;
    private String emp_workphone;
    private int emp_workext;
    private String emp_workfax;
    private String emp_workemail;
    private int emp_profession;
    private String emp_remarks;
    private int emp_branch;
    private boolean emp_isactive;
    private Date emp_activesince;
    private Date emp_deactivatedsince;
    private String emp_deactivatedreason;

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getEmp_ssn() {
        return emp_ssn;
    }

    public void setEmp_ssn(int emp_ssn) {
        this.emp_ssn = emp_ssn;
    }

    public String getEmp_username() {
        return emp_username;
    }

    public void setEmp_username(String emp_username) {
        this.emp_username = emp_username;
    }

    public String getEmp_password() {
        return emp_password;
    }

    public void setEmp_password(String emp_password) {
        this.emp_password = emp_password;
    }

    public String getEmp_firstname() {
        return emp_firstname;
    }

    public void setEmp_firstname(String emp_firstname) {
        this.emp_firstname = emp_firstname;
    }

    public String getEmp_lastname() {
        return emp_lastname;
    }

    public void setEmp_lastname(String emp_lastname) {
        this.emp_lastname = emp_lastname;
    }

    public Date getEmp_dateofbirth() {
        return emp_dateofbirth;
    }

    public void setEmp_dateofbirth(Date emp_dateofbirth) {
        this.emp_dateofbirth = emp_dateofbirth;
    }

    public int getEmp_city() {
        return emp_city;
    }

    public void setEmp_city(int emp_city) {
        this.emp_city = emp_city;
    }

    public String getEmp_address() {
        return emp_address;
    }

    public void setEmp_address(String emp_address) {
        this.emp_address = emp_address;
    }

    public String getEmp_homephone() {
        return emp_homephone;
    }

    public void setEmp_homephone(String emp_homephone) {
        this.emp_homephone = emp_homephone;
    }

    public String getEmp_mobile() {
        return emp_mobile;
    }

    public void setEmp_mobile(String emp_mobile) {
        this.emp_mobile = emp_mobile;
    }

    public String getEmp_personalemail() {
        return emp_personalemail;
    }

    public void setEmp_personalemail(String emp_personalemail) {
        this.emp_personalemail = emp_personalemail;
    }

    public String getEmp_workphone() {
        return emp_workphone;
    }

    public void setEmp_workphone(String emp_workphone) {
        this.emp_workphone = emp_workphone;
    }

    public int getEmp_workext() {
        return emp_workext;
    }

    public void setEmp_workext(int emp_workext) {
        this.emp_workext = emp_workext;
    }

    public String getEmp_workfax() {
        return emp_workfax;
    }

    public void setEmp_workfax(String emp_workfax) {
        this.emp_workfax = emp_workfax;
    }

    public String getEmp_workemail() {
        return emp_workemail;
    }

    public void setEmp_workemail(String emp_workemail) {
        this.emp_workemail = emp_workemail;
    }

    public int getEmp_profession() {
        return emp_profession;
    }

    public void setEmp_profession(int emp_profession) {
        this.emp_profession = emp_profession;
    }

    public String getEmp_remarks() {
        return emp_remarks;
    }

    public void setEmp_remarks(String emp_remarks) {
        this.emp_remarks = emp_remarks;
    }

    public int getEmp_branch() {
        return emp_branch;
    }

    public void setEmp_branch(int emp_branch) {
        this.emp_branch = emp_branch;
    }

    public boolean isEmp_isactive() {
        return emp_isactive;
    }

    public void setEmp_isactive(boolean emp_isactive) {
        this.emp_isactive = emp_isactive;
    }

    public Date getEmp_activesince() {
        return emp_activesince;
    }

    public void setEmp_activesince(Date emp_activesince) {
        this.emp_activesince = emp_activesince;
    }

    public Date getEmp_deactivatedsince() {
        return emp_deactivatedsince;
    }

    public void setEmp_deactivatedsince(Date emp_deactivatedsince) {
        this.emp_deactivatedsince = emp_deactivatedsince;
    }

    public String getEmp_deactivatedreason() {
        return emp_deactivatedreason;
    }

    public void setEmp_deactivatedreason(String emp_deactivatedreason) {
        this.emp_deactivatedreason = emp_deactivatedreason;
    }
}
