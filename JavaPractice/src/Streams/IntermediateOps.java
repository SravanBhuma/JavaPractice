package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateOps
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>(Arrays.asList("shravan", "bhuma", "naveen", "kumar", "shravani"));
		List<String> list2 = list.stream().filter(s->s.startsWith("sh")).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list.stream().filter(s->!s.startsWith("sh")).collect(Collectors.toList()));
		System.out.println(list.stream().sorted().filter(s->!s.startsWith("sh")).collect(Collectors.toList()));
		System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
	}

}
