import java.util.ArrayList;
import java.util.Queue;

public class MessagePriorityQueue{

	private ArrayList<Queue> listOfQueues;
	
	
	public MessagePriorityQueue() {
		listOfQueues = new ArrayList<Queue>(5);
		Queue <Message> listZero = new Queue<Message>();
		listOfQueues.set(0, listZero);
	}
	
	
	
	
	
	
}
