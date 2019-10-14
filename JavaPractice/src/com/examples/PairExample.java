package com.examples;

import java.util.HashMap;
import java.util.Map;

public class PairExample 
{

	public static void main(String[] args) 
	{
	String[] str = new String[]{"10", "20", "30", "40", "10", "10", "20", "20", "20"};
	HashMap<String, Integer> map = new HashMap<>();
	for(String i:str)
	{
		if(map.containsKey(i))
		{
			map.put(i, map.get(i)+1);
		}
		else
		{
			map.put(i,  1);
		}
	}
	
	for(Map.Entry<String, Integer> entry: map.entrySet())
	{
		int count = entry.getValue()/2;
		System.out.println(entry.getKey()+" has "+count+" pairs");
	}
}
}
