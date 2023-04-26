package com.napier.sem;


public class City {
    private final int id;
    private final String name;
    private final String country_code;
    private final String district;
    private final int population;

    public City(int id, String name, String country_code, String district, int population) {
        this.id = id;
        this.name = name;
        this.country_code = country_code;
        this.district = district;
        this.population = population;
    }

    /**
     *
     * he unique identifier number of this city
     */
    public int getId() {
        return id;
    }

    /**
     *
     * The name of this city
     */
    public String getName() {
        return name;
    }

    /**
     *
     * The country code of this city
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     *
     * The district of this city
     */
    public String getDistrict() {
        return district;
    }

    /**
     *
     * The population of this city
     */
    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", country_code='" + this.country_code + '\'' +
                ", district='" + this.district + '\'' +
                ", population=" + this.population +
                '}';
    }
}