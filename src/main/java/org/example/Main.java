package org.example;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> lotto = new TreeSet<>();


        // [4, 11, 21, 34, 40, 42]
        // [5, 18, 29, 35, 36, 41]
        // [5, 15, 18, 25, 35, 40]
        // 16, 19, 24, 25, 29, 37]
        int total = 167;
        List<Integer> list = Arrays.asList(3, 13, 30, 33, 43, 45);

        for(int i=0; i<1005; i++) {
            lotto.clear();
            while (lotto.size() < 6) {
                int number = new Random().nextInt(45) + 1;
                boolean flag = list.stream().anyMatch(s -> s == number);
                if(!flag) lotto.add(number);
            }
            int sum = lotto.stream().mapToInt(Integer::intValue).sum();
            if(sum >= total) {
                lotto.clear();
            }
        }


        int sum = lotto.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(lotto.toString());


    }
}