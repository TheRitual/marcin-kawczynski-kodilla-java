package com.kodilla.spring.shape;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class ShapesFactory {
    @Bean
    public Square createSquare() {
        return new Square();
    }

    @Bean
    public Shape chosenShape() {
        Shape theShape;
        Random generator = new Random();
        int chosen = new Random().nextInt(3);
        switch(chosen){
            case 0 : theShape = new Circle(); break;
            case 1 : theShape = new Triangle(); break;
            case 2 : theShape = new Square(); break;
            default: theShape = null;
        }
        return theShape;
    }
}
