package ru.mirea.lab4;

public enum Season {
    SPRING(15),
    SUMMER(25),
    AUTUMN(10),
    WINTER(-15);

    private int averageTemperature;


    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }


    public String getDescription() {

        if (this == SUMMER) {
            return "Теплое время года";
        } else {
            return "Холодное время года";
        }
    }


    public int getAverageTemperature() {
        return averageTemperature;
    }


    public static void printSeasonDescription(Season season) {
        switch (season) {
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
        }
    }
}

