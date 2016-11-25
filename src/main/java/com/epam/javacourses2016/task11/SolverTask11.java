package com.epam.javacourses2016.task11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * В кругу стоят N человек.
 * На каждой итерации цикла выбывает человек (через одного, начиная с первого), пока не останется единственный.
 * Разработать два решения, моделирующие процесс.
 * Первое должно использовать класс ArrayList, а второе – LinkedList.
 */
public class SolverTask11 {

    /**
     * Выполняет эмуляцию поставленной задачи.
     *
     * @param peoples Список с именами участников.
     * @return Имя последнего оставшегося.
     */
    public String emulate(ArrayList<String> peoples) {

        int index = 0;
        while (peoples.size() > 1) {
            index += 1;
            if (index >= peoples.size()) {
                index = index % 2;
            }
            peoples.remove(index);
        }

        return peoples.get(0);
    }

    /**
     * Выполняет эмуляцию поставленной задачи.
     *
     * @param peoples Список с именами участников.
     * @return Имя последнего оставшегося.
     */
    public String emulate(LinkedList<String> peoples) {
        int index = 0;
        int size = 0;

        while (peoples.size() > 1) {
            Iterator iterator = peoples.iterator();
            iterator.next();
            if (index == 1) {
                iterator.next();
            }
            index += 1;

            if (index >= peoples.size()) {
                index = index % 2;
            }

            iterator.remove();
        }
        return peoples.get(0);

    }
}
