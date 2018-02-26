package com.mahindra.be_lms.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Entity mapped to table "USER".
 */
public class User implements Parcelable {

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };
    @SerializedName("none")
    private Long id;
    @SerializedName("id")
    private String userID;
    @SerializedName("firstname")
    private String userFirstName;
    @SerializedName("lastname")
    private String userLastName;
    @SerializedName("username")
    private String username;
    @SerializedName("password")
    private String password;
    @SerializedName("email")
    private String userEmailID;
    @SerializedName("mobile")
    private String userMobileNo;
    @SerializedName("companyname")
    private String userOrg;
    @SerializedName("departmentname")
    private String userOrgCode;
    @SerializedName("location")
    private String userLocationID;
    @SerializedName("position")
    private String userDesignationID;
    @SerializedName("profileimageurl")
    private String userPicture;
    @SerializedName("qualification")
    private String userQualificationID;
    @SerializedName("DOB")
    private String userDOB;
    @SerializedName("doj")
    private String userDOJ;
    @SerializedName("roles")
    private String userRole;
    @SerializedName("profiles")
    private String profiles;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END
    @SerializedName("groups")
    private String userGroups;

    public User() {
    }

    public User(Long id) {
        this.id = id;
    }

    public User(Long id, String userID, String userFirstName, String userLastName, String username, String password, String userEmailID, String userMobileNo, String userOrg, String userOrgCode, String userLocationID, String userDesignationID, String userPicture, String userQualificationID, String userDOB, String userDOJ, String userRole, String profiles, String userGroups) {
        this.id = id;
        this.userID = userID;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.username = username;
        this.password = password;
        this.userEmailID = userEmailID;
        this.userMobileNo = userMobileNo;
        this.userOrg = userOrg;
        this.userOrgCode = userOrgCode;
        this.userLocationID = userLocationID;
        this.userDesignationID = userDesignationID;
        this.userPicture = userPicture;
        this.userQualificationID = userQualificationID;
        this.userDOB = userDOB;
        this.userDOJ = userDOJ;
        this.userRole = userRole;
        this.profiles = profiles;
        this.userGroups = userGroups;
    }

    protected User(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.userID = in.readString();
        this.userFirstName = in.readString();
        this.userLastName = in.readString();
        this.username = in.readString();
        this.password = in.readString();
        this.userEmailID = in.readString();
        this.userMobileNo = in.readString();
        this.userOrg = in.readString();
        this.userOrgCode = in.readString();
        this.userLocationID = in.readString();
        this.userDesignationID = in.readString();
        this.userPicture = in.readString();
        this.userQualificationID = in.readString();
        this.userDOB = in.readString();
        this.userDOJ = in.readString();
        this.userRole = in.readString();
        this.profiles = in.readString();
        this.userGroups = in.readString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserEmailID() {
        return userEmailID;
    }

    public void setUserEmailID(String userEmailID) {
        this.userEmailID = userEmailID;
    }

    public String getUserMobileNo() {
        return userMobileNo;
    }

    public void setUserMobileNo(String userMobileNo) {
        this.userMobileNo = userMobileNo;
    }

    public String getUserOrg() {
        return userOrg;
    }

    public void setUserOrg(String userOrg) {
        this.userOrg = userOrg;
    }

    public String getUserOrgCode() {
        return userOrgCode;
    }

    public void setUserOrgCode(String userOrgCode) {
        this.userOrgCode = userOrgCode;
    }

    public String getUserLocationID() {
        return userLocationID;
    }

    public void setUserLocationID(String userLocationID) {
        this.userLocationID = userLocationID;
    }

    public String getUserDesignationID() {
        return userDesignationID;
    }

    public void setUserDesignationID(String userDesignationID) {
        this.userDesignationID = userDesignationID;
    }

    public String getUserPicture() {
        return userPicture;
    }

    public void setUserPicture(String userPicture) {
        this.userPicture = userPicture;
    }

    public String getUserQualificationID() {
        return userQualificationID;
    }

    public void setUserQualificationID(String userQualificationID) {
        this.userQualificationID = userQualificationID;
    }

    public String getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(String userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserDOJ() {
        return userDOJ;
    }

    public void setUserDOJ(String userDOJ) {
        this.userDOJ = userDOJ;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getProfiles() {
        return profiles;
    }

    public void setProfiles(String profiles) {
        this.profiles = profiles;
    }

    // KEEP METHODS - put your custom methods here

    public String getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(String userGroups) {
        this.userGroups = userGroups;
    }

    // KEEP METHODS END

    public String getFullname() {
        return userFirstName + " " + userLastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userID='" + userID + '\'' +
                ", userFirstName='" + userFirstName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", userEmailID='" + userEmailID + '\'' +
                ", userMobileNo='" + userMobileNo + '\'' +
                ", userOrg='" + userOrg + '\'' +
                ", userOrgCode='" + userOrgCode + '\'' +
                ", userLocationID='" + userLocationID + '\'' +
                ", userDesignationID='" + userDesignationID + '\'' +
                ", userPicture='" + userPicture + '\'' +
                ", userQualificationID='" + userQualificationID + '\'' +
                ", userDOB='" + userDOB + '\'' +
                ", userDOJ='" + userDOJ + '\'' +
                ", userRole='" + userRole + '\'' +
                ", profiles='" + profiles + '\'' +
                ", userGroups='" + userGroups + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.userID);
        dest.writeString(this.userFirstName);
        dest.writeString(this.userLastName);
        dest.writeString(this.username);
        dest.writeString(this.password);
        dest.writeString(this.userEmailID);
        dest.writeString(this.userMobileNo);
        dest.writeString(this.userOrg);
        dest.writeString(this.userOrgCode);
        dest.writeString(this.userLocationID);
        dest.writeString(this.userDesignationID);
        dest.writeString(this.userPicture);
        dest.writeString(this.userQualificationID);
        dest.writeString(this.userDOB);
        dest.writeString(this.userDOJ);
        dest.writeString(this.userRole);
        dest.writeString(this.profiles);
        dest.writeString(this.userGroups);
    }
}