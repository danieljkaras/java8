package com.infoshare.java8;

import java.util.List;

public class MinOperation implements MathOperation {

    @Override
    public Integer calculate(List<Integer> mathList) {

        Integer min = Integer.MAX_VALUE;

        for (Integer x: mathList)

            if (x < min){

                min = x;
            }

        return min;
    }
}
