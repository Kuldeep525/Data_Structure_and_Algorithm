package com.bridgelab.program;

import java.io.IOException;

import java.util.Scanner;

import Implementations.FileOperations;
import Implementations.LinkedList;

public class OrderdList {
	public static void main(String [] args) {
		 LinkedList<Integer> list = new LinkedList<Integer>();
	        String filePath = "C:\\Users\\JAI AMBEE\\Desktop\\eclipse\\DataStructure and Algorithm\\src\\com\\bridgelab\\Utility\\test2";
	        String[] stringArray = null;
	        try {
	            stringArray = FileOperations.readFile(filePath).split(",");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        int size = stringArray.length;
	        int[] integerArray = new int[stringArray.length];
	        for(int i = 0; i < stringArray.length; i++){
	            integerArray[i] = Integer.parseInt(stringArray[i]);
	            list.add(integerArray[i]);
	        }
	        System.out.println("List before Sorting : ");
	        System.out.println(list.printList());

	        System.out.println("Sorting...");
	        list.sortList(size);
	        System.out.println(list.printList());


	        Scanner scanner = new Scanner(System.in);
	        System.out.println("\nEnter the number you want to search in list : ");
	        int number = scanner.nextInt();
	        size = list.searchNode(number,size);
	        scanner.close();

	        System.out.println("\nSorting...");
	        list.sortList(size);

	        String str = list.returnList();
	        try {
	            FileOperations.writeFile(filePath,str);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        System.out.println(list.printList());
	        System.out.println("Size of list is : "+size);
	    }
	}