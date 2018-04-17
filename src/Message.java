
public class Message {

	int priority;
	int arrival;
	
	public void message(int p) {
		if(-1 < p && p < 5)	
			priority = p;
		else
			System.out.println("This is not a valid Priority");
	}
	
	public void setArrival(int a) {
		arrival = a;
	}
	
	public int getPriority() {
		return priority;
	}
	
	
	
	
}
