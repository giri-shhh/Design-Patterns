package com.design.patterns.strategy;

public class StrategyPatternMain {
    private SortingAlgorithm sortingAlgorithm;

    public StrategyPatternMain(SortingAlgorithm sortingAlgorithm) {
        this.sortingAlgorithm = sortingAlgorithm;
    }

    public SortingAlgorithm getSortingAlgorithm() {
        return sortingAlgorithm;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 6, 3, 2, 4};
        StrategyPatternMain main = new StrategyPatternMain(new BubbleSort());

        main.getSortingAlgorithm().sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }

        main = new StrategyPatternMain(new QuickSort());

        main.getSortingAlgorithm().sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}