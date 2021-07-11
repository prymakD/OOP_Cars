package com.company;

public class EndOfProduction {
    private Tests generalTests;
    private int year;

    public EndOfProduction(int year){
        generalTests = new Tests(year);
        this.year = year;
    }

    public Tests getTests(){
        return this.generalTests;
    }
}
