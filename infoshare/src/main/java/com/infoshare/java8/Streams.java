package com.infoshare.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.*;

public class Streams {

    public static void main(String[] args){


        List<Dish> myMeals = Arrays.asList(
                new Dish("Hummus", "yes", 250 ),
                new Dish("Kebap","no", 550),
                new Dish("Burrito", "no", 500),
                new Dish ("Pizza", "yes", 450),
                new Dish( "Bigos", "no", 520),
                new Dish ("Spaghetii Aiolio", "yes", 285)
        );

       // myMeals.forEach(System.out::println);

        List<Dish> lessCalories = myMeals.stream()
                .sorted((o1, o2) -> o1.calories - o2.calories)
                .collect(Collectors.toList());



        List<String> dishesName = myMeals.stream()
                .map(Dish::getName)
                .sorted()
                .collect(Collectors.toList());

        int dishesCalories = myMeals.stream()
                .map(Dish::getCalories)
                .reduce(0, (o1,o2) -> o1 + o2 );

        System.out.println(dishesCalories);


//        dishesName.forEach(System.out::println);


        //System.out.println("Here is your sorted list by calories: ");
        //System.out.println();

        //lessCalories.forEach(System.out::println);
        // System.out.println(lessCalories);


    }
}
