package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AWW {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private int awwId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(unique = true,nullable = false)
    private int awcId;



    @ManyToOne
    private AWC awc;
    @OneToMany(mappedBy = "aww")
    //@JoinColumn(referencedColumnName = "childId")
    private List<Child> children=new ArrayList<>();
    @OneToMany(mappedBy = "aww")
    private List<DischargeSummary> dischargeSummaries=new ArrayList<>();
    public AWC getAwc() {
        return awc;
    }

    public void setAwc(AWC awc) {
        this.awc = awc;
    }

    public List<Child> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Child> children) {
        this.children = children;
    }

    public List<DischargeSummary> getDischargeSummaries() {
        return dischargeSummaries;
    }

    public void setDischargeSummaries(ArrayList<DischargeSummary> dischargeSummaries) {
        this.dischargeSummaries = dischargeSummaries;
    }
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

    public int getAwcId() {
        return awcId;
    }

    public void setAwcId(int awcId) {
        this.awcId = awcId;
    }
}
