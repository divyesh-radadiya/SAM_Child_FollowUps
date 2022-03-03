package com.example.samprojectdb.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class DischargeSummary {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dsId;
    @Column(nullable = false)
    private Date dischargeAt;
    @Column(nullable = false)
    private double weight;
    @Column(nullable = false)
    private String outcome;
    @OneToOne @JoinColumn(name="sam_id", nullable=false)
    private Child child;
    @Column(nullable = false)
    private String treatmentProtocol;
    @ManyToOne @JoinColumn(name="aww_id", nullable=false)
    @JsonIgnore
    private AWW aww;
    @OneToMany(mappedBy = "dischargeSummary")
    private List<FollowUp> followUps = new ArrayList<>();

    public DischargeSummary()
    {

    }
    public DischargeSummary(int dsId, Date dischargeAt, double weight, String outcome, String treatmentProtocol) {
        super();
        this.dsId = dsId;
        this.dischargeAt = dischargeAt;
        this.weight = weight;
        this.outcome = outcome;
        this.treatmentProtocol = treatmentProtocol;
    }

    public int getDsId() {
        return dsId;
    }

    public void setDsId(int dsId) {
        this.dsId = dsId;
    }

    public Date getDischargeAt() {
        return dischargeAt;
    }

    public void setDischargeAt(Date dischargeAt) {
        this.dischargeAt = dischargeAt;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }

    public String getTreatmentProtocol() {
        return treatmentProtocol;
    }

    public void setTreatmentProtocol(String treatmentProtocol) {
        this.treatmentProtocol = treatmentProtocol;
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

    @Override
    public String toString() {
        return "DischargeSummary{" +
                "dsId=" + dsId +
                ", dischargeAt=" + dischargeAt +
                ", weight=" + weight +
                ", outcome='" + outcome + '\'' +
                ", child=" + child +
                ", treatmentProtocol='" + treatmentProtocol + '\'' +
                ", aww=" + aww +
                ", followUps=" + followUps +
                '}';
    }
}
