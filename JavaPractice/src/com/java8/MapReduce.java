package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class MapReduce 
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> func = new Function<Integer, Integer>()
				{
			public Integer apply(Integer t) 
			{
				return t*2;
			}
				};
				
				BinaryOperator<Integer> binary = new BinaryOperator<Integer>() {
					
					@Override
					public Integer apply(Integer arg0, Integer arg1) {
						// TODO Auto-generated method stub
						return arg0+arg1;
					}
				};


				List<Integer> list = Arrays.asList(1,2,3,4,5);

				Stream<Integer> s = list.parallelStream();

				Stream<Integer> s2 = s.map(func);
				
				Integer i = s2.reduce(0, binary);
				
				System.out.println(i);
				

	}


}
