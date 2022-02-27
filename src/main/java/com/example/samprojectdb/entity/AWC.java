package com.example.samprojectdb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AWC {


    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int awcId;
    @Column(nullable = false)
    private String address;
    //adress should be a composite class in itself.
    //location should be stored in apt format
    @Column(nullable = false)
    private String pincode;
    @Column(nullable = false)
    private double latitude;
    @OneToMany(mappedBy = "awc")
    //@JoinColumn(referencedColumnName = "awwId")
    private List<AWW> awws=new ArrayList<>();

    @Column(nullable = false)
    private double longitude;

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public int getAwcId() {
        return awcId;
    }

    public void setAwcId(int awcId) {
        this.awcId = awcId;
    }

    public String getAddress() {
        return address;
    }
    public List<AWW> getAwws() {
        return awws;
    }

    public void setAwws(ArrayList<AWW> awws) {
        this.awws = awws;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }
}
