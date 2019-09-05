package com.linkedlist.examples;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample1 
{
	
	public static void main(String[] args) 
	{
    LinkedList<String> list=new LinkedList<String>(Arrays.asList("Me","You"));

    //Adding elements to the Linked list
    list.add("Steve");
    list.add("Carl");
    list.add("Raj");
    list.add("Negan");
    list.add("Rick");

    list.addFirst("Initial");
    list.addLast("End");
    
    System.out.print("\nAfter adding elements: ");
    Iterator<String> iterator=list.iterator();
    while(iterator.hasNext()){
       System.out.print(iterator.next()+" ");
    }
    
    list.removeFirst();
    list.removeLast();
    System.out.print("\nAfter removing first and last element: ");
    iterator=list.iterator();
    while(iterator.hasNext()){
       System.out.print(iterator.next()+" ");
    }
    list.remove(1);
    System.out.print("\nAfter removing second element: ");
    Iterator<String> iterator2=list.iterator();
    while(iterator2.hasNext()){
       System.out.print(iterator2.next()+" ");
    }
    
    String firstvar = list.get(0);
    System.out.println("\nFirst element: " +firstvar);
    list.set(0, "Changed first item");
    Object firstvar2 = list.get(0);
    System.out.println("First element after update by set method: " +firstvar2);
 }
}
