package com.Almaz.datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List; 
public class ReverseLnkedList {
	public static List<Integer> reverseLinkedList(List<Integer> list){
		LinkedList<Integer> reversedLinkedList = new LinkedList<Integer>();// store the reversed list
		Iterator iterator= list.iterator();
		while (iterator.hasNext()) {
			
			reversedLinkedList.addFirst((iterator.next());
		}
		return reversedLinkedList;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList <Integer>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(3);
		System.out.println(reverseLinkedList(list));
	}

}
 