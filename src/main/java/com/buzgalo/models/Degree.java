package com.buzgalo.models;

public enum Degree {
    AS("Associate in Science"),
    AAS("Associate in Applied Science"),
    AOS("Associate in Occupational Studies"),
    BFA("Bachelor of Fine Arts"),
    BS("Bachelor of Science"),
    MFA("Masters of Fine Arts"),
    MS("Master of Science"),
    PHD("Doctor of Philosophy");

    private final String _description;

    Degree(String description){
        this._description = description;
    }

    public String getDescription(){
        return this._description;
    }

}
