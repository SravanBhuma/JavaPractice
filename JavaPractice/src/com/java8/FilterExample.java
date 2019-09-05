package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterExample 
{

	public static void main(String[] args)
	{
		Predicate<Integer> predicate = new Predicate<Integer>() 
				{

			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%5==0;
			}
				};

				List<Integer> list = Arrays.asList(10,34,56,75,89,90,35,77);

				List<Integer> newList = Arrays.asList(11,22,33,44,77,88,99,46);
				Stream<Integer> s = list.parallelStream();
				System.out.println(s.filter(predicate).reduce(0, Integer::sum));
				System.out.println(list.parallelStream().filter(i->i%5==0).reduce(0, Integer::sum));
				System.out.println(newList.parallelStream().filter(i->i%5==0).reduce(Integer::sum));
				System.out.println(newList.parallelStream().filter(i->i%5==0).reduce(0,Integer::sum));
				System.out.println(newList.parallelStream().filter(i->i%5==0).findFirst());
				System.out.println(newList.parallelStream().filter(i->i%5==0).findFirst().orElse(0));
	}

}
