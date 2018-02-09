package com.infoshare.java8;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        // runTask(new Run());

//        runTask(() -> System.out.println("Hello from Lambda"));

//        MathOperation maxValue = new MaxOperation();
//        System.out.println("Max Value");
//        System.out.println(maxValue.calculate(numbersList));
//
//        MathOperation minValue = new MinOperation();
//        System.out.println("Min Value");
//        System.out.println(minValue.calculate(numbersList));

//
//       List<Integer> numbersList = Arrays.asList(23, 50, 76, -40, 560, 1020, 750, -150);
//
//        System.out.println("Max");
//        getResult(numbersList, integers -> {
//            Integer max = Integer.MIN_VALUE;
//            for (Integer x : integers) {
//                if (x > max)
//                    max = x;
//            }
//            return max;
//        },
//        i -> System.out.println(i));


//        System.out.println();

//        System.out.println("Min");
//        getResult(numbersList, integers -> {
//            Integer min = Integer.MAX_VALUE;
//            for (Integer x : integers)
//                if (x < min) {
//                    min = x;
//                }
//            return min;
//        },
//        i -> System.out.println(i)
//        );
//
//        Function<List<Integer>, Integer> min = l  -> {
//            Integer max = Integer.MAX_VALUE;
//            for (Integer x : l)
//                if (x < max) {
//                    max = x;
//                }
//            return max;
//            j-> System.out.println(j);
//
//            };
//


//        List<String> stringList = new ArrayList<String>(Arrays.asList("Jordan", "Konrad", "Ania", "", "Michał", "", "Karol", "Krzysiek"));
//
//        stringList.removeIf(s -> s.isEmpty());
//        stringList.forEach(s -> System.out.println(s.toUpperCase()));
//
//
//        Function<List<String>, List<Integer>> lenght = list -> {
//
//            List<Integer> result = new ArrayList<>();
//            list.forEach(s -> result.add(s.length()));
//
//            return result;
//        };
//
//        System.out.println(lenght.apply(stringList));

    // referencje do metod

        List<String> list = new ArrayList<String>(Arrays.asList("Antek", "Konrad", "Ania", "Michał","Karol" ));

        list.forEach(System.out::println);


    }

//    public static void runTask(final Runnable runnable) {
//
//        runnable.run();
//    }


    public static void getResult(List<Integer> theList, Function<List<Integer>, Integer> f,
                                 Consumer<Integer>c) {
        Integer result = f.apply(theList);
        c.accept(result);


    }


}
