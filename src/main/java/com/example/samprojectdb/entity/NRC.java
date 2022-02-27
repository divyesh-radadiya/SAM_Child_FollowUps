package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class NRC {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int nrcId;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String pincode;
    //GPS location
    @Column(nullable = false,unique = true)
    private int csId;
    @OneToMany(mappedBy = "nrc")
    private List<Child> children=new ArrayList<>();
    @OneToMany(mappedBy = "nrc")
    private List<DischargeSummary> dischargeSummaries=new ArrayList<>();
    @OneToOne
    private CareSpecialist cs;
    public int getNrcId() {
        return nrcId;
    }

    public void setNrcId(int nrcId) {
        this.nrcId = nrcId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
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

    public CareSpecialist getCs() {
        return cs;
    }

    public void setCs(CareSpecialist cs) {
        this.cs = cs;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public int getCsId() {
        return csId;
    }

    public void setCsId(int csId) {
        this.csId = csId;
    }
}
