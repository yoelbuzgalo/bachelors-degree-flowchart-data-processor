package com.buzgalo.models;

public class Course {
    private String _courseName;
    private String _courseCatalog;
    private int _courseCredits;
    private Grade _requiredPassingGrade;
    private Grade _courseGrade;

    public Course(String courseName, String courseCatalog, int courseCredits,Grade requiredPassingGrade, Grade courseGrade){

        // Initializers
        this._courseName = courseName;
        this._courseCatalog = courseCatalog;
        this._courseCredits = courseCredits;
        this._courseGrade = courseGrade;
        this._requiredPassingGrade = requiredPassingGrade;

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

    public Grade getCourseGrade(){
        return this._courseGrade;
    }

    public boolean isAchieved(){
        return (this._courseGrade != Grade.IN_PROGRESS && this._courseGrade != null && this._courseGrade.getGradeValue() >= this._requiredPassingGrade.getGradeValue());
    }


}
