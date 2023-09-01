package ru.naztrans.otus.javapro.hw1;

import com.google.common.base.Joiner;

import java.util.List;

public class HelloOtus {
    public static void main(String[] args) {
        var joiner = Joiner.on(" ");
        var strings = List.of("I", "like", "learning", "Java.");
        System.out.println(joiner.join(strings));
    }
}
