
public class Node {
protected int value;
protected Node next;
	public Node(int g) {
		
		value = g;
		next = null;
		
	}
	public Node(int m, Node top) {
		value = m;
		next = top;
	}
	public int getValue() {
		return value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	

}
