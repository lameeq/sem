package com.napier.sem;

public class Country {

    // _____________________
    // Class Variables:

    private final String ISO3Code;
    private final String name;
    private final String continent;
    private final String region;
    private final Double surfaceArea;
    private final int independenceYear;
    private final int population;
    private final double lifeExpectancy;
    private final double GNP;
    private final double GNPOld;
    private final String localName;
    private final String governmentForm;
    private final String headOfState;
    private final int capital;
    private final String ISO2Code;

    // _____________________
    // Class Constructors:

    public Country(String ISO3Code, String name, String continent, String region,
                   Double surfaceArea, int indepYear, int population, double lifeExpectancy,
                   double GNP, double GNPOld, String localName, String governmentForm, String headOfState,
                   int capital, String ISO2Code) {
        this.ISO3Code = ISO3Code;
        this.name = name;
        this.continent = continent;
        this.region = region;
        this.surfaceArea = surfaceArea;
        this.independenceYear = indepYear;
        this.population = population;
        this.lifeExpectancy = lifeExpectancy;
        this.GNP = GNP;
        this.GNPOld = GNPOld;
        this.localName = localName;
        this.governmentForm = governmentForm;
        this.headOfState = headOfState;
        this.capital = capital;
        this.ISO2Code = ISO2Code;
    }

    // _____________________
    // Class Getters:

    /**
     * The ISO 3166-1 alpha-3 country code
     */
    public String getISO3Code() {
        return ISO3Code;
    }

    /**
     * The name of the country
     */
    public String getName() {
        return name;
    }

    /**
     * The continent of the country
     */
    public String getContinent() {
        return continent;
    }

    /**
     * The geographic region of the country
     */
    public String getRegion() {
        return region;
    }

    /**
     * The surface area of the country
     */
    public double getSurfaceArea() {
        return surfaceArea;
    }

    /**
     * The independence year
     */
    public int getIndependenceYear() {
        return independenceYear;
    }

    /**
     * The population of the country
     */
    public int getPopulation() {
        return population;
    }

    /**
     * The life expectancy of the country
     */
    public double getLifeExpectancy() {
        return lifeExpectancy;
    }

    /**
     *  The GNP (Gross National Product) of the country
     */
    public double getGNP() {
        return GNP;
    }

    /**
     *  The old GNP (Gross National Product) of the country
     */
    public double getGNPOld() {
        return GNPOld;
    }

    /**
     *  The local name of the country
     */
    public String getLocalName() {
        return localName;
    }

    /**
     *  The government form of the country
     */
    public String getGovernmentForm() {
        return governmentForm;
    }

    /**
     *  The head of state of the country
     */
    public String getHeadOfState() {
        return headOfState;
    }

    /**
     *  The capital of the country
     */
    public int getCapital() {
        return capital;
    }

    /**
     *  The ISO2Code of the country
     */
    public String getISO2Code() {
        return ISO2Code;
    }

    // _____________________
    // Class other methods:

    @Override
    public String toString() {
        return "Country{" +
                "ISO3Code='" + ISO3Code + '\'' +
                ", name='" + name + '\'' +
                ", continent='" + continent + '\'' +
                ", region='" + region + '\'' +
                ", surfaceArea=" + surfaceArea +
                ", independenceYear=" + independenceYear +
                ", population=" + population +
                ", lifeExpectancy=" + lifeExpectancy +
                ", GNP=" + GNP +
                ", GNPOld=" + GNPOld +
                ", localName='" + localName + '\'' +
                ", governmentForm='" + governmentForm + '\'' +
                ", headOfState='" + headOfState + '\'' +
                ", capital=" + capital +
                ", ISO2Code='" + ISO2Code + '\'' +
                '}';
    }
}