package com.bridgelab.program;

import java.util.Scanner;

public class BankCashCounter {
	
	public static void main(String[] args) {
		
		
		System.out.println("Welcome to bank");
		 Implementations.QueueImplementUsingLinkedList<Integer>  queue = new  Implementations.QueueImplementUsingLinkedList<Integer>();
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("\n Enter the people count in queue :");
		 int peopleCount = scanner.nextInt();
		 for(int i = 0 ; i < peopleCount; i++) {
			 
			 queue.enqueue(i);
			 queue.bankService();
			 queue.dequeue();
			 
		 }
		 if(queue.isEmpty()) {
			 System.out.println("Queue is Empty ");
		 }
		 
		 System.out.println("\n Bank Closing is : " + queue.bankBalance);
		 scanner.close();
	}

}
