package com.algo.ds.sorting;

// not a stable sorting algo but it is in place
// theta n squre time complexity all the time irrespective array is sorted either ways.
public class SelectionSort {
    static void selectionSort(int[] arr){
        int n= arr.length;
        for (int i=0;i<n-1;i++){ // need not go over last element as already only one is left
            int min_index=i;
            for(int j=i+1;j<n;j++){  //i elements are already sorted here
                if(arr[j]<arr[min_index]){
                    min_index=j; //found the min element
                }
            }
            int temp=arr[i]; // swap the smallest element in that iteration
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    public static void main(String[] args){
        int array[]={10,50,4,1,27};
        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

}
