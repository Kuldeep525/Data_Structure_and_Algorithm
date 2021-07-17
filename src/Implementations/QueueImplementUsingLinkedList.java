package Implementations;



import java.util.List;
import java.util.Scanner;

public class QueueImplementUsingLinkedList<T> {
	LinkedList<T> queue = new LinkedList<T>();
	
	int index = 0 ; 
	public int bankBalance = 20000;
	Scanner scanner = new Scanner(System.in);
			int counter = 1;
	
	public int size() {
		return index;
	}
	
	public void enqueue(T data) {
	queue.add(data);
	index++;
}
	public void enqueueAll(List<T> list) {
		for(int i = 0 ; i < list.size();i++) {
			enqueue(list.get(i));
		}
	}
	
	 public void dequeue(){
	        index--;
	        queue.deleteAt(index);
	    }
	 
	public void printQueue(){
		queue.printList();
	}
	
	public  boolean isEmpty() {
		return queue.isEmpty();
		
	}
	
	public T get() {
		return queue.get(index);
	}
	
	 public void bankService(){
	        System.out.println("Token number is : "+counter);

	        int amount = 0;
	        System.out.println("\nPress 1 to withdraw cash\nPress 2 to deposit cash");
	        int choice = scanner.nextInt();

	        switch (choice){
	            case 1:
	                System.out.println("Enter the amount to withdraw from account : ");
	                amount = scanner.nextInt();
	                bankBalance = bankBalance - amount;
	                System.out.println("Thank You for using service");
	                amount = 0;
	                break;
	            case 2:
	                System.out.println("Enter the amount to deposit in account");
	                amount = scanner.nextInt();
	                bankBalance = bankBalance + amount;
	                System.out.println("Thank You for using service");
	                amount = 0;
	                break;
	            default:
	                System.out.println("Enter Valid Option");
	                break;
	        }
	        counter++;
	 }

	public String get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
	
	

