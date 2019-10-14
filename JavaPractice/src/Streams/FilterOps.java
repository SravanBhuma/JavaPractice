package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterOps {

	public static void main(String[] args) 
	{
		Predicate<Integer> pred = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t%2==0;
			}
		};
		
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList()));
		
		list.stream().filter(pred).forEach(System.out::println);
	}

}
