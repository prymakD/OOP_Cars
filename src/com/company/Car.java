package com.company;

public class Car {
    protected String name;
    protected String color;
    protected int doorNumber;

    private static int numberOfCars;

    static {
        numberOfCars = 0;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }  //static method

    public Car(String name, String color) {
        this.name = name;
        this.color = color;
        numberOfCars++;
        System.out.println("There are " + getNumberOfCars() + " in total");
    }

    public Car(String name, String color, int doorNumber) {
        this(name, color);
        this.doorNumber = doorNumber;
    }

    public void presentYourself() {
        System.out.println("Its name is " + this.name);
        System.out.println("My color is " + this.color);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
