package com.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;

public class ForEachConsumerInterface 
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("1","2","3","4","5");

		Consumer<String> action = new Consumer<String>() 
				{
			public void accept(String t) 
			{
				System.out.println(t);
			}
				};

				Consumer<String> action2 = (String str)->System.out.println(str);
				Consumer<String> action3 = str ->System.out.println(str);

				list.forEach(action);
				list.forEach(action2);
				list.forEach(action3);
				list.forEach(str->System.out.println(str));


				
				HashMap<Integer, String> map= new HashMap<>();
				map.put(1, "One");
				map.put(2, "Two");
				Set<Entry<Integer, String>> mapEntry= map.entrySet();
				System.out.println(mapEntry);
				for(Map.Entry<Integer, String> entry:map.entrySet())
				{
					System.out.println("Key is: "+entry.getKey());
					System.out.println("Key is: "+entry.getValue());
					
				}
				map.entrySet().forEach(System.out::println);
				map.keySet().forEach(System.out::println);
				map.values().forEach(System.out::println);
				
				
			
	}

}
