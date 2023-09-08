package ru.naztrans.otus.javapro.hw3;

public abstract class Fruit {
    private final int mass;

    protected Fruit(int mass) {
        this.mass = mass;
    }
    public int weight() {
        return mass;
    }
}
