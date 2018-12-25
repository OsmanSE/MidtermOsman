package datastructure;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */

		ArrayList al= new ArrayList();
		al.add("100   Layla Omar");
		al.add("200   Jamal Adam");
		al.add("400   Layla Samir");
		al.add("300   Samah Badri");
		Iterator it= al.listIterator();
		while (it.hasNext()){
			Object  o=it.next();
			System.out.println(o);
		}
		System.out.println("\n*****************************\n");
		for (Object o: al){

			System.out.println(o);
		}
	}

}
