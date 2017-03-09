package com.company.tests;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");

        int j =0;
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
            if (j + 2 > list.size()){
                if (list.size() % 2 == 1 )System.out.println("Средний эелемент : " + list.get(i));
                else System.out.println("Средние эелементы : " + list.get(i-1) + " и " + list.get(i));
                break;
            }
            j+=2;
        }

        Scanner sc = new Scanner(System.in);
        int num;
        LOOP: while (true) {
            System.out.println("Введите порядковый номер числа, с помощью которого будет искаться число с конца: ");
                while(sc.hasNext()) {
                    num = sc.nextInt();
                    if (num < list.size()) {
                        break LOOP;
                    } else {
                        System.out.println("Число превышает кол-во жлементов в листе.");
                        continue ;
                    }
                }
        }

    }
}
