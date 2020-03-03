
public class Node {
protected String value;
protected Node next;
	public Node(String g) {
		
		value = g;
		next = null;
		
	}
	public Node(String m, Node top) {
		value = m;
		next = top;
	}
	public String getValue() {
		return value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	

}
