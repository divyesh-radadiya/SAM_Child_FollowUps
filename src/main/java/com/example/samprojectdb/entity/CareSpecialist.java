package com.example.samprojectdb.entity;

import javax.persistence.*;

@Entity
public class CareSpecialist {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private int csId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @OneToOne(mappedBy = "cs")
    private NRC nrc;
    public int getCsId() {
        return csId;
    }

    public void setCsId(int csId) {
        this.csId = csId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public NRC getNrc() {
        return nrc;
    }

    public void setNrc(NRC nrc) {
        this.nrc = nrc;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
