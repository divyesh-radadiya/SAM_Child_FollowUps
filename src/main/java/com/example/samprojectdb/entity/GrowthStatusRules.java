package com.example.samprojectdb.entity;

import javax.persistence.*;

@Entity
public class GrowthStatusRules {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int sno;
    @Column(nullable = false)
    private double boys3d;
    @Id @Column(nullable = false)
    private double height;
    @Column(nullable = false)
    private double girls3d;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public double getBoys3d() {
        return boys3d;
    }

    public void setBoys3d(double boys3d) {
        this.boys3d = boys3d;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getGirls3d() {
        return girls3d;
    }

    public void setGirls3d(double girls3d) {
        this.girls3d = girls3d;
    }
}
