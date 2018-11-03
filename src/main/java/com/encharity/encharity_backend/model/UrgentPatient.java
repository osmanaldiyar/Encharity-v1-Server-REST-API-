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
    private int urgentPatientId;

    private int urgentPhotoId;
    @NotBlank
    private String urgentFullname;
    @NotBlank
    private String urgentCategory;
    @NotBlank
    private String urgentDescription;
    @NotBlank
    private String urgentTotalTenge;
    @NotBlank
    private String urgentFundedPercent;
    @NotBlank
    private String urgentDaysLeft;
    @NotBlank
    private String urgentCity;

    public int getUrgentPatientId() {
        return urgentPatientId;
    }

    public void setUrgentPatientId(int urgentPatientId) {
        this.urgentPatientId = urgentPatientId;
    }

    public int getUrgentPhotoId() {
        return urgentPhotoId;
    }

    public void setUrgentPhotoId(int urgentPhotoId) {
        this.urgentPhotoId = urgentPhotoId;
    }

    public String getUrgentFullname() {
        return urgentFullname;
    }

    public void setUrgentFullname(String urgentFullname) {
        this.urgentFullname = urgentFullname;
    }

    public String getUrgentCategory() {
        return urgentCategory;
    }

    public void setUrgentCategory(String urgentCategory) {
        this.urgentCategory = urgentCategory;
    }

    public String getUrgentDescription() {
        return urgentDescription;
    }

    public void setUrgentDescription(String urgentDescription) {
        this.urgentDescription = urgentDescription;
    }

    public String getUrgentTotalTenge() {
        return urgentTotalTenge;
    }

    public void setUrgentTotalTenge(String urgentTotalTenge) {
        this.urgentTotalTenge = urgentTotalTenge;
    }

    public String getUrgentFundedPercent() {
        return urgentFundedPercent;
    }

    public void setUrgentFundedPercent(String urgentFundedPercent) {
        this.urgentFundedPercent = urgentFundedPercent;
    }

    public String getUrgentDaysLeft() {
        return urgentDaysLeft;
    }

    public void setUrgentDaysLeft(String urgentDaysLeft) {
        this.urgentDaysLeft = urgentDaysLeft;
    }

    public String getUrgentCity() {
        return urgentCity;
    }

    public void setUrgentCity(String urgentCity) {
        this.urgentCity = urgentCity;
    }
}
