package com.buzgalo.models;

public class YearSeason {
    private final int _year;
    private final Season _season;

    public YearSeason(int year, Season season){
        this._year = year;
        this._season = season;
    }

    public Integer getYearValue(){
        return this._year;
    }

    public Integer getSeasonValue(){
        return this._season.getValue();
    }

    public Season getSeason(){
        return this._season;
    }
}

