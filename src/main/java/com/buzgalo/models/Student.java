package com.buzgalo.models;

import java.util.*;

public class Student {

    private final String _school;
    private final String _name;
    private final String _major;
    private final int _creditsRequired;
    private final Degree _degreeType;

    class YearSeasonComparator implements Comparator<YearSeason> {
        @Override
        public int compare(YearSeason yearSeason_a, YearSeason yearSeason_b) {
            if (yearSeason_a.getYearValue().equals(yearSeason_b.getYearValue())){
                return yearSeason_a.getSeasonValue().compareTo(yearSeason_b.getSeasonValue());
            }
            return yearSeason_a.getYearValue().compareTo(yearSeason_b.getYearValue());
        }
    }

    private final Map<YearSeason, Semester> _semesters = new TreeMap<YearSeason, Semester>(new YearSeasonComparator());

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
        this._semesters.put(semester.getYearSeason(), semester);
    }

    public Map<YearSeason, Semester> getSemesters(){
        return Collections.unmodifiableMap(this._semesters);
    }

    public int getCreditsLeft(){
        int totalAchievedCredits = 0;
        for (YearSeason yearSeason: this._semesters.keySet()){
            totalAchievedCredits += this._semesters.get(yearSeason).getAchieved();
        }
        return (this._creditsRequired - totalAchievedCredits);
    }

    public double getCumulativeGPA(){
        double totalAchievedSemestersGPA = 0.0;
        int semestersCount = 0;
        for (YearSeason yearSeason: this._semesters.keySet()){
            totalAchievedSemestersGPA += this._semesters.get(yearSeason).getGPA();
            semestersCount += 1;
        }
        return (totalAchievedSemestersGPA/semestersCount);
    }

}
