package com.company;

import java.util.Scanner;

public class AnimalApp {

    public static void main(String[] args) {
	Animal newAnimal = new Animal();
	Animal newAnimal2 = new Animal("Bob", "Cat", "lazy");
	Scanner scan = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        newAnimal.setName(scan.nextLine());
        System.out.println("Enter animal type: ");
        newAnimal.setType(scan.nextLine());
        System.out.println("Enter animal description: ");
        newAnimal.setDescription(scan.nextLine());
        System.out.println("Enter price: ");
        newAnimal.setPrice(scan.nextDouble());
        System.out.println("Is this in stock: ");
        newAnimal.setInStock(scan.nextLine());
        scan.nextLine();


        System.out.println("Name: " + newAnimal.getName());
        System.out.println("Type: " + newAnimal.getType());
        System.out.println("Description: " + newAnimal.getDescription());
        System.out.println("Price: " + newAnimal.getPrice());
        System.out.println("In stock: " + newAnimal.getInStock());
        System.out.println();
    }
}
