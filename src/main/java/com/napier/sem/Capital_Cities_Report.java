package com.napier.sem;

public class Capital_Cities_Report {
    public static void main(App a) {
        // Print all capital cities in the world from the largest population to smallest
        System.out.println("All capital cities in the world - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("",30));
        System.out.println();

        // Print all capital cities in a continent from the largest population to smallest
        System.out.println("All capital cities in a continent (North America) - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("country.Continent = 'North America'",30));
        System.out.println();

        //Print all capital cities in a region from the largest population to smallest
        System.out.println("All capital cities in a region (Eastern Asia) - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("country.Region = 'Eastern Asia'",30));
        System.out.println();

        // Print top N capital cities in the world from the largest population to smallest
        System.out.println("All top 5 capital cities in the world - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("",5));
        System.out.println();

        //Print top N capital cities a continent from the largest population to smallest
        System.out.println("All top 5 capital cities in a continent (South America) - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("country.Continent = 'South America'",5));
        System.out.println();

        //Print top N capital cities a region from the largest population to smallest
        System.out.println("All top 5 capital cities in a region (Eastern Asia) - Largest Population to Smallest:");
        a.printCapitalCities(a.getCapitalCities("country.Region = 'Eastern Asia'",5));
        System.out.println();
    }
}