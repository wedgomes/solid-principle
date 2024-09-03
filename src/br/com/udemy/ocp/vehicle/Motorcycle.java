package br.com.udemy.ocp.vehicle;

public class Motorcycle extends Vehicle{

    public Motorcycle(String color, String year, double engine) {
        this.color = color;
        this.year = year;
        this.engine = engine;

        configureMotorcycle();
    }

    public void configureMotorcycle(){
        System.out.println("Criando uma Moto: "+color+" "+year+" "+engine);
        startVehicle();
    }
}
