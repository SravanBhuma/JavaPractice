package Streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ToArray 
{
	
	public static void main(String[] args)
	{
		Stream<Integer> stream = Stream.iterate(2, n->n*2);
		
		Integer[] arr = stream.limit(10).toArray(Integer[]::new);
		System.out.println(Arrays.toString(arr));
		
		IntStream intStream = IntStream.iterate(2,n->n+3);
		int[] array = intStream.limit(10).toArray();
		System.out.println(Arrays.toString(array));
		
		
		IntStream intStream2 = IntStream.iterate(2,n->n+3);
		Integer[] array2 = intStream2.limit(10).boxed().toArray(Integer[]::new);
		System.out.println(Arrays.toString(array2));
		
		
	}

}
