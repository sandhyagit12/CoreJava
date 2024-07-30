package Practice;

import java.net.StandardSocketOptions;
import java.util.Arrays;
import java.util.HashMap;

public class Arrayspractce {
    public static void main(String[] args) {
        //arrays - datastructure that can store variables of same data type
        //stored in stack memory
        //contiguous memory allocation
        int arrA[];
        int arrB[] ={150,20,30,80};
        int arr[]=new int[4];
        String namelist[]= new String[2];
        String namelistB[] ={"arjun","bheem","yudisht","nakul","sahadev"};
        String str1 ="abc";
        String str2 ="xyz";
        //stack memory- primitive datatypes,functions,variables
        //Heap Memory-reference variables,objects,arrays
        System.out.println(arrB[0]);
        System.out.println(arrB[1]);//continuously stored at 0 and 1
        //arrays-IndexOutOfBoundException - raised when accessed out of array size
        //one dimension arrays 2) multidimensional arrays
        int[][] int_array = new int[1][1];
        System.out.println("array length is "+namelistB.length);
        Arrays.sort(arrB);// to sort the arrays

        //traverse through arrays - for loop, for each,while loop
        for(int i:arrB){  //for(int i=0;i<arrB.length;i++)
            //for(int ele:arrB)- for each loop
            System.out.println(+i);
        }

//Arrays.equals(arrA,arrB);->checks the array length and the values , return boolean true /false
        //binary search returns the index of the value in the array
        System.out.println(Arrays.binarySearch(arrB,20));
        //search an element in the array
        //find duplicate element in the array
        //Hashmap - similar to a dictionary
        //it has a key and a value



    }
}
