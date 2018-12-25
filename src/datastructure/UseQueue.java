package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		// using add to add elements to queue
		Queue q= new LinkedList();
		q.add("1, Maryam");
		q.add("2, Arifa");
		q.add("3, Nafia");
		q.add("4, Basima");
		q.add("5, Siham");
		q.add("6, Layla");
		//iterate through the queue
		for (Object o: q) {
String element	 = (String) o;
			System.out.println(o);
		}
		//using  peek to check the top element in the queue

		Object top = q.peek();
		System.out.println("Peek element is : "+top);
		// using remove
		((LinkedList) q).remove();
		top = q.peek();
		System.out.println("New Peek after remove is : "+top);

	}

}
