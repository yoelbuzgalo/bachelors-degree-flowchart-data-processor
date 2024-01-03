package com.buzgalo.models;

import java.util.*;

public class Semester {

    private final List<Course> _courseList = new ArrayList<Course>();
    private final YearSeason _yearSeason;

    public Semester(int year, Season season){
        this._yearSeason = new YearSeason(year, season);
    }

    public YearSeason getYearSeason(){
        return this._yearSeason;
    }

    public List<Course> getCourseList(){
        return Collections.unmodifiableList(this._courseList);
    }

    public void addCourseToList(Course course){
        this._courseList.add(course);
    }

    public int getAchieved(){
        int totalSemesterCredit = 0;
        for (Course course: this._courseList){
            if (course.isAchieved()){
                totalSemesterCredit += course.getCourseCredit();
            }
        }
        return totalSemesterCredit;
    }

    public double getGPA(){
        double totalGPA = 0.0;
        double totalCredits = 0.0;
        for (Course course: this._courseList){
            if (course.isAchieved()){
                totalCredits += course.getCourseCredit();
                totalGPA += course.getCourseGrade().getGradeValue() * course.getCourseCredit();
            }
        }
        return totalGPA/totalCredits;
    }
}
