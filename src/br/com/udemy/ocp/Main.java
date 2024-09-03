package br.com.udemy.ocp;

import br.com.udemy.ocp.vehicle.Car;
import br.com.udemy.ocp.vehicle.Motorcycle;

//Open/Close Principle - Princípio Aberto/Fechado

public class Main {
    private static TypeVehicle typeVehicle;

    public static void main(String[] args) {

        typeVehicle = TypeVehicle.CAR;
//        typeVehicle = TypeVehicle.MOTORCYCLE;

        if(typeVehicle == TypeVehicle.CAR){
            Car car = new Car("Azul", "2025", 2.8, 4);
        } else if (typeVehicle == TypeVehicle.MOTORCYCLE) {
            Motorcycle motorcycle = new Motorcycle("Branca", "2023", 250);
        }
    }
}