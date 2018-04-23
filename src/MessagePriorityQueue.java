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
	
	public boolean isEmpty() {
		if(!priorityQueue.get(4).isEmpty() && !priorityQueue.get(3).isEmpty() && !priorityQueue.get(2).isEmpty() && !priorityQueue.get(1).isEmpty() && !priorityQueue.get(0).isEmpty()) {
			return true;
		}
		return false;
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
		Message m41 = new Message(4, "Four 1");
		Message m42 = new Message(4, "Four 2");
		Message m43 = new Message(4, "Four 3");
		Message m44 = new Message(4, "Four 4");
		
		Message m31 = new Message(3, "Third 1");
		Message m32 = new Message(3, "Third 2");
		Message m33 = new Message(3, "Third 3");
		Message m34 = new Message(3, "Third 4");
		
		Message m21 = new Message(2, "Second 1");
		Message m22 = new Message(2, "Second 2");
		Message m23 = new Message(2, "Second 3");
		Message m24 = new Message(2, "Second 4");
		
		Message m11 = new Message(1, "First 1");
		Message m12 = new Message(1, "First 2");
		Message m13 = new Message(1, "First 3");
		Message m14 = new Message(1, "First 4");
		
		Message m01 = new Message(0, "Zero 1");
		Message m02 = new Message(0, "Zero 2");
		Message m03 = new Message(0, "Zero 3");
		Message m04 = new Message(0, "Zero 4");
		
		q.add(m41);
		q.add(m42);
		q.add(m43);
		q.add(m44);
		q.add(m34);
		q.add(m33);
		q.add(m32);
		q.add(m31);
		q.add(m24);
		q.add(m23);
		q.add(m22);
		q.add(m21);
		q.add(m14);
		q.add(m13);
		q.add(m12);
		q.add(m11);
		q.add(m04);
		q.add(m03);
		q.add(m02);
		q.add(m01);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		
		System.out.println(m41.getArrivalTime());
		System.out.println(m32.getArrivalTime());
		System.out.println(m23.getArrivalTime());
		System.out.println(m14.getArrivalTime());
		System.out.println(m02.getArrivalTime());
		
		System.out.println(q.arrivalTime);
	}
	
	
}
