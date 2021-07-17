package com.bridgelab.program;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import Implementations.FileOperations;
import Implementations.LinkedList;

public class unOrderList{
public static void main(String[] args) throws FileNotFoundException {

    String filepath = "C:\\Users\\JAI AMBEE\\Desktop\\eclipse\\DataStructure and Algorithm\\src\\com\\bridgelab\\Utility\\text";
    LinkedList<String> list = new LinkedList<String>();
    String[] stringArray = null;
    try {
        stringArray = FileOperations.readFile(filepath).split(",");
    } catch (IOException e) {
        e.printStackTrace();
    }
    int size = stringArray.length;

    // reading from file and storing in unordered linked list
    for(int i = 0; i < stringArray.length; i++){
        list.add(stringArray[i]);
    }
    System.out.println(list.printList());

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the word you want to search : ");
    String word = sc.next();

    size = list.searchNode(word,size);
    System.out.println(list.printList());

    System.out.println("\nSize of Linked List : "+size);
    try {
        FileOperations.writeFile(filepath,list.returnList());
    } catch (IOException e) {
        e.printStackTrace();
    }
    sc.close();
}

}