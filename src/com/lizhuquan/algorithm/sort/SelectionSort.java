package com.lizhuquan.algorithm.sort;

/**
 * 选择排序: O(n^2), 都需要两层循环，比较慢
 * Created by lizhuquan on 2018/5/16.
 */
public class SelectionSort implements Sort{

    @Override
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                int currMin = arr[minIndex];
                int currVal = arr[j];
                if (currVal < currMin) {
                    minIndex = j;
                }
            }
            SortUtil.swap(arr, i, minIndex);
        }

        return arr;
    }

    public static void main(String[] args) {
        SortUtil.sortAndPrint(SortUtil.generaRandomArray(100, 1, 100000), new SelectionSort(),  5);
    }
}
