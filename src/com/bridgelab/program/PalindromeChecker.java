package com.bridgelab.program;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Implementations.DequeueImplementationUsingLinkedList<Character> dequeue = new Implementations.DequeueImplementationUsingLinkedList<Character>();
   
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = scanner.next();
        String reverseFront = "";
        String reverseRear = "";

        // inserting element in dequeue
        for (int i = 0; i < str.length(); i++) {
            dequeue.insertAtFront(str.charAt(i));
        }

        // removing elements from rear and getting rear values
        for (int i = 0; i < str.length(); i++) {
            reverseRear += dequeue.getRear();
            dequeue.deleteFromRear();
        }

        // inserting element in dequeue again
        for (int i = 0; i < str.length(); i++) {
            dequeue.insertAtFront(str.charAt(i));
        }

        // removing elements from front and getting front values
        for (int i = 0; i < str.length(); i++) {
            reverseFront += dequeue.getFront();
            dequeue.deleteFromFront();
        }

        if(reverseRear.equals(reverseFront)){
            System.out.println("String is Palindrome");
        } else {
            System.out.println("String is not a Palindrome");
        }

    }
}