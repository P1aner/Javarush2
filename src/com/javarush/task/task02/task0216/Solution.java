package com.javarush.task.task02.task0216;

/*
Минимум трёх чисел
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //напишите тут ваш код

        if (a < b)
            if (a < c) {
                return a;
            } else {
                return c;
            }
        else if (b < c) {
            return b;
        } else {
            return c;
        }

    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}

/*Написать функцию, которая вычисляет минимум из трёх чисел.

Подсказка:
Нужно написать тело существующей функции min.*/




























