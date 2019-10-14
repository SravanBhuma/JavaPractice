package Streams;

import java.util.Arrays;
import java.util.List;

public class Minimum {

	public static void main(String[] args) 
	{
		
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 5, 9, 6, 8);
		
		System.out.println(list.stream().min((i,j)->i.compareTo(j)).get());
		
		System.out.println(list.stream().min((i,j)->i.compareTo(j)));
		
		System.out.println(list.stream().max((i,j)->i.compareTo(j)).get());

	}

}
