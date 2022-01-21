package com.codegym;

import static com.codegym.SelectionSort.list;
import static com.codegym.SelectionSort.selectionSort;

public class Main {

    public static void main(String[] args) {
        selectionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
