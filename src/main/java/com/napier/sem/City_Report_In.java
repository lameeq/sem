package com.napier.sem;

public class City_Report_In {

    public static void main(App a) {

        // Prints the population of people living in cities in the continent of North America
        a.printInAndOutOfCities(a.getInAndOutOfCities("Continent","North America"));

        // Prints the population of people living in cities in the region of the Caribbean
        a.printInAndOutOfCities(a.getInAndOutOfCities("Region","Caribbean"));

        // Prints the population of people living in cities in the country of Barbados
        a.printInAndOutOfCities(a.getInAndOutOfCities("Country","Barbados"));

    }
}