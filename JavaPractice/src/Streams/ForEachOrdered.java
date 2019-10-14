package Streams;

import java.util.Arrays;
import java.util.List;

public class ForEachOrdered 
{
	public static void main(String[] args)
	{
	List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);
	
	System.out.println("For Each: \n");
	list.stream().parallel().forEach( System.out::println );        
	
	System.out.println("\nFor Each Ordered: \n");
	list.stream().parallel().forEachOrdered( System.out::println );
	}
}
