package com.bridgelab.program;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {
	
	public static void main(String[] args) {
		AnagramDetection anagram = new AnagramDetection();
		Scanner sc = new Scanner(System.in);
		char str1[];
		char str2[]; 
		System.out.println("Enter the two string  to be compare");
		System.out.println("String1");
		str1 = sc.next().toCharArray();
		System.out.println("String2");
		str2 = sc.next().toCharArray();
		//check
		if(areAnagram(str1,str2)) {
			System.out.println("Both the string are " + " Anagaram of each other ");
			
		}
		else {
			System.out.println("Both the string are not " + " Anagaram of each other ");
		}
		
		
	}

	public static boolean areAnagram(char[] str1, char[] str2) {
	//Get length
		
		int l1 = str1.length;
		int l2 = str2.length;
		
	// if length of both is same then cannot be anagram
		if(l1 != l2)
			return false;
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		
		//compare
		
		for(int i = 0 ; i < l1 ; i++) {
			if(str1[i] != str2[i]) {
				return false;
			}
		}
				
		return true;
	}

}
