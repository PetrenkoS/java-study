package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by Admin on 26.05.2017.
 */
public class SquareTests {

    @Test

    public void testArea() {
        Square s = new Square(5);
        assert s.area() == 25;
    }
}

