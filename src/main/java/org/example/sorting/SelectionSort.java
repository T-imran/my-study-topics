package org.example.sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {13, 46, 24, 52, 20, 9};
        int n = array.length;

        for(int i = 0; i<n; i++){
            int minimum = i;
            for (int j = i+1; j<n ; j++){
                if(array[j] < array[minimum]){
                    minimum = j;
                }
            }

            //swap
            int temp = array[minimum];
            array[minimum] = array[i];
            array[i] = temp;
        }

        System.out.println(Arrays.toString(array));
    }

}
