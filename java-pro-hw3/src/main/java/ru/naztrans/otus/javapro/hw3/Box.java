package ru.naztrans.otus.javapro.hw3;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private final List<T> inner = new ArrayList<>();

    public void add(T fruit){
        inner.add(fruit);
    }

    public int weight(){
        return inner
                .stream()
                .mapToInt(Fruit::weight)
                .sum();
    }

    public boolean compare(Box<?> other){
        return this.weight() == other.weight();
    }

    public void pour(Box<? super T> other){
        other.inner.addAll(this.inner);
        this.inner.clear();
    }
}
