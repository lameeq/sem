package com.napier.sem;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/**
 * This Class Tests for the City
 *
 */

class CityTest {
    @Test
    void getId() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals(1, city.getId());
    }

    @Test
    void getName() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals("Odessa", city.getName());
    }

    @Test
    void getPopulation() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals(100000, city.getPopulation());
    }

    @Test
    void getCountry_code() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals("169", city.getCountry_code());
    }

    @Test
    void getDistrict() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals("Odessa", city.getDistrict());
    }

    @Test
    void toStringTest() {
        //Arrange
        City city = new City(1,"Odessa", "169", "Odessa", 1000000);

        //Assert
        assertEquals("City{" +
                "id=1" +
                ", name='Odessa" + '\'' +
                ", country_code='169" + '\'' +
                ", district='Odessa" + '\'' +
                ", population=100000" +
                '}', city.toString());
    }
}