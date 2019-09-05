package com.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MapReduceOptimize3 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Iterator<Integer> itr = list.parallelStream().map(i->i*2).iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println(list.parallelStream().map(i->i*2).reduce(0, (c,e)->c+e));
        System.out.println(list.parallelStream().map(i->i*2).reduce(0, (c,e)->Integer.sum(c, e)));
        System.out.println(list.parallelStream().map(i->i*2).reduce(0, Integer::sum));
	}
}
