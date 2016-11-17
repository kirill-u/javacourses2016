package com.epam.javacourses2016.task4;

import java.util.HashSet;
import java.util.Set;

/**
 * Интерфейс для юнит-тестирования задания №4.
 * Определить множество на основе множества целых чисел.
 * Создать методы для определения пересечения и объединения множеств.
 * Запрещена модификация исходных множеств.
 */
public class SolverTask4 {

    /**
     * Операция пересечения целочисленных множеств.
     * @param first Первое множество.
     * @param second Второе множество.
     * @return Результат пересечения множеств.
     */
    public Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        //TODO
        Set<Integer> firstSet = new HashSet<>();
        firstSet.addAll(first);
        Set<Integer> secondSet = new HashSet<>();
        secondSet.addAll(second);
        firstSet.retainAll(secondSet);
        return firstSet;
    }

    /**
     * Операция объединения целочисленных множеств.
     * @param first Первое множество.
     * @param second Второе множество.
     * @return Результат объединения множеств.
     */
    public Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        //TODO
        Set<Integer> firstSet = new HashSet<>();
        firstSet.addAll(first);
        Set<Integer> secondSet = new HashSet<>();
        secondSet.addAll(second);
        firstSet.addAll(second);
        return firstSet;
    }
}
