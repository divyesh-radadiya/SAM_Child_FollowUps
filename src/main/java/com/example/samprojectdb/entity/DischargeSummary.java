package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DischargeSummary {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int dsId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String contactNumber;
    @Column(nullable = false)
    private Date admissionDate;
    @Column(nullable = false)
    private double admissionWeight;
    @Column(nullable = false)
    private double targetWeight;
    @Column(nullable = false)
    private Date dischargeDate;
    @Column(nullable = false)
    private double dischargeWeight;
    @Column(nullable = false)
    private String outcome;
    @OneToOne
    private Child child;


    @ManyToOne
    private NRC nrc;
    @Column(nullable = false)
    private String treatmentProtocol;
    @Column(nullable = false,unique = true)
    private int samId;
    @Column(nullable = false,unique = true)
    private int nrcId;
    @Column(nullable = false,unique = true)
    private int awwId;
    @ManyToOne
    private AWW aww;
    @OneToMany(mappedBy = "dischargeSummary")
    private List<FollowUp> followUps = new ArrayList<>();
    public int getDsId() {
        return dsId;
    }

    public void setDsId(int dsId) {
        this.dsId = dsId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public double getAdmissionWeight() {
        return admissionWeight;
    }

    public void setAdmissionWeight(double admissionWeight) {
        this.admissionWeight = admissionWeight;
    }

    public double getTargetWeight() {
        return targetWeight;
    }

    public void setTargetWeight(double targetWeight) {
        this.targetWeight = targetWeight;
    }

    public Date getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(Date dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public double getDischargeWeight() {
        return dischargeWeight;
    }

    public void setDischargeWeight(double dischargeWeight) {
        this.dischargeWeight = dischargeWeight;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public int getSamId() {
        return samId;
    }

    public void setSamId(int samId) {
        this.samId = samId;
    }

    public int getNrcId() {
        return nrcId;
    }

    public void setNrcId(int nrcId) {
        this.nrcId = nrcId;
    }

    public int getAwwId() {
        return awwId;
    }

    public void setAwwId(int awwId) {
        this.awwId = awwId;
    }
    public String getTreatmentProtocol() {
        return treatmentProtocol;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public NRC getNrc() {
        return nrc;
    }

    public void setNrc(NRC nrc) {
        this.nrc = nrc;
    }

    public AWW getAww() {
        return aww;
    }

    public void setAww(AWW aww) {
        this.aww = aww;
    }

    public List<FollowUp> getFollowUps() {
        return followUps;
    }

    public void setFollowUps(List<FollowUp> followUps) {
        this.followUps = followUps;
    }

    public void setTreatmentProtocol(String treatmentProtocol) {
        this.treatmentProtocol = treatmentProtocol;
    }
}
