import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//
public class MessagePriorityQueue{

	private ArrayList<Queue> priorityQueue;
	
	
	public MessagePriorityQueue() {
		priorityQueue = new ArrayList<Queue>(5);
		Queue <Message> listZero = new LinkedList<Message>();
		priorityQueue.set(0, listZero);
		Queue <Message> listOne = new LinkedList<Message>();
		priorityQueue.set(1, listOne);
		Queue <Message> listTwo = new LinkedList<Message>();
		priorityQueue.set(2, listTwo);
		Queue <Message> listThree = new LinkedList<Message>();
		priorityQueue.set(3, listThree);
		Queue <Message> listFour = new LinkedList<Message>();
		priorityQueue.set(4, listFour);
	}
	
	
	
	
	
	
}
