package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {

    @Test
    public void testCalculationCase1 () {
        FreelanceService service = new FreelanceService();

       int actual;
        actual = service.calculate(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }
}