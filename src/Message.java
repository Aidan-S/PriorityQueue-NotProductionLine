
public class Message {

	int priority;
	int arrival;
	String message;
	
	public Message(int p, String s) {
		if(-1 < p && p < 5)	{
			priority = p;
			message = s;
		}else
			System.out.println("This is not a valid Priority");
	}
	
	public void setArrival(int a) {
		arrival = a;
	}
	
	public int getPriority() {
		return priority;
	}
	
	public int getArrivalTime() {
		return arrival;
	} 
	
	public String toString() {
		return message;
	}
	
	
}
