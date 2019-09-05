package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduceOptimize1 
{
	public static void main(String[] args)
	{

				List<Integer> list = Arrays.asList(1,2,3,4,5);

				Stream<Integer> s = list.parallelStream();

				Stream<Integer> s2 = s.map(new Function<Integer, Integer>()
						{
					public Integer apply(Integer t) 
					{
						return t*2;
					}
						});
				
				Integer i = s2.reduce(0, new BinaryOperator<Integer>() {
					public Integer apply(Integer arg0, Integer arg1) {
						return arg0+arg1;
					}
				});
				
				System.out.println(i);
				
	}

}
