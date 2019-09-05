package com.java8;

import java.util.Arrays;
import java.util.List;
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
	}

}
