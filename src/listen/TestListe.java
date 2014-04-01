package listen;

import java.util.Random;

public class TestListe {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Random r = new Random();
		
		// test insertAt
		for(int i = 0; i < 100; i++){
			list.insertAt(r.nextInt(1000), i);
		}
		printList(list);
		
		// test removeAt
		list.removeAt(99);
		list.removeAt(3);
		list.removeAt(17);
		list.removeAt(0);
		
		printList(list);
		
		// test clear
		list.clear();
		printList(list);
		
		//test search
		list.insertAt(10, 0);
		list.insertAt(11, 1);
		list.insertAt(12, 2);
		list.insertAt(13, 3);
		list.insertAt(14, 4);
		printList(list);
		
		System.out.println(list.search(13));
		
	}
	
	public static void printList(LinkedList list){
		for(int i = 0; i < list.getCount(); i++){
			System.out.println(i + ":" + list.getAt(i));
		}
		System.out.println("---------------------------------");
	}
	
}
