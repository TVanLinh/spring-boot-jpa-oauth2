package com.nara.test.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user")
public class User extends AbstractDomain {

    @Basic
    @Column(name = "NAME")
    private String name;

    @Basic
    @Column(name = "PASS_WORD")
    private String passWord;

    @Basic
    @Column(name = "USER_NAME")
    private String userName;

    @Basic
    @Column(name = "MODE")
    private int mode;

    @Basic
    @Column(name = "TYPE")
    private int type;

    @Basic
    @Column(name = "EMAIL")
    private String email;

    @Basic
    @Column(name = "IDENTITY")
    private String identity;


    @Basic
    @Column(name = "PHONE")
    private String phone;

    @Basic
    @Column(name = "BIRTH_DAY")
    private Date birthDay;

    @Basic
    @Column(name = "IMAGE")
    private String image;

    @Basic
    @Column(name = "STATUS")
    private Boolean status;

    @Basic
    @Column(name = "ID_DEVICE")
    private String idDevice;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Role> roles;

    public User() {

    }

    public User(String name, String passWord) {
        this.name = name;
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getMode() {
        return mode;
    }

    public void setMode(int mode) {
        this.mode = mode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status != null ? status : false;
    }

    public String getIdDevice() {
        return idDevice;
    }

    public void setIdDevice(String idDevice) {
        this.idDevice = idDevice;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
