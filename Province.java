package Lab2;


public class Province {
    private static final String DEFAULT_PROVINCE = "British Columbia";
    private static final String DEFAULT_CAPITAL = "Victoria";
    private static final int DEFAULT_POPULATION_MILLIONS = 4;

    // instance variables:
    private String name;
    private String capital;
    private int populationInMillions;

    public Province (String name, String capital, int populationInMillions) {
        if (isValidProvince(name)&& isValidCapitalCity(capital) && isValidPopulation(populationInMillions)) {
            this.name = name;
            this.capital = capital;
            this.populationInMillions = populationInMillions;
        } else {
            this.populationInMillions = DEFAULT_POPULATION_MILLIONS;
            this.name = DEFAULT_PROVINCE;
            this.capital = DEFAULT_CAPITAL;
        }
    }



    // method that contains an array of provinces names
    private boolean isValidProvince (String province) {
        String[] provinces = {"Ontario", "Quebec", "Nova Scotia", "New Brunswick", "Manitoba",
                "British Columbia", "Prince Edward Island", "Saskatchewan", "Alberta", "Newfoundland and Labrador"};
        int i = 0;
        while (i < provinces.length) {
            if (province.equals(provinces[i])) {
                return true;
            }
            i++;
        }
        return false;
    }

    // method that contains an array of capitals

    private boolean isValidCapitalCity (String capital) {
        String[] capitals = {"Toronto", "Quebec City", "Halifax", "Fredericton", "Winnipeg", "Victoria", "Charlottetown", "Regina", "Edmonton", "St. John's"};
        for (int j = 0; j < capitals.length; j++) {
            if (capitals.equals(capitals[j])) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidPopulation (int population) {
        if (population >= 4 && population <= 38) {
            return true;
        }
        return false;
    }





    // getter
    public String getDetails() {
        return String.format("The capital of " + this.name + " population " + this.populationInMillions + " million is " + this.capital);
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public int getPopulationInMillions() {
        return populationInMillions;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulationInMillions(int populationInMillions) {
        this.populationInMillions = populationInMillions;
    }
}
