

package com.bridgelab.program;

import java.util.Scanner;

public class InsertionSort {
	
	public static void main(String[] args) {
		 InsertionSort insert = new  InsertionSort();
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Enter the size of String array");
		 int  size = scanner.nextInt();
		 String str[] = new String[size];
		 System.out.println("Enter " + size + "String in the array");
		 for(int i = 0 ; i < size ; i++){
				str[i] = scanner.next();		
		 }
		 System.out.println("String in array are ::");
		for (int i= 0 ; i<size; i++) {
			System.out.println(str[i]+ " ");		
		}
	
		//Creating an object of genrics class 
		InsertionSortImplement<String> genricsInsert = new InsertionSortImplement<String>(str);
		String[] sortedString = genricsInsert.insertionSort();
		System.out.println("String in array are Sorted ");
		for (int i= 0 ; i<size; i++) {
			System.out.println(sortedString[i]+ " ");		
		}

	}
	
}

class InsertionSortImplement<T extends Comparable<T>>{
	
	T[] words ;
	public InsertionSortImplement(T[] words) {
		this.words = words;
	}
	  
	public T[]  insertionSort() {	
		int size = words.length;
		for (int i=1; i<size ; i++ ) {
			T temp = words[i];
			int j = i-1;
			while (j >= 0 &&  words[j].compareTo(temp) > 0) {
				words[j+1] = words[j];
				j--;
			}
			words[j+1] = temp;
				
		}
		return words;
	}
}
