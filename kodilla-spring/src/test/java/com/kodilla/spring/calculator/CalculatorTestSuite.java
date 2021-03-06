package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = (Calculator) context.getBean("calculator");
        //When
        double result1 = calculator.dd(4,4);
        double result2 = calculator.sub(6,4);
        double result3 = calculator.mul(2,7);
        double result4 = calculator.div(4,2);
        //Then
        Assert.assertEquals(8,result1,0.01);
        Assert.assertEquals(2,result2,0.01);
        Assert.assertEquals(14,result3,0.01);
        Assert.assertEquals(2,result4,0.01);
    }
}
