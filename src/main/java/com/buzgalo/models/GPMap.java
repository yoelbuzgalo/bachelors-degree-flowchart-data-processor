package com.buzgalo.models;

import java.util.HashMap;

public class GPMap {
    static final private HashMap<String, Double> _gradePoint = new HashMap<String, Double>();

    static {
        _gradePoint.put("A", 4.0);
        _gradePoint.put("A-", 3.7);
        _gradePoint.put("B+", 3.3);
        _gradePoint.put("B", 3.0);
        _gradePoint.put("B-", 2.7);
        _gradePoint.put("C+", 2.3);
        _gradePoint.put("C", 2.0);
        _gradePoint.put("C-", 1.7);
        _gradePoint.put("D+", 1.3);
        _gradePoint.put("D", 1.0);
        _gradePoint.put("D-", 0.7);
        _gradePoint.put("F", 0.0);
    }

    static public double getGPFromLetter(String letterGrade) {
            return _gradePoint.get(letterGrade);
        }
}