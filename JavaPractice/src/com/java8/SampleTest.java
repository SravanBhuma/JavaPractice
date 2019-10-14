package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


class Test implements Consumer<String>
{
	@Override
	public void accept(String t) 
	{
		System.out.println(t);
	}
}


public class SampleTest
{
	public static void main(String[] args)
	{
		
		List<String> list = Arrays.asList("1","2","3","4","5");
		Consumer<String> str = new Test();
		list.forEach(str);
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}
