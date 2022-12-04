package ro.fasttrackit.hw4.sealed;

import ro.fasttrackit.hw4.sealed.model.*;

public class SealedMain {
    public static void main(String[] args) {
        printCanary();
        printCat();
        printChicken();
        printDog();
        printFly();
        printLadyBug();
        printParrot();
    }

    private static void printParrot() {
        final var parrot = new Parrot();

        System.out.println(parrot.getClass());
        System.out.println(parrot.canIFly());
        System.out.println(parrot.makeSound("prr-prr"));
    }

    private static void printLadyBug() {
        final var ladybug = new Ladybug();

        System.out.println(ladybug.getClass());
        System.out.println(ladybug.isCute());
        System.out.println(ladybug.makeSound("rep-rep"));
    }

    private static void printFly() {
        final var fly = new Fly();

        System.out.println(fly.getClass());
        System.out.println(fly.isCute());
        fly.makeSound("ZzzZz");
    }

    private static void printDog() {
        final var dog = new Dog();

        System.out.println(dog.getClass());
        System.out.println(dog.makeSound("vau"));
    }

    private static void printChicken() {
        final var chicken = new Chicken();

        System.out.println(chicken.getClass());
        System.out.println(chicken.canIFly());
        chicken.makeSound("chip");
    }

    private static void printCat() {
        final var cat = new Cat();

        System.out.println(cat.getClass());
        System.out.println(cat.makeSound("miau"));
    }

    private static void printCanary() {
        final var canary = new Canary();

        System.out.println(canary.getClass());
        System.out.println(canary.canIFly());
        System.out.println(canary.makeSound("FFfck"));
    }
}
