package com.algo.ds.sorting;


//stable and inplace algorithm
//used in practice (Tim sort(merge sort+ insertion sort) and INTRO Sort(quick sort+insertion sort). for small sized arrays insertion is used popularly
//best case- theta(n) when array is sorted
//worst case- theta(n^2) when array is reverse sorted
public class InsertionSort {
    static void insertionSort(int[] arr){
        int n= arr.length;
        for(int i=1;i<n;i++){ //expand the sorted part by beginning the first element is already sorted
            int key= arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){ //as long as the current element is greater than the key element keep on moving ahead / rotate right
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key; // found the position for the key to be placed
                        // expand  the sorted part by inserting the key and at right position
        }
    }

    public static void main(String[] args){
        int array[]={10,50,4,1,27};
        insertionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
