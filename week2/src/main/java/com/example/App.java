package com.example;

public class App {
    public String getMessage() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
