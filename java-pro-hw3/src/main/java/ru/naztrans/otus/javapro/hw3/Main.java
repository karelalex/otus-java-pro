package ru.naztrans.otus.javapro.hw3;

public class Main {
    public static void main(String[] args) {
        var appleBox = new Box<Apple>();
        var secondAppleBox = new Box<Apple>();
        var fruitBox = new Box<>();
        var orangeBox = new Box<Orange>();
        appleBox.add(new Apple(15));
        appleBox.add(new Apple(20));
        appleBox.add(new Apple(10));
        appleBox.add(new Apple(12));
        secondAppleBox.add(new Apple(25));
        secondAppleBox.add(new Apple(35));
        secondAppleBox.add(new Apple(17));
        fruitBox.add(new Apple(25));
        fruitBox.add(new Orange(32));
        orangeBox.add(new Orange(14));
        orangeBox.add(new Orange(33));
        orangeBox.add(new Orange(17));

        System.out.println("Вес коробки с яблоками " + appleBox.weight());
        System.out.println("Вес второй коробки с яблоками " + secondAppleBox.weight());
        System.out.println("Вес коробки с фруктами " + fruitBox.weight());
        System.out.println("Вес коробки с апельсинами " + orangeBox.weight());
        System.out.println("Веса двух коробок с яблоками " + (appleBox.compare(secondAppleBox) ? "одинаковые" : "разные"));
        System.out.println("Веса коробок с яблоками и с фруктами " + (appleBox.compare(fruitBox) ? "одинаковые" : "разные"));

        appleBox.pour(secondAppleBox);

        System.out.println("Вес второй коробки с яблоками стал " + secondAppleBox.weight());
        System.out.println("А первой " + appleBox.weight());

        // secondAppleBox.pour(orangeBox); так не получится

        secondAppleBox.pour(fruitBox);
        orangeBox.pour(fruitBox);

        System.out.println("Вес коробки со всеми фруктами " + fruitBox.weight());

    }


}
