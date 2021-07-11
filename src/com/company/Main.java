package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        Car[] cars = new Car[4];
        Motorcycle[] moto = new Motorcycle[3];

        System.out.println("Number of vehicles in the system: "+ Car.getNumberOfCars());

        cars[0] = new Car("Toyota", "Blue");
        cars[1] = new Car("Ferrari", "Red", 2);
        cars[2] = new Car("Nissan", "Green", 4);

        moto[0] = new Motorcycle("Eagle", "Green", 220);
        moto[1] = new Motorcycle("Ferrari", "Red", 22);

        new Car("bon", "Green");

        System.out.println("Give me the name of the vehicle ");
        String name = sc.nextLine();
        System.out.println("Give me the color ");
        String color = sc.nextLine();
        System.out.println("Give me the max speed of the vehicle ");
        int maxSpeed = Integer.parseInt(sc.nextLine());

        moto[2] = new Motorcycle(name, color, maxSpeed);

        EndOfProduction end = new EndOfProduction(2020); //Composition
        end.getTests().addMotorcycle(moto[2], moto[1]); //Aggregation

        System.out.println("Number of vehicles in the system: "+ Car.getNumberOfCars());

        Ensurance ensurance1 = new GlobalEnsurance();
        Ensurance ensurance2 = new LocalEnsurance();
        ensurance1.insuredCar(cars[rand.nextInt(3)]); // random
        ensurance2.insuredCar(cars[rand.nextInt(3)]);

        Ensurance ensurance3 = ensurance1.createNewEnsurance(); //Association

        System.out.println("Number of Insurance types " + GlobalEnsurance.getNumberOfInsurancesTypes());
        System.out.println("Number of Insurance types " + LocalEnsurance.getNumberOfInsurancesTypes());

    }
}
