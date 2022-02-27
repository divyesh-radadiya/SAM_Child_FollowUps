package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class FollowUp {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int followUpId;
    @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double weight;
    @Column(nullable = false)
    private double muac;
    @Column(nullable = false)
    private String growthStatus;
    private String symptoms;
    @Column(nullable = false)
    private Date timestamp;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private boolean isAttempted;
    @Column(nullable = false,unique = true)
    private int dsId;
    @ManyToOne
    private DischargeSummary dischargeSummary;
    public int getFollowUpId() {
        return followUpId;
    }

    public void setFollowUpId(int followUpId) {
        this.followUpId = followUpId;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getMuac() {
        return muac;
    }

    public DischargeSummary getDischargeSummary() {
        return dischargeSummary;
    }

    public void setDischargeSummary(DischargeSummary dischargeSummary) {
        this.dischargeSummary = dischargeSummary;
    }

    public void setMuac(double muac) {
        this.muac = muac;
    }

    public String getGrowthStatus() {
        return growthStatus;
    }

    public void setGrowthStatus(String growthStatus) {
        this.growthStatus = growthStatus;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAttempted() {
        return isAttempted;
    }

    public void setAttempted(boolean attempted) {
        isAttempted = attempted;
    }

    public int getDsId() {
        return dsId;
    }

    public void setDsId(int dsId) {
        this.dsId = dsId;
    }
}
