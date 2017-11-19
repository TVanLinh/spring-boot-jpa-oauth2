package com.nara.test.demo.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Table(name = "role")
public class Role extends AbstractDomain implements GrantedAuthority  {

    @Basic
    @Column(name = "NAME")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "USER_ID",referencedColumnName = "id")
    @JsonIgnore
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String getAuthority() {
        return this.getName();
    }
}
