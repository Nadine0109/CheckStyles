package ru.netology.checkstyles;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckStylesTest {
    @Test
    void findMax() {
        CheckStyles service = new CheckStyles();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum() {
        CheckStyles service = new CheckStyles();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 85;

        long actual = service.calculateSum(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void findAverageSum() {
        CheckStyles service = new CheckStyles();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 7;

        long actual = service.findAverageSum(incomesInBillions);

        assertEquals(expected, actual);
    }

}