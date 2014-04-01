package listen;

public class LinkedList implements IList {

	private Node first;
	private int size;
	
	public LinkedList(){
		size = 0;
	}
	
	@Override
	public void insertAt(int n, int pos) {
		if(this.getCount() == 0){
			first = new Node(n);
		} else {
			Node tmp = new Node(n);
			
			if(pos == 0){
				tmp.setNext(first);
				first = tmp;
			} else {
				Node prev = this.getNodeAt(pos - 1);
				tmp.setNext(prev.getNext());
				prev.setNext(tmp);
			}
		}
		size++;
	}

	@Override
	public void removeAt(int pos) {
		if(pos == 0){
			first = first.getNext();
		} else {
			Node prev = this.getNodeAt(pos - 1);
			prev.setNext(this.getNodeAt(pos).getNext());
		}
		size--;
		
	}

	private Node getNodeAt(int pos){
		if(this.getCount() < pos || pos < 0){
			throw new RuntimeException("Geht halt nicht!");
		} else {
			Node c = first;
			for(int i = 0; i < pos; i++){
				c = c.getNext();
			}
			
			return c;
		}
	}	
	
	@Override
	public int getAt(int pos) {
		return this.getNodeAt(pos).get();
	}

	@Override
	public int search(int n) {
		for(int i = 0; i < this.getCount(); i++){
			Node currentNode = this.getNodeAt(i);
			if(currentNode.get() == n){
				return i;
			}
		}		
		return -1;
	}

	@Override
	public void clear() {
		first = null;
		size = 0;
	}

	@Override
	public int getCount() {
		return size;
	}

}
