package com.set.examples;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample1 
{
	 public static void main(String[] args) 
	 {
	     HashSet<String> hset = new HashSet<String>();
	     hset.add("Element1");
	     hset.add("Element2");
	     hset.add("Element3");
	     hset.add("Element4");
	     hset.add("Element5");
	     hset.add(null);
	     System.out.println("Before: HashSet contains: "+ hset);
	 
	     /* public void clear(): It removes all the elements
	      * from HashSet. The set becomes empty after this
	      * method gets called.
	      */
	     hset.clear();
	     // Display HashSet content again
	     System.out.println("After: HashSet contains: "+ hset);
	     
	     LinkedHashSet<String> hset2 = new LinkedHashSet<String>();
	     hset2.add("Element1");
	     hset2.add("Element2");
	     hset2.add("Element3");
	     hset2.add("Element4");
	     hset2.add("Element5");
	     hset2.add(null);
	     System.out.println("Before: LinkedHashSet contains: "+ hset2);
	     
	     
	     
	     
	     
	  }
}
