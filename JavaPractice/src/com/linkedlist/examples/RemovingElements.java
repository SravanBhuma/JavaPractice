package com.linkedlist.examples;

import java.util.LinkedList;

public class RemovingElements 
{
	public static void main(String[] args) {
		 
	    LinkedList<String> linkedlist = new LinkedList<String>();
	    linkedlist.add("Item1");
	    linkedlist.add("Item2");
	    linkedlist.add("Item3");
	    linkedlist.add("Item4");
	    linkedlist.add("Item5");
	    linkedlist.add("Item6");
	    linkedlist.add("Item7");
	    linkedlist.add("Item8");
	    linkedlist.add("Item9");
	    linkedlist.add("Item11");
	    linkedlist.add("Item11");
	    linkedlist.add("Item11");
	    linkedlist.add("Item12");
	    linkedlist.add("Item11");
	    linkedlist.add("Item13");
	    System.out.println("LinkedList Elements are:");
	    for(String str: linkedlist){
	       System.out.println(str);
	    }
	    System.out.println("\nElement removed: "+ linkedlist.remove("Item8"));
	    System.out.println("\nElement removed: "+ linkedlist.remove());
	    System.out.println("\nElement removed: "+ linkedlist.removeFirst());
	    System.out.println("Element removed: "+ linkedlist.removeLast());
	    
	    System.out.println(linkedlist);
	    
	    System.out.println("First occurence Element removed: "+ linkedlist.removeFirstOccurrence("Item11"));
	    System.out.println("First occurence Element removed: "+ linkedlist.removeLastOccurrence("Item1333"));
	    
	    System.out.println(linkedlist);
	    
	    System.out.println("\nElement removed: "+ linkedlist.poll());
	    System.out.println("\nElement removed: "+ linkedlist.pollFirst());
	    System.out.println("Element removed: "+ linkedlist.pollLast());
	    
	    System.out.println("\nFirst Element of List: "+ linkedlist.getFirst());
	    System.out.println("\nLast Element of List: "+ linkedlist.getLast());
	    
	    System.out.println("\nList Elements after Remove:");
	    for(String str2: linkedlist){
	       System.out.println(str2);
	    }
	    
	    linkedlist.clear();
	    
	    System.out.println("\n Poll Element removed: "+ linkedlist.poll());
	    System.out.println("\n pollFirst Element removed: "+ linkedlist.pollFirst());
	    System.out.println("\n pollLast Element removed: "+ linkedlist.pollLast());
	    
	    System.out.println("\n peek Element: "+ linkedlist.peek());
	    System.out.println("\n peekFirst Element: "+ linkedlist.peekFirst());
	    System.out.println("\n peekLast Element: "+ linkedlist.peekLast());
	    
	    try
	    {
	    System.out.println("\nFirst Element: "+ linkedlist.getFirst());
	    System.out.println("\nLast Element: "+ linkedlist.getLast());
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    	System.out.println(e.getCause());
	    }
	    
	    try
	    {
	    System.out.println("\nElement removed: "+ linkedlist.remove());
	    System.out.println("\nElement removed: "+ linkedlist.removeFirst());
	    System.out.println("Element removed: "+ linkedlist.removeLast());
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e.getMessage());
	    	System.out.println(e.getCause());
	    }
	    
	 }

}
