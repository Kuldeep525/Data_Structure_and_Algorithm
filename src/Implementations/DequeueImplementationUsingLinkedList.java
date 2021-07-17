package Implementations;

public class DequeueImplementationUsingLinkedList<T> {
	
LinkedList<T> dequeue = new LinkedList<T>();
	
	int size = 0 ; 
	
	public void insertAtFront(T data) {
		dequeue.addAtStart(data);
		size++;
	}
	 public void insertAtRear(T data){
	        dequeue.add(data);
	        size++;
	    }

	    /**
	     * Purpose : Deleting data from front
	     */
	    public void deleteFromFront(){
	        dequeue.deleteAtStart();
	        size--;
	    }

	    public void deleteFromRear(){
	        dequeue.deleteAtEnd();
	        size--;
	    }

	    public T getFront(){
	        return dequeue.get(--size);
	    }

	  
	    public T getRear(){
	        return dequeue.get(size-1);
	    }
}


