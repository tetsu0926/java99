package org.example;

import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TreeSet<Integer> lotto = new TreeSet<>();

//        int total = 180;
        int count = 20240420;
        List<Integer> list = Arrays.asList(3, 13, 30, 33, 43, 45);

        int sum = 0;
        int no = 0;
        while (lotto.size() < 6) {
            int number = new Random().nextInt(45) + 1;
            boolean flag = list.stream().anyMatch(s -> s == number);
            if (!flag) lotto.add(number);
            if(lotto.size()== 6 ){
                sum = lotto.stream().mapToInt(Integer::intValue).sum();
                if (no < count) {
                    lotto.clear();
                }
                no++;
            }
        }



            sum = lotto.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println(lotto.toString());


    }
}
