package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTestTest {
    // object under test, called "fixture"
    private HourlyEmployee emp;

    @Before
    public void setUp() {
        emp = new HourlyEmployee("James", Date.valueOf("2000-11-11"), 25.0, 30.0);
    }

    @Test
    public void testPay() {
        assertEquals(750.0, emp.getHours() * emp.getRate(), 0.001);
    }

    @Test
    public void testPayTaxes() {
        assertEquals(187.5, emp.payTaxes(), 0.001); // 25% tax
    }
}