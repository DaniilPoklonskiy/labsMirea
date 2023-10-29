package ru.mirea.lab4;

public class TestSeason {
    public static void main(String[] args) {
        Season myFavoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + myFavoriteSeason);
        System.out.println("Средняя температура: " + myFavoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание времени года: " + myFavoriteSeason.getDescription());
        System.out.println("============================================");

        for (Season season : Season.values()) {
            System.out.println("Время года: " + season);
            System.out.println("Средняя температура: " + season.getAverageTemperature() + "°C");
            System.out.println("Описание времени года: " + season.getDescription());
            System.out.println("--------------------------------------------");
        }

        Season.printSeasonDescription(myFavoriteSeason);
    }

}

