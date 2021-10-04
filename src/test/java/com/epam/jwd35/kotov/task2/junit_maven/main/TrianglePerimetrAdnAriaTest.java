/*
 * Java Web Development
 * JWD 35
 * Oleg Kotov
 * Task2
 * JUnit, Maven
 * From 01-10-2021 to 03-10-2021
 */
package com.epam.jwd35.kotov.task2.junit_maven.main;

import org.junit.Assert;
import org.junit.Test;

public class TrianglePerimetrAdnAriaTest {
    double positiveCathetusValue1 = 5;
    double positiveCathetusValue2 = 4;
    double zeroCathetusValue = 0;
    double negativeCathetusValue1 = -5;
    double negativeCathetusValue2 = -4;

    @Test
    public void calculetePerimetrWhenTwoCatPositive() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = 15.4031242374;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(positiveCathetusValue1,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenFirstCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(negativeCathetusValue1,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenSecondCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(positiveCathetusValue1,
                negativeCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenTwoCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(negativeCathetusValue1,
                negativeCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenFirstCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(zeroCathetusValue,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenSecondCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(positiveCathetusValue1,
                zeroCathetusValue);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculetePerimetrWhenTwoCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculatePerimeter(zeroCathetusValue,
                zeroCathetusValue);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenTwoCatPositive() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = 10;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(positiveCathetusValue1,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenFirstCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(negativeCathetusValue1,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenSecondCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(positiveCathetusValue1,
                negativeCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenTwoCatNegative() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(negativeCathetusValue1,
                negativeCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenFirstCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(zeroCathetusValue,
                positiveCathetusValue2);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenSecondCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(positiveCathetusValue1,
                zeroCathetusValue);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }

    @Test
    public void calculeteAreaWhenTwoCatZero() {
        double expectedResult;
        double actualResult;
        double delta;

        expectedResult = -1;
        delta = 0.00000001;
        actualResult = TrianglePerimetrAdnAria.calculateArea(zeroCathetusValue,
                zeroCathetusValue);

        Assert.assertEquals(expectedResult, actualResult, delta);
    }
}