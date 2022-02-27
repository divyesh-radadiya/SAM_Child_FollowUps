package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Child {
    //All these id's like nrc id, sam id and others might cause issues in scalability so look for another datatype if possible
    @Id  @GeneratedValue(strategy = GenerationType.AUTO)
    private int childId;
    @Column(nullable = false,unique = true)
    private int samId;
    @Column(nullable = false,unique = true)
    private int uhid;
    //It looks like this can turn out to be a major flaw because uhid can be a really large number i.e. millions or billions
    @Column(nullable = false,unique = true)
    private int rchId;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private int age;
    @Column(nullable = false)
    private Date dob;
    @Column(nullable = false)
    private char gender;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private String contactNumber;
    @Column(nullable = false)
    private String relationshipDetails;
    @Column(nullable = false)
    private String caste;
    @Column(nullable = false)
    private String religion;
    @Column(nullable = false)
    private boolean bpl;
    private String referredBy;
    @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double weight;
    private double muac;
    @Column(nullable = false)
    private String growthStatus;

    private String otherSymptoms;
    @Column(nullable = false)
    private Date admissionDate;

    @ManyToOne
    private NRC nrc;
    @ManyToOne
    private AWW aww;
    @OneToOne(mappedBy = "child")
    private DischargeSummary dischargeSummary;
    public int getSamId() {
        return samId;
    }

    public void setSamId(int samId) {
        this.samId = samId;
    }

    public int getUhid() {
        return uhid;
    }

    public void setUhid(int uhid) {
        this.uhid = uhid;
    }

    public int getRchId() {
        return rchId;
    }

    public void setRchId(int rchId) {
        this.rchId = rchId;
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
    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }
    public DischargeSummary getDischargeSummary() {
        return dischargeSummary;
    }

    public void setDischargeSummary(DischargeSummary dischargeSummary) {
        this.dischargeSummary = dischargeSummary;
    }

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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getRelationshipDetails() {
        return relationshipDetails;
    }

    public void setRelationshipDetails(String relationshipDetails) {
        this.relationshipDetails = relationshipDetails;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public boolean isBpl() {
        return bpl;
    }

    public void setBpl(boolean bpl) {
        this.bpl = bpl;
    }

    public String getReferredBy() {
        return referredBy;
    }

    public void setReferredBy(String referredBy) {
        this.referredBy = referredBy;
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

    public void setMuac(double muac) {
        this.muac = muac;
    }

    public String getGrowthStatus() {
        return growthStatus;
    }

    public void setGrowthStatus(String growthStatus) {
        this.growthStatus = growthStatus;
    }

    public String getOtherSymptoms() {
        return otherSymptoms;
    }

    public void setOtherSymptoms(String otherSymptoms) {
        this.otherSymptoms = otherSymptoms;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }


}
