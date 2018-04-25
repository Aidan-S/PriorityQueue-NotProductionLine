import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//
public class MessagePriorityQueue{

	private ArrayList<Queue> priorityQueue;
	private int time;
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: constructor that creates the priorityQueue by filling it with the 5 different priority queues
	 */
	public MessagePriorityQueue() {
		priorityQueue = new ArrayList<Queue>(5);
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		priorityQueue.add(new LinkedList<Message>());
		time = 0;	
	}
	
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: add a message to the priority queue based on its priority feild
	 * @param m: the message that is being added
	 */
	public void add(Message m) {
		int s = m.getPriority();
		time++;
		m.setArrival(time);
		
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
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: remove the highest priority queue from the priorityQueue
	 * @return: the message that was removed
	 */
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
		
		Message m;
		
		if(i != -1) {
			time += 4;
        	m = (Message) priorityQueue.get(i).remove();
       		m.setDeparture(time);
       		return m; 
		}else{
			System.out.println("All messages processed");
        	return null;
		}		 
		
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: main method that tests the message and MessagePriorityQueue classes
	 * @param args: string array of arguments
	 */
	public static void main (String[] args) {
		
		//------------------------------Simple Test------------------------
		System.out.println("---Simple test---");
		MessagePriorityQueue q = new MessagePriorityQueue();
		
		Message m4 = new Message(4, "Four");
		Message m3 = new Message(3, "Three");
		Message m2 = new Message(2, "Two");
		Message m1 = new Message(1, "One");
		Message m0 = new Message(0, "Zero");
		
		q.add(m2);
		q.add(m1);
		q.add(m0);
		q.add(m4);
		q.add(m3);
		
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		System.out.println(q.remove());
		
		System.out.println("\n" + "Total time: " + q.time + "\n\n---Complex test---");
		
		//------------------------------Complex Test------------------------
		MessagePriorityQueue q2 = new MessagePriorityQueue();
		
		Message m41 = new Message(4, "Four");
		Message m31 = new Message(3, "Three");
		Message m21 = new Message(2, "Two");
		Message m11 = new Message(1, "One");
		Message m01 = new Message(0, "Zero");
		Message m42 = new Message(4, "Four");
		Message m32 = new Message(3, "Three");
		Message m22 = new Message(2, "Two");
		Message m12 = new Message(1, "One");
		Message m02 = new Message(0, "Zero");
		Message m43 = new Message(4, "Four");
		Message m33 = new Message(3, "Three");
		Message m23 = new Message(2, "Two");
		Message m13 = new Message(1, "One");
		Message m03 = new Message(0, "Zero");
		
		q2.add(m21);
		q2.add(m11);
		q2.add(m01);
		q2.add(m41);
		q2.add(m31);
		q2.add(m22);
		q2.add(m12);
		q2.add(m02);
		q2.add(m42);
		q2.add(m32);
		q2.add(m23);
		q2.add(m13);
		q2.add(m03);
		q2.add(m43);
		q2.add(m33);
		
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		System.out.println(q2.remove());
		
		
		System.out.println("\n" + "Total time: " + q2.time + "\n\n**For all intents and purposes, the units are minutes");
	}
	
	
}
