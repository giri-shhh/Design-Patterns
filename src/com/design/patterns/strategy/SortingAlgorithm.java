package com.design.patterns.strategy;

@FunctionalInterface
public interface SortingAlgorithm {
    void sort(int[] arr);
}