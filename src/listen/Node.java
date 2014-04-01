package listen;

public class Node {

	private int inhalt;
	private Node next = null;
	
	public Node(int inhalt){
		this.inhalt = inhalt;
	}
	
	public int get(){
		return inhalt;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next = next;
	}
}
