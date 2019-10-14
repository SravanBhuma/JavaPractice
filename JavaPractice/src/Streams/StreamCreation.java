package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8);
		System.out.println("Stream1");
		stream.forEach(System.out::println);
		
		Stream<Integer> stream2 = Stream.of(new Integer[]{1,2,3,4,5});
		System.out.println("\n\nArray Stream");
		stream2.forEach(System.out::println);
		
		System.out.println("\n\nlist stream");
		list.stream().forEach(System.out::println);
		
		IntStream stream3 = "lbcgdeldahdla".chars();
		System.out.println("\n\nIntStream");
		stream3.forEach(System.out::println);
		

	}

}
