package com.Geekster.GeeksterTest.Models;

import org.springframework.stereotype.Component;

@Component
public class Square {
    private final int side=5;

    public Square() {
    }
    public int squarearea(){
        return side*side;
    }
}
