package com.encharity.encharity_backend.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "urgent_patients")
@EntityListeners(AuditingEntityListener.class)
public class UrgentPatient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long urgentPatientId;
    @NotBlank
    private int photoId;
    @NotBlank
    private String fullname;
    @NotBlank
    private String category;
    @NotBlank
    private String description;
    @NotBlank
    private String totalTenge;
    @NotBlank
    private String fundedPercent;
    @NotBlank
    private String daysLeft;
    @NotBlank
    private String city;

    public Long getUrgentPatientId() {
        return urgentPatientId;
    }

    public void setUrgentPatientId(Long urgentPatientId) {
        this.urgentPatientId = urgentPatientId;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTotalTenge() {
        return totalTenge;
    }

    public void setTotalTenge(String totalTenge) {
        this.totalTenge = totalTenge;
    }

    public String getFundedPercent() {
        return fundedPercent;
    }

    public void setFundedPercent(String fundedPercent) {
        this.fundedPercent = fundedPercent;
    }

    public String getDaysLeft() {
        return daysLeft;
    }

    public void setDaysLeft(String daysLeft) {
        this.daysLeft = daysLeft;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
