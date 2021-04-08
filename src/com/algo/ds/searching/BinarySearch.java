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

/*
* Arrays.binarySearch() is the simplest and most efficient method to find an element in a sorted array in Java
* public static int binarySearch(data_type arr, data_type key )
* array can be byte int char float double
*
**/

/*
The Collections.binarySearch() method is a Collections class method in Java that returns position of an object in a sorted list.

 ----Returns index of key in sorted list sorted in
 -----ascending order
public static int binarySearch(List slist, T key)

 ----Returns index of key in sorted list sorted in
-----order defined by Comparator c.
public static int binarySearch(List slist, T key, Comparator c)

If key is not present, the it returns "(-(insertion point) - 1)".
The insertion point is defined as the point at which the key
would be inserted into the list.

The method throws ClassCastException if elements of list are not comparable using the specified comparator, or the search key is not comparable with the elements.

    public static void main(String[] args)
    {
        List al = new ArrayList();
        al.add(100);
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(2);

        // The last parameter specifies the comparator method
        // used for sorting.
        int index = Collections.binarySearch(al, 50,
                                  Collections.reverseOrder());

        System.out.println("Found at index " + index);
    }

 */


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
        Arrays.sort(arr);
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
