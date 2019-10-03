package com.example.participationexercise4;

public abstract class Shape {
    private int x;
    private int y;
    private String coluur = "blue";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Shape(int x, int y, String colour) {
        this(x, y);
        this.coluur = colour;
    }
}
