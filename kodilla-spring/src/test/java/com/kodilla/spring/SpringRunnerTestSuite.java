package com.kodilla.spring;

import com.kodilla.spring.shape.Circle;
import com.kodilla.spring.shape.Shape;
import com.kodilla.spring.shape.Square;
import com.kodilla.spring.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringRunnerTestSuite {
    @Test
    public void testCircleLoadedIntoContener(){
        //GIVEN
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Circle.class);
        //WHEN
        String name = shape.getShapeName();
        //THEN
        Assert.assertEquals("This is a circle", name);
    }

    @Test
    public void testTriangleLoadedIntoContener(){
        //GIVEN
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Triangle.class);
        //WHEN
        String name = shape.getShapeName();
        //THEN
        Assert.assertEquals("This is a triangle", name);
    }

    @Test
    public void testSquareLoadedIntoContainer() {
        //GIVEN
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = context.getBean(Square.class);
        //When
        String name = shape.getShapeName();
        //Then
        Assert.assertEquals("This is square", name);
    }

    @Test
    public void testShapeLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Shape shape = (Shape) context.getBean("chosenShape");
        //When
        String name = shape.getShapeName();
        //Then
        System.out.println("Shape random introduction ::: " + name);
    }
}
