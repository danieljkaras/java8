package com.infoshare.java8;

public class Dish {

    String name;
    String vegetarian;
    Integer calories;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(String vegetarian) {
        this.vegetarian = vegetarian;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Dish(String name, String vegetarian, Integer calories) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Dish [ Name: " + name + " , vegetarian: " + vegetarian + " , calories: " + calories + "]";
    }
}
