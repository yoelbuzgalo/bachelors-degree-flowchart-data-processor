package com.buzgalo.models;

import java.util.*;

public class Semester {

    public enum Season {
        FALL,
        SPRING
    }

    private final List<Course> _courseList = new ArrayList<Course>();
    private final Season _season;
    private final int _year;

    public Semester(int year, Season season){
        this._year = year;
        this._season = season;
    }

    public int getYear(){
        return this._year;
    }

    public Season getSeason(){
        return this._season;
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
        double totalGP = 0.0;
        int courseCount = 0;
        for (Course course : this._courseList){
            courseCount += 1;
            totalGP += GPMap.getGPFromLetter(course.getCourseGrade());
        }
        return totalGP/courseCount;
    }
}
