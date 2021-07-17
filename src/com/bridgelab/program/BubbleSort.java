
/***************************************************************************************************************
 * @author Kuldeep Pandey 
 * @Since 16-06-2021
 *
 ***************************************************************************************************************/

package com.bridgelab.program;

import java.util.Scanner;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		Integer size = sc.nextInt();
		Integer arr[] = new Integer[size];
		System.out.println("Enter " + size + " integer in the array");
		for(int i = 0 ; i < size ; i++){
			arr[i] = sc.nextInt();		
		}
		
		
		BubbleSortImplement<Integer> bs = new BubbleSortImplement<Integer>(arr);	
		Integer [] sortedArray = bs.bubbleSort();
		System.out.println("Array after sort");
		for(int i = 0 ; i < size ; i++) {
			System.out.println(arr[i] + " ");
		}
		
	}
}
class BubbleSortImplement <T extends Comparable<T>> {
	
	T[] arr;
	
	public  BubbleSortImplement(T[] arr) {
		this.arr = arr;	
	}
	

public T[] bubbleSort() {
	int n  = arr.length;
	for (int i = 0 ; i < n-1 ; i++){
		
		for (int j = 0;  j < n-1-i ; j ++ ) {
			if(arr[j+1].compareTo(arr[j]) > 0  ) {                               //check if right element is less than left element 
				T temp = arr[j+1] ;
				arr[j+1] = arr[j];
				arr[j]  =  temp;
			}
		}
						
	}
	return arr ; 
}


}
