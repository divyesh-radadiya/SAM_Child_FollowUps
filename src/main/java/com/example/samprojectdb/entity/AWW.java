package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AWW {
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int awwId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @ManyToOne @JoinColumn(name="AWC_id", nullable=false)
    private AWC awc;
    @OneToMany(mappedBy = "aww")
    @JsonIgnore
    private List<Child> children=new ArrayList<>();
    @OneToMany(mappedBy = "aww")
    @JsonIgnore
    private List<DischargeSummary> dischargeSummaries=new ArrayList<>();

    public AWW()
    {

    }

//    public AWW(int awwId, String name, String username, String password) {
//        super();
//        this.awwId = awwId;
//        this.name = name;
//        this.username = username;
//        this.password = password;
//    }


    public int getAwwId() {
        return awwId;
    }

    public void setAwwId(int awwId) {
        this.awwId = awwId;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public AWC getAwc() {
        return awc;
    }

    public void setAwc(AWC awc) {
        this.awc = awc;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public List<DischargeSummary> getDischargeSummaries() {
        return dischargeSummaries;
    }

    public void setDischargeSummaries(List<DischargeSummary> dischargeSummaries) {
        this.dischargeSummaries = dischargeSummaries;
    }
}
