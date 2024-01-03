package com.buzgalo.models;

public enum Grade {
        A(4.0),
        A_MINUS(3.7),
        B_PLUS(3.3),
        B(3.0),
        B_MINUS(2.7),
        C_PLUS(2.3),
        C(2.0),
        C_MINUS(1.7),
        D_PLUS(1.3),
        D(1.0),
        D_MINUS(0.7),
        F(0.0),
        IN_PROGRESS(null);

    private final Double _gradeValue;

    Grade(Double gradeValue){
        this._gradeValue = gradeValue;
    }

    public Double getGradeValue(){
        return this._gradeValue;
    }
}