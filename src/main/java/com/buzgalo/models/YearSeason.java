package com.buzgalo.models;

import java.util.Comparator;

public class YearSeason {
	
	public static class YearSeasonComparator implements Comparator<YearSeason> {
        @Override
        public int compare(YearSeason yearSeason_a, YearSeason yearSeason_b) {
            if (yearSeason_a.getYearValue().equals(yearSeason_b.getYearValue())){
                return yearSeason_a.getSeasonValue().compareTo(yearSeason_b.getSeasonValue());
            }
            return yearSeason_a.getYearValue().compareTo(yearSeason_b.getYearValue());
        }
    }
	
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

