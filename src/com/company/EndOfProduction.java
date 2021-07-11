package com.company;

public class EndOfProduction {
    private final Tests generalTests;
    private final int year;

    public EndOfProduction(int year) {
        generalTests = new Tests(year);
        this.year = year;
    }

    public Tests getTests() {
        return this.generalTests;
    }
}
