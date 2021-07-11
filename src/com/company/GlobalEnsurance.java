package com.company;

public class GlobalEnsurance extends Ensurance {

    private static int numberOfInsurancesTypes;

    GlobalEnsurance() {
        numberOfInsurancesTypes++;
    }

    public static int getNumberOfInsurancesTypes() {
        return numberOfInsurancesTypes;
    }

    @Override
    public Ensurance createNewEnsurance() {
        return new GlobalEnsurance();
    }
}
