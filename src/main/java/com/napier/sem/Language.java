package com.napier.sem;


public class Language {
    private String countryCode;
    private String languageName;
    private String isOfficial;
    private Double percentage;

    /**
     * Class Constructor:
     *
     *
     *
     *
     *
     */
    public Language(String countryCode, String languageName, String isOfficial, double percentage) {
        this.countryCode = countryCode;
        this.languageName = languageName;
        this.isOfficial = isOfficial;
        this.percentage = percentage;
    }

    /**
     * The language name
     */
    public String getCountryCode() {return countryCode; }

    /**
     * The language name
     */
    public String getLanguageName() {
        return languageName;
    }

    /**
     * Whether its official
     */
    public String isOfficial() {
        return isOfficial;
    }

    /**
     * The percentage of people who speak it
     */
    public double getPercentage() {
        return percentage;
    }

    @Override
    public String toString() {
        return "Language{" + "languageName='" + languageName + "', " + "percentage='" + percentage + "', " +  "isOfficial='" + isOfficial + "'" + "}";
    }
}