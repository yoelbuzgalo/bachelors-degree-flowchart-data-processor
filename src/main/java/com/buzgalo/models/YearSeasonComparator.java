package com.buzgalo.models;

import java.util.Comparator;

public class YearSeasonComparator implements Comparator<YearSeason> {
    @Override
    public int compare(YearSeason yearSeason_a, YearSeason yearSeason_b) {
        if (yearSeason_a.getYearValue().equals(yearSeason_b.getYearValue())){
            return yearSeason_a.getSeasonValue().compareTo(yearSeason_b.getSeasonValue());
        }
        return yearSeason_a.getYearValue().compareTo(yearSeason_b.getYearValue());
    }
}
