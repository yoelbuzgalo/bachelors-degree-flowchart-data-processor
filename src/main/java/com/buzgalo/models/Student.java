package com.buzgalo.models;

import java.util.*;

public class Student {

    private final String _school;
    private final String _name;
    private final String _major;
    private final int _creditsRequired;
    private final Degree _degreeType;

    private final List<Semester> _semesters = new ArrayList<Semester>();

    public Student(String school, String name, String major, int creditsRequired, Degree degreeType){
        this._school = school;
        this._name = name;
        this._major = major;
        this._creditsRequired = creditsRequired;
        this._degreeType = degreeType;
    }

    public String getName(){
        return this._name;
    }

    @Override
    public String toString(){
        return "School: " +
                this._school + "\n" +
                "Student Name: " + this._name + "\n" +
                "Major: " + this._major + "\n" +
                "Credits Required: " + this._creditsRequired + "\n" +
                "Degree: " + this._degreeType.getDescription();
    }

    public void addSemester(Semester semester){
        this._semesters.add(semester);
    }

    public List<Semester> getSemesters(){
        return Collections.unmodifiableList(this._semesters);
    }

    public int getCreditsLeft(){
        int totalAchievedCredits = 0;
        for (Semester semester: this._semesters){
            totalAchievedCredits += semester.getAchieved();
        }
        return (this._creditsRequired - totalAchievedCredits);
    }

    public double getCumulativeGPA(){
        double totalAchievedSemestersGPA = 0.0;
        int semestersCount = 0;
        for (Semester semester: this._semesters){
            totalAchievedSemestersGPA += semester.getGPA();
            semestersCount += 1;
        }
        return (totalAchievedSemestersGPA/semestersCount);
    }

}
