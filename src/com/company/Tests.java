package com.company;

public class Tests {
    private Motorcycle[] motorcycles;
    private int year;

    public Tests(int year, Motorcycle... s) {
        this.year = year;
        this.addMotorcycle(s);
    }

    public void addMotorcycle(Motorcycle... s) {  //Varags
        int n = s.length;
        motorcycles = new Motorcycle[n];
        int i = 0;
        for (Motorcycle x : s) {
            motorcycles[i] = x;
            i++;
        }
    }
}
