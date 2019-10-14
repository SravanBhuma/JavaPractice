package Streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Limit {

	public static void main(String[] args) 
	{
		Stream<Integer> stream = Stream.iterate(0, n->n+2);
		System.out.println(stream.limit(20).collect(Collectors.toList()));
		
		try
		{
			System.out.println(stream.skip(5).limit(20).collect(Collectors.toList()));
		}
		finally{
		
		Stream<Integer> stream2 = Stream.iterate(0, n->n+2);
		System.out.println(stream2.skip(5).limit(20).collect(Collectors.toList()));
		}
		
	}

}
