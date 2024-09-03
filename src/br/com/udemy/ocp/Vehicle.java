package br.com.udemy.ocp;

public class Vehicle {
    private String color;
    private String year;
    private double engine;
    private int seats;

    public Vehicle(String color, String year, double engine, int seats) {
        this.color = color;
        this.year = year;
        this.engine = engine;
        this.seats = seats;
    }

    void Car(){
        System.out.println("Criando um Carro: "+ color +" "+ year+" "+engine+" "+seats+" assentos");
        startVehicle();
    }

    void Motorcycle(){
        System.out.println("Criando uma Moto: "+ color +" "+ year+" "+engine);
        startVehicle();
    }

    void startVehicle(){
        System.out.println("Ligando os motores!");
    }
}
