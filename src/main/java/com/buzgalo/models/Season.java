package com.buzgalo.models;

public enum Season {
    FALL(1),
    WINTER(2),
    SPRING(3),
    SUMMER(4);

    private final int _value;

    Season(int value){
        this._value = value;
    }

    public int getValue(){
        return this._value;
    }
}
