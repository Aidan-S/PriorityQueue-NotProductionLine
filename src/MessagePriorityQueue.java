import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

//
public class MessagePriorityQueue{

	private ArrayList<Queue> priorityQueue;
	private int time;
	
	public static final int LISTS = 5;
	
	public static final int TEST_ONE = 100;
	public static final int TEST_TWO = 1000;
	public static final int TEST_THREE = 10000;
	
	public static final int BUFFER = 30;
	
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: constructor that creates the priorityQueue by filling it with the 5 different priority queues
	 */
	public MessagePriorityQueue() {
		priorityQueue = new ArrayList<Queue>(LISTS);
		
		for(int i = 0; i < LISTS; i++) {
			priorityQueue.add(new LinkedList<Message>());
		}
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
		
		priorityQueue.get(s).add(m);
  
		
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
	 * method: determine if the priority queue is empty
	 * @return: whether there is anything in the queue
	 */
	private boolean isEmpty() {
		
			int i = -1;
			if(!priorityQueue.get(4).isEmpty()) {
				return false;
			}
			if(!priorityQueue.get(3).isEmpty()) {
				return false;
			}
			if(!priorityQueue.get(2).isEmpty()) {
				return false;
			}
			if(!priorityQueue.get(1).isEmpty()) {
				return false;
			}
			if(!priorityQueue.get(0).isEmpty()) {
				return false;
			}
			return true;
	}
	
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: determine the average of a list of ints
	 * @parameter: list: list of ints to find the average of
	 * @return: the average num
	 */
	private static int average(ArrayList<Integer> list) {
		  Integer count = 0;
		  for (Integer item : list) {
			  count += item;
		  }
		    
		  return count / list.size();
		}
	
	
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: determine if the priority queue is empty
	 * @parameter: test making a priority queue that is taking in different amounts of messages
	 * @return: whether there is anything in the queue
	 */
	private static void runQ(int k) {
		MessagePriorityQueue q = new MessagePriorityQueue();
		
		//create the lists to hold the different times in the queue
		Message m;
		ArrayList<Integer> zero = new ArrayList<Integer>();
		ArrayList<Integer> one = new ArrayList<Integer>();
		ArrayList<Integer> two = new ArrayList<Integer>();
		ArrayList<Integer> three = new ArrayList<Integer>();
		ArrayList<Integer> four = new ArrayList<Integer>();
		
		
		for(int i = 0; i < k+BUFFER; i++) {
			q.add(new Message((int)(Math.random() * 5), "Number " + i));
			
			if(i > 10) {
				m = q.remove();
				if(m.getPriority() == 0) {
					zero.add(m.getDeparture() - m.getArrivalTime());
				}
				
				if(m.getPriority() == 1) {
					one.add(m.getDeparture() - m.getArrivalTime());
				}
				
				if(m.getPriority() == 2) {
					two.add(m.getDeparture() - m.getArrivalTime());
				}
				
				if(m.getPriority() == 3) {
					three.add(m.getDeparture() - m.getArrivalTime());
				}

				if(m.getPriority() == 4) {
					four.add(m.getDeparture() - m.getArrivalTime());
				}
				
				//only print if there aren't too many messages to print
				if(k < 200)
					System.out.println(m);
			}
			
		}
		
		
		
		
		while(!q.isEmpty()) {
			m = q.remove();
			if(m.getPriority() == 0) {
				zero.add(m.getDeparture() - m.getArrivalTime());
			}
			
			if(m.getPriority() == 1) {
				one.add(m.getDeparture() - m.getArrivalTime());
			}
			
			if(m.getPriority() == 2) {
				two.add(m.getDeparture() - m.getArrivalTime());
			}
			
			if(m.getPriority() == 3) {
				three.add(m.getDeparture() - m.getArrivalTime());
			}

			if(m.getPriority() == 4) {
				four.add(m.getDeparture() - m.getArrivalTime());
			}
			
			//only print if there aren't too many messages to print
			if(k < 200)
				System.out.println(m);
		}
		
		
		
		System.out.println("\n" + k +" items");
		System.out.println("Average time: " + average(zero));
		System.out.println("Average time: " + average(one));
		System.out.println("Average time: " + average(two));
		System.out.println("Average time: " + average(three));
		System.out.println("Average time: " + average(four) + "\n");
	}
	
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: main method that tests the message and MessagePriorityQueue classes
	 * @param args: string array of arguments
	 */
	public static void main (String[] args) {
		runQ(TEST_ONE);
		runQ(TEST_TWO);
		runQ(TEST_THREE);
	}
	
	
	
}