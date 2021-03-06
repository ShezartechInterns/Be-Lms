package com.mahindra.be_lms.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Entity mapped to table "COMPANY".
 */
public class Company implements Parcelable {
    public static final Creator<Company> CREATOR = new Creator<Company>() {
        @Override
        public Company createFromParcel(Parcel source) {
            return new Company(source);
        }

        @Override
        public Company[] newArray(int size) {
            return new Company[size];
        }
    };
    @SerializedName("none")
    private Long id;
    @SerializedName("id")
    private String comapnayID;
    @SerializedName("name")
    private String compnayName;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END
    @SerializedName("code")
    private String companyCode;

    public Company() {
    }

    public Company(Long id) {
        this.id = id;
    }

    public Company(Long id, String comapnayID, String compnayName, String companyCode) {
        this.id = id;
        this.comapnayID = comapnayID;
        this.compnayName = compnayName;
        this.companyCode = companyCode;
    }

    public Company(String comapnayID, String compnayName, String companyCode) {
        this.comapnayID = comapnayID;
        this.companyCode = companyCode;
        this.compnayName = compnayName;
    }

    protected Company(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.comapnayID = in.readString();
        this.compnayName = in.readString();
        this.companyCode = in.readString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComapnayID() {
        return comapnayID;
    }

    public void setComapnayID(String comapnayID) {
        this.comapnayID = comapnayID;
    }

    public String getCompnayName() {
        return compnayName;
    }

    public void setCompnayName(String compnayName) {
        this.compnayName = compnayName;
    }

    // KEEP METHODS - put your custom methods here

    public String getCompanyCode() {
        return companyCode;
    }

    // KEEP METHODS END

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    @Override
    public String toString() {
        return compnayName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.comapnayID);
        dest.writeString(this.compnayName);
        dest.writeString(this.companyCode);
    }
}
