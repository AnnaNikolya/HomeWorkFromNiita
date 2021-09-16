package java.lesson6;


import java.util.Scanner;

public abstract class Transport {
    private int carPower;
    private int speed;
    private int weight;
    private String brand;
    // создали переменные

    // создае метод Характеристика и конструктор

    public void autoCharacteristics(int carPower, int speed,int weight, String brand) {
        System.out.println("Данные об автомобиле:" + carPower + speed + weight + brand);
        this.carPower = carPower;
        this.speed = speed;
        this.weight = weight;
        this.brand = brand;


    }

   }



