package com.infoshare.java8;

import java.util.List;

public class MaxOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> mathList) {

        Integer max = Integer.MIN_VALUE;

        for (Integer x : mathList) {

            if (x > max)
                max = x;
        }

        return max;
    }
}
