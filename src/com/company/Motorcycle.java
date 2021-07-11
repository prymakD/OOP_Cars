package com.company;

public class Motorcycle extends Car{
    private int maxSpeed;
    private static final String type = "Sedan"; //FINAL

    public Motorcycle(String name, String color, int maxSpeed){
        super(name, color);
        this.maxSpeed = maxSpeed;
    }
    @Override
    public void presentYourself()
    {
        super.presentYourself();
        System.out.println("Its max speed is "+ maxSpeed);
        System.out.println("Its type is "+ type);
    }

    public int getMaxSpeed() {return maxSpeed; }
    public void setMaxSpeed(int maxSpeed) { this.maxSpeed = maxSpeed; }
}
