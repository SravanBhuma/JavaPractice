package com.java8;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample 
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		list.forEach(i->doubleValues(i));
		list.forEach(MethodReferenceExample::doubleValues);
	}
	
	public static void doubleValues(int i)
	{
		System.out.println(i*2);
	}
}
