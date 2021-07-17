package com.bridgelab.program;

import java.util.Scanner;

public class BinarySearchWord {
	static Scanner sc = new Scanner(System.in);
 
	public static int binarySearchList(String[] words , String key) {
		int min = 0 ;
		int max = words.length - 1 ;
		
		while(min <= max) {
			int mid = min + (max - 1) / 2;
			if (key.compareTo(words[mid]) == 0) {
				return mid;
			}else if (key.compareTo(words[mid])  > 0 ){
				min = mid + 1;
			}else 
			{
				max = mid - 1 ;
			}
		}
		return -1 ;
		
	}
	
	public static void main(String [] args) {
		String[] words = { "AAA", "BBB", "CCC", "DDD", "EEE", "FFF", "GGG" };
		System.out.println("enter the word which you want search");
		String key= sc.next();	       
		int result = binarySearchList(words,key ); 
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at "
					+ "index " + result);
			
	}

}
