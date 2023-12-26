package com.buzgalo.models;

public class Course {
    private String _courseName;
    private String _courseCatalog;
    private int _courseCredits;
    private String _courseGrade;
    private boolean _courseAchieved;

    public Course(String courseName, String courseCatalog, int courseCredits, String courseGrade){
        this._courseName = courseName;
        this._courseCatalog = courseCatalog;
        this._courseCredits = courseCredits;
        this._courseGrade = courseGrade;
        this._courseAchieved = this._courseGrade != null;
    }

    public String getCourseName(){
        return this._courseName;
    }

    public String getCourseCatalog(){
        return this._courseCatalog;
    }

    public int getCourseCredit(){
        return this._courseCredits;
    }

    public String getCourseGrade(){
        return this._courseGrade;
    }

    public boolean isAchieved(){
        return this._courseAchieved;
    }


}
