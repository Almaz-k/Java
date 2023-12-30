package com.Almaz.datastructure;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DetectLoopLinkedlist {
	public static Boolean detectLoop(List<Integer> list) {
		HashSet<Integer>uniqueElement = new HashSet<Integer>();
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			if(uniqueElement.contains(iterator.next())) {
				return true;
			}
			uniqueElement.add(iterator.next());
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(3);
		System.out.println(detectLoop(list));		// this returns true as we have duplicates 
		
		
	}

}
