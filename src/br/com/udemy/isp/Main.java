package br.com.udemy.isp;

import br.com.udemy.isp.vehicle.Car;
import br.com.udemy.isp.vehicle.Motorcycle;

//Interface Segregation Principle - Princípio da Segregação de Interfaces

public class Main {

    private static String type;
    public static void main(String[] args) {

        type = "Car";
        if(type == "Car"){
            Car car = new Car("Azul", "2025", 2.6, 4);
        }else{
            Motorcycle motorcycle = new Motorcycle("Branca", "2022", 260);
        }
    }
}
