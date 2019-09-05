package com.arraylist.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayListExample 
{
	public static void main(String a[])
	{
		// 1st way is Collections.synchronizedList(List<String> arg0)
		ArrayList<String> sync = new ArrayList<String>();
		List<String> syncal2 = Collections.synchronizedList(sync);
		List<String> syncal = Collections.synchronizedList(new ArrayList<String>());
		syncal.add("Pen");
		syncal.add("NoteBook");
		syncal.add("Ink");

		syncal2.add("Pen");
		syncal2.add("NoteBook");
		syncal2.add("Ink");

		//	       The important point to note here is that iterator should be in synchronized block 
		//	       in this type of synchronization as shown in the below example.
		
		synchronized (syncal)
		{
			Iterator<String> itr = syncal.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
		}
		
		
		
		
		//2nd way is suing CopyOnWriteArrayList
		CopyOnWriteArrayList<String> copyArray= new CopyOnWriteArrayList<String>(Arrays.asList("Pen","book","Ink"));
		
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = copyArray.iterator(); 
	    while (iterator.hasNext())
	       System.out.println(iterator.next());
		
	}

}
