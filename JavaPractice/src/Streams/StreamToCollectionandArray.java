package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamToCollectionandArray 
{
	public static void main(String[] args) 
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
		List<Integer> list2 = list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(list);
		System.out.println(list2);
		
		Integer[] intArray = list.stream().filter(i->i%2==0).toArray(Integer[]::new);
		for(int a:intArray)
		{
			System.out.println("List to array: "+ a);
		}
		
		
	}
}
