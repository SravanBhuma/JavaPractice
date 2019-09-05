package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MapReduceOptimize2 
{
	public static void main(String[] args)
	{

				List<Integer> list = Arrays.asList(1,2,3,4,5);

				Stream<Integer> s = list.parallelStream();

				Stream<Integer> s2 = s.map(t->t*2);
				
				Integer i = s2.reduce(0, (c,e)->c+e);
				
				System.out.println(i);
	}
}
