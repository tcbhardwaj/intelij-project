package com.spring.security.demo;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //nums[i] + nums[j] + nums[k] == 0.
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                for(int k = j+1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0 && i != j && i != k && j != k) {
                        List<Integer> sumList = new ArrayList<>();
                        sumList.add(i);
                        sumList.add(j);
                        sumList.add(k);

                        result.add(sumList);
                    }
                }
            }
        }

        System.out.println(result);

    }
}



