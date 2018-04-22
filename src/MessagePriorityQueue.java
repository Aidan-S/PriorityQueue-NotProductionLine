import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//
public class MessagePriorityQueue{

	private ArrayList<Queue> priorityQueue;
	private int arrivalTime;
	
	public MessagePriorityQueue() {
		priorityQueue = new ArrayList<Queue>(5);
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		arrivalTime = 0;	
	}
	
	public void add(Message m) {
		int s = m.getPriority();
		arrivalTime++;
		m.setArrival(arrivalTime);
		
		switch (s) {
		case 0:  priorityQueue.get(0).add(m);
        	  	 break;
		case 1:  priorityQueue.get(1).add(m);
                 break;
        case 2:  priorityQueue.get(2).add(m);
                 break;
        case 3:  priorityQueue.get(3).add(m);
                 break;
        default: priorityQueue.get(4).add(m);
                 break;
  
		}
	}
	
	public Message remove() {
		int i = -1;
		if(!priorityQueue.get(4).isEmpty()) {
			i = 4;
		}
		if(!priorityQueue.get(3).isEmpty()) {
			i = 3;
		}
		if(!priorityQueue.get(2).isEmpty()) {
			i = 2;
		}
		if(!priorityQueue.get(1).isEmpty()) {
			i = 1;
		}
		if(!priorityQueue.get(0).isEmpty()) {
			i = 0;
		}
		
		switch (i) {
        case 0: arrivalTime += 4;
        		return (Message) priorityQueue.get(0).remove(); 
        case 1: arrivalTime += 4; 
        		return (Message) priorityQueue.get(1).remove();
        case 2: arrivalTime += 4; 
        		return (Message) priorityQueue.get(2).remove();
        case 3: arrivalTime += 4; 
        		return (Message) priorityQueue.get(3).remove();
        case 4: arrivalTime += 4; 
        		return (Message) priorityQueue.get(4).remove();
        default: System.out.println("All messages processed");
        		 return null;	
	
		}
	}
	
	
	public static void main (String[] args) {
		MessagePriorityQueue q = new MessagePriorityQueue();
		Message m4 = new Message(4, "Four");
		Message m3 = new Message(3, "Third");
		Message m2 = new Message(2, "Second");
		Message m1 = new Message(1, "First");
		
		q.add(m2);
		q.add(m1);
		q.add(m4);
		q.add(m3);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println(m1.getPriority());
		System.out.println(m2.getPriority());
		System.out.println(m3.getPriority());
		System.out.println(m4.getPriority());
		
		System.out.println(q.arrivalTime);
	}
	
	
}
