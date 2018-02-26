package com.mahindra.be_lms.db;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Entity mapped to table "COURSE".
 */
public class Course implements Parcelable {

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel source) {
            return new Course(source);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };
    @SerializedName("none")
    private Long id;
    @SerializedName("id")
    private String CourseID;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END
    @SerializedName("fullname")
    private String CourseName;

    public Course() {
    }

    public Course(Long id) {
        this.id = id;
    }

    public Course(Long id, String CourseID, String CourseName) {
        this.id = id;
        this.CourseID = CourseID;
        this.CourseName = CourseName;
    }

    protected Course(Parcel in) {
        this.id = (Long) in.readValue(Long.class.getClassLoader());
        this.CourseID = in.readString();
        this.CourseName = in.readString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCourseID() {
        return CourseID;
    }

    public void setCourseID(String CourseID) {
        this.CourseID = CourseID;
    }



    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.CourseID);
        dest.writeString(this.CourseName);
    }
}