package com.buzgalo.models;

public class Course {
    private String _courseName;
    private String _courseCatalog;
    private int _courseCredits;
    private String _courseGrade;
    private String _requiredPassingGrade;
    private boolean _courseAchieved;

    public Course(String courseName, String courseCatalog, int courseCredits,String requiredPassingGrade, String courseGrade){

        // Initializers
        this._courseName = courseName;
        this._courseCatalog = courseCatalog;
        this._courseCredits = courseCredits;
        this._courseGrade = courseGrade;
        this._requiredPassingGrade = requiredPassingGrade;

        // If course grade was passed null, set to false. Otherwise, check if the grade is above passing grade
        if (this._courseGrade == null){
            this._courseAchieved = false;
        } else if (GPMap.getGPFromLetter(this._courseGrade) >= GPMap.getGPFromLetter(this._requiredPassingGrade)) {
            this._courseAchieved = true;
        }

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
