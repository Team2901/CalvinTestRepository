package org.firstinspires.ftc.teamcode.ExamplesAndOtherTests;

public class Dog {
    String color;
    String name;
    String breed;
    double weight;

    public void bark(){
        System.out.println("Woof");
    }

    public Dog(String color,String name, String breed, double weight){
        this.color = color;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

}
