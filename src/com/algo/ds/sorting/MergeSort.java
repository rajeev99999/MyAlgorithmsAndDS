package com.algo.ds.sorting;


// stable sorting algorithm
/*
Merge Sort is a Divide and Conquer algorithm. It divides the input array in two halves, calls itself for the two halves and then merges the two sorted halves. The merge() function is used for merging two halves. The merge(arr, l, m, r) is key process that assumes that arr[l..m] and arr[m+1..r]
 are sorted and merges the two sorted sub-arrays into one in a sorted manner. See following implementation for details:
 */
public class MergeSort {

    static void merge(int [] arr ,int l,int mid,int r){
        int n1= mid-l+1;   // setting the left array and right array hich have to merged eventually
        int n2= r-mid;
        int left[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l+i];  // copy the left half of array elements
        }
        int right[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid+1+i]; //copy the right half of array elements
        }
        int i=0,j=0,k=l; //merge by comparision
        while(i<n1 && j<n2){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
                k++;
            }
            else{
                arr[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<n1){
            arr[k]=left[i];
            k++;
            i++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }

    static void mergeSort(int[] arr,int l,int r){

        if(r>l){ // ensures that it applied on array with more than one element
            int mid = l + (r-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,r);
            merge(arr,l,mid,r);
        }
    }

    public static void main(String[] args){
        int array[]={10,50,4,1,27};
        mergeSort(array,0, array.length-1);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
