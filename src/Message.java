

public class Message {

	int priority;
	int arrival;
	int departure;
	String message;
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: constructor that creates a message object with a priority and a string; the string was just an extra thing
	 * @param p: the given priority of the message
	 * @param s: the given string that is what the message is saying; extra
	 * return: none
	 */
	public Message(int p, String s) {
		if(-1 < p && p < 5)	{
			priority = p;
			message = s;
		}else
			System.out.println("This is not a valid Priority");
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: sets the time at which the message was put into the priorityQueue 
	 * @param a: the time(min) that the message arrived
	 * return: none
	 */
	public void setArrival(int a) {
		arrival = a;
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: sets the time at which the message was removed from the priorityQueue 
	 * @param d: the time(min) that the message left
	 * return: none
	 */
	public void setDeparture(int d) {
		departure = d;
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: gets the time at which the message was removed from the priorityQueue 
	 * @return: the time that the message left
	 */
	public int getDeparture() {
		return departure;
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: gets the message's priority 
	 * @return: the message's priority
	 */
	public int getPriority() {
		return priority;
	}
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: gets the time at which the message was added to the priorityQueue 
	 * @return: the  time the message was put into the priorityQueue
	 */
	public int getArrivalTime() {
		return arrival;
	} 
	
	/**
	 * @author Aidan-S
	 * date: April 24th, 2018
	 * method: convert the message into a string to be printed 
	 * @return: string representation of the message
	 */
	public String toString() {
		return ("priority: " + priority + ", arrival: " + arrival + ", departure: " + departure);
	}
	
	
}
