package com.buzgalo.models;

import java.util.ArrayList;

public class Semester {
    public enum Season {
        FALL,
        SPRING
    }

    private ArrayList<Course> _courseList = new ArrayList<Course>();
    private Season _season;
    private int _year;

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

    public ArrayList<Course> getCourseList(){
        return this._courseList;
    }

    public void addCourseToList(Course course){
        this._courseList.add(course);
    }

    public double getGPA(){
        double totalGP = 0.0;
        int courseCount = 0;
        for (Course course : this._courseList){
            courseCount += 1;
            totalGP += GPMap.getGPFromLetter(course.getCourseGrade());
        }
        return (totalGP / courseCount);
    }
}
