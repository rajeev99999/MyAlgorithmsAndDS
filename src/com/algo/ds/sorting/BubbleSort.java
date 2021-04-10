package com.algo.ds.sorting;

// it is a stable sorting algorithm-- the order of elements if same are not messed up
//it is in place sort - existing array itself is modified no need for extra space
public class BubbleSort {

    static void swap(int x,int y){
        int temp=0;
        temp = x;
        x=y;
        y=temp;
    }

    static void bubbleSort(int[] arr){
        int n= arr.length;

        for (int i=0;i<n-1;i++){ // in n-1 passes the n-1 elements are sorted to the right positions and no sorting is needed  for the left over last element
            for(int j=0;j<n-1;j++){ // compare and swap adjacent elements if not in order
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
    }

    static void  bubbleSortBetterOptimised(int [] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) { //n-1 passes
            for(int j=0;j<n-i-1;j++){ // for each pass say pass-2 2 elements are already at their desired position towards end here in this case so no need to go over them
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                }
            }
        }
    }

   // in casee the array is sorted then no need to go over all the passes
    static void bubbleSortBestOptimised(int[] arr){
        int n = arr.length;
        boolean flagSwapped=false;
        for (int i = 0; i < n-1; i++) {
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr[j],arr[j+1]);
                    flagSwapped=true;
                }
            }
            if(flagSwapped == false){ // already sorted (it can between some pass the array might be sorted)
                break;
            }
        }
    }

}
