package com.mahindra.be_lms.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import com.google.gson.annotations.SerializedName;

/**
 * Entity mapped to table "QUALIFICATION".
 */
public class Qualification {
    @SerializedName("none")
    private Long id;
    @SerializedName("id")
    private String qualificationID;
    @SerializedName("name")
    private String qualificationName;
    @SerializedName("remark")
    private String qualificationRemark;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Qualification() {
    }

    public Qualification(Long id) {
        this.id = id;
    }

    public Qualification(Long id, String qualificationID, String qualificationName, String qualificationRemark) {
        this.id = id;
        this.qualificationID = qualificationID;
        this.qualificationName = qualificationName;
        this.qualificationRemark = qualificationRemark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQualificationID() {
        return qualificationID;
    }

    public void setQualificationID(String qualificationID) {
        this.qualificationID = qualificationID;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public void setQualificationName(String qualificationName) {
        this.qualificationName = qualificationName;
    }

    public String getQualificationRemark() {
        return qualificationRemark;
    }

    public void setQualificationRemark(String qualificationRemark) {
        this.qualificationRemark = qualificationRemark;
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public String toString() {
        return qualificationName;
    }
    // KEEP METHODS END

}