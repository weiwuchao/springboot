package com.wwc.validator.domain;


import com.wwc.validator.annoation.FalgValid;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Min;

public class DemoDomain {

    @NotBlank
    @Length(min = 2,max = 10)
    private String name;

    @Min(value = 1)
    private int age;

    @NotBlank
    @Email
    private String mail;

    @FalgValid(values = "1,2,3")
    private String flag;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
