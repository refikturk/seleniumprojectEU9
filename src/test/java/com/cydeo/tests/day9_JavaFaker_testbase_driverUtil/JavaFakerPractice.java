package com.cydeo.tests.day9_JavaFaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().firstName() = " + faker.name().firstName());

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));




    }

}
