package com.company;

public class LocalEnsurance extends Ensurance {

    private static int numberOfInsurancesTypes;

    LocalEnsurance() {
        numberOfInsurancesTypes++;
    }

    public static int getNumberOfInsurancesTypes() {
        return numberOfInsurancesTypes;
    }

    @Override
    public Ensurance createNewEnsurance() {
        return new LocalEnsurance();
    }
}
