package com.algo.ds.searching;

/*Given an integer array and another integer element. The task is to find if the given element is present in array or not.

        Example 1: FIND THE NUMBER IF MATCHED IN O(logn) time complexity

        Input:
        n = 4
        arr[] = {1,2,3,4}
        x = 3
        Output: 2
        Explanation: There is one test case
        with array as {1, 2, 3 4} and element
        to be searched as 3.  Since 3 is
        present at index 2, output is 2.
        Example 2:

        Input:
        n = 5
        arr[] = {1,2,3,4,5}
        x = 5
        Output: 4
        Explanation: For array elements
        {1,2,3,4,5} element to be searched
        is 5 and it is at index 4. So, the
        output is 4.*/

import java.util.Arrays;

public class BinarySearch {
    static int binarySearchIterative(int arr[],int X){
        int low= 0;
        int high = arr.length-1;
        Arrays.sort(arr);

        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == X){
                return mid;
            }
            else if( arr[mid]<X){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }

    static int binarySearchRecursive(int [] arr, int X){
        int low =0;
        int high = arr.length - 1;
        int result = binarySearchRecursiveHelper(arr,low,high,X);
        return result;
    }

    static int binarySearchRecursiveHelper(int [] arr ,int low , int high, int X){
        if (low > high)
            return -1;
        int mid = low + (high-low)/2;

        if (arr[mid]==X){
            return mid;
        }

        else if(arr[mid] > X){
            return binarySearchRecursiveHelper(arr,mid+1,high,X);
        }
        else{
           return binarySearchRecursiveHelper(arr,0,mid-1,X);
        }
    }
}
