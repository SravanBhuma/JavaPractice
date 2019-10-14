package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOps 
{

	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("shravan", "bhuma", "naveen", "kumar", "shravani");
		List<String> list2 = list.stream().filter(s->s.startsWith("sh")).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println(list.stream().filter(s->!s.startsWith("sh")).collect(Collectors.toList()));
		System.out.println(list.stream().sorted().filter(s->!s.startsWith("sh")).collect(Collectors.toList()));
		System.out.println(list.stream().map(String::toUpperCase).collect(Collectors.toList()));
		System.out.println(list.stream().anyMatch(s->s.startsWith("sh")));
		System.out.println(list.stream().allMatch(s->s.startsWith("sh")));
		System.out.println(list.stream().noneMatch(s->s.startsWith("za")));
		System.out.println(list.stream().sorted().filter(s->!s.startsWith("sh")).count());
		System.out.println(list.stream().reduce("", (s1, s2)-> s1+"#"+s2));
		System.out.println(list.stream().filter(i->i.startsWith("sh")).findFirst().orElse("NoneFound"));
		System.out.println(list.stream().filter(i->i.startsWith("zas")).findFirst().orElse("NoneFound"));
		
	
	}
}
