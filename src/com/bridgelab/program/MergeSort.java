
/***************************************************************************************************************
 * @author Kuldeep Pandey 
 * @Since 16-06-2021
 *
 ***************************************************************************************************************/


package com.bridgelab.program;

import java.util.Scanner;

public class MergeSort {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int  size = sc.nextInt();
		Integer arr[] = new Integer[size];
		System.out.println("Enter " + size + " integer in the array");
		for(int i = 0 ; i < size ; i++){
			arr[i] = sc.nextInt();		
		}
		int lowerBound =  0 ;
		int upperBound = size - 1; 
		 MergeSortImplement<Integer> genericMerge = new  MergeSortImplement<Integer>(arr);
		 genericMerge.sort(arr, lowerBound, upperBound);
		 System.out.println("Sorted array is ");
		 for(int i =0 ; i < size;i++) {
			 System.out.println(arr[i] + " ");
		 }
	}
	

}

class MergeSortImplement <T extends Comparable <T>> {
	T[] arr ;
	
	public MergeSortImplement(T[] arr) {
		this.arr = arr;
	}
	
	public void sort(T[] arr , int lowerBound ,  int upperBound) {
		int mid ;
		if(lowerBound < upperBound) {
			//find the middle element
			mid = (lowerBound + upperBound) / 2 ; 
			sort(arr,lowerBound , mid);
			sort(arr , mid + 1 , upperBound);
			
			mergeSort(arr , lowerBound , mid  , upperBound);
			
		}
	}
	
	public void mergeSort(T arr[] , int lowerBound , int  mid , int upperBound) {
		   // Find sizes of two subarrays to be merged
		int a1  = mid - lowerBound + 1;
		int a2 = upperBound - mid ;
		       // temp array
		T[] leftArray = (T[]) new Comparable[a1];
		T[] rightArray = (T[]) new Comparable[a2];
		 // copying data to temp 
		for (int i = 0 ; i < a1 ; i++) 
			leftArray[i]  = arr[lowerBound + i];
		for (int j = 0 ; j < a2 ; j++) 
			rightArray[j]  = arr[mid + 1 + j];
		
		// merge the temp aarays 
		
		int i = 0 , j= 0;                   //initital index of both array 0
		int k = lowerBound ; 
		
		while(i < a1 && j < a2) {
			if(leftArray[i].compareTo(rightArray[j]) < 0) {
				arr[k] = leftArray[i];
				i++;
				
			}else {
				
				arr[k] = rightArray[j];
				j++;
				
			}
			k++;
		}
		
		while(i < a1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while (j< a2) {
			arr[k] = rightArray[j];
			j++;
			k++;
			
		}
		
		
	}
}
