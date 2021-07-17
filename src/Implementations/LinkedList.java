package Implementations;
	
import java.util.List;
	
public class LinkedList<T> {
		
	Node<T> head;
	public Object deleteAt;
	int size = 0;
		
	public class Node<T> {
		T data;
		Node<T> next;
	}
		
	public void add( T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		
		if(head == null)
			head = newNode;
		else {
			Node<T> current = head;
			while(current.next != null) {
				current = current.next;
	
			}
			current.next = newNode;
			size++;
	
		}
	}
	public void addAtStart(T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
	
		newNode.next = head;
		head = newNode;
		size++;
	}
	public void addAt(int index , T data) {
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		if(index == 0 ) {
			newNode.next = head;
			head = newNode;
		}else {
			Node<T> currentNode = head;
			Node<T> previousNode = head;
			
			for (int i= 0 ; i < index; i++) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = newNode;
			newNode.next = currentNode;
		}
		size++;
	}
		 
	public T get(int index) {
		if(index == 0 ) {
			return head.data;
		}
		else {
			Node<T> currentNode = head;
			for (int i = 0; i < index; i++) {
				if (currentNode.next != null) {
					currentNode = currentNode.next;
				} else {
					return null;
				}
			}
			return currentNode.data;
		}
	}
	public void deleteAtStart() {
		head = head.next;
		size--;
	}
	public void deleteAt(int index) {
		if (index == 0) {
			head = head.next;
		} else {
			Node<T> currentNode = head;
			Node<T> previousNode = null;
			for (int i = 0; i < index; i++) {
				previousNode = currentNode;
				currentNode = currentNode.next;
			}
			previousNode.next = currentNode.next;
			currentNode = null;
		}
		size--;
	}
	public void deleteAtEnd() {
		if (!isEmpty()) {
			Node<T> currentNode = head;
			while (currentNode.next != null) {
				currentNode = currentNode.next;
			}
			size--;
		} else {
			System.out.println("List is empty");
		}
	}
	public int searchNode(T data,int size) {
		boolean isFound = false;
		int counter = -1;
		Node<T> currentNode = head;
		while(currentNode.next != null) {
			counter++;
			if(currentNode.data.equals(data)) {
				isFound = true;
			}
			currentNode = currentNode.next;
		}
		if (isFound) {
		            System.out.println("\nData Found and deleting ...");
		            deleteAt(counter);
		            size--;
		        } else if (currentNode.data.equals(data)) {
		            System.out.println("\nData found at last node and deleting....");
		            size--;
		        } else {
		            System.out.println("Data not found and therefore inserting...");
		            add(data);
		            size++;
		        }
		        return size;
		    }
		  
	public <T extends Comparable<T>> void sortList(int size) {
	
		Node<T> currentNode = (Node<T>) head;
		Node<T> nextNode = currentNode.next;
	
		for (int i = 0; i < size - 1; i++) {
	
			for (int j = 0; j < size - 1 - i ; j++) {
				
				if (currentNode.data.compareTo(nextNode.data) > 0) {
					T tempNode = currentNode.data;
					currentNode.data = nextNode.data;
					nextNode.data = tempNode;
				}
				
				nextNode = nextNode.next;
	
			}
			currentNode = currentNode.next;
		            nextNode = currentNode.next;
		}
	}
		  
	public String printList() {
		String str = "";
		Node<T> currentNode = head;
	
		if(head == null)
			return "Empty List";
		else {
			while (currentNode.next != null) {
				str += currentNode.data + ",";
				currentNode = currentNode.next;
			}
			str += currentNode.data;
			//System.out.println(str);
		}
		return str;
	}
		  
	public String returnList() {
	
		String str = "";
		Node<T> currentNode = head;
	
		while (currentNode.next != null) {
	
			str += currentNode.data + " ";
			currentNode = currentNode.next;
	
		}
	
		str = str + currentNode.data;
		return str;
	
	}
	
		  
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public int getSize() {
		return size;
	}
	
	public void addAll(List<T> list){
		for(int i = 0; i < list.size(); i++){
		        	add(list.get(i));
		        }
		    }
}
	
	