package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenDistance00To20Then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double dist = a.distance(b);
        Assert.assertEquals(expected, dist, 0.01);
    }

    @Test
    public void whenDistance04To01Then3() {
        int expected = 3;
        Point a = new Point(0, 4);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance18To12Then6() {
        int expected = 6;
        Point a = new Point(1, 8);
        Point b = new Point(1, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance08To01Then7() {
        int expected = 7;
        Point a = new Point(0, 8);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenDistance09To05Then4() {
        int expected = 4;
        Point a = new Point(0, 9);
        Point b = new Point(0, 5);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}