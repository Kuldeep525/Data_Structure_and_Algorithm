package com.bridgelab.program;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
	static PrimeNumber primeNo  =  new PrimeNumber();
	static AnagramDetection anagram = new AnagramDetection();

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in); 
		int startRange , endRange ;
		System.out.println("Enter the Start and End number  ");
		startRange = sc.nextInt();
		endRange = sc.nextInt();
		ArrayList<Integer> list = primeNo.primeNumber(startRange,endRange);
		System.out.println(list);
		primeNo.isAnagramAndPalidrome(startRange , endRange);
		
		
		
	}
	
	public ArrayList<Integer> primeNumber(int startRange , int endRange){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = startRange ; i <= endRange ; i++) {
			if(primeNo.isPrime(i)) {
				 list.add(i);
		}
	}
		return list;

	}
	public void isAnagramAndPalidrome(int startRange , int endRange) {
		for(int i = startRange ; i < endRange; i++) {
			if(primeNo.isPrime(i)) {
				for (int j = i ; j < endRange ; j++) {
					if(i != j) {
						if(isPrime(j)) {
							if (AnagramDetection.areAnagram(String.valueOf(i).toCharArray(), String.valueOf(j).toCharArray()) && primeNo.isPalindrome(i)) {
                                System.out.println(i + " " + j + " are prime numbers and anagrams and palindrome");
							}
							
						}
						
					}
				}
			}
		}
		
	}
	public boolean isPalindrome(int number){
		int reverse,sum = 0;
		int temp = number;
		while(number != 0)
		{
			reverse = number % 10;
			sum = sum * 10 + reverse;
			number /= 10;
		}
		if(temp == sum)
			return true;
		return false;
	}
	
	public boolean isPrime(int i ) {
		if (i <= 1) 
			return false;
		for (int j =2 ; j < i ; j++) {
			if(i % j == 0 ) 
				return false;	
		}
		return true;
		
	}
}
