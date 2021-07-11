package com.company;

abstract class Ensurance {
    private Car insured;

    public void insuredCar(Car car) {
        this.insured = car;
        System.out.println("Insured car is " + whichIsInsured());
    }

    protected void cleanup() {
    }

    public String whichIsInsured() {
        return insured.getName();
    }

    abstract Ensurance createNewEnsurance();
}
