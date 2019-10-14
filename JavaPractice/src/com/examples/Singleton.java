package com.examples;

public final class Singleton 
{
	
	private static Singleton singleton;
	
	private Singleton(String filePath, String sample)
	{
		
	}
	
	public static Singleton initialize(String filePath, String sample){
		if(singleton != null){
			singleton = new Singleton(filePath, sample);
		}
		
		return singleton;
	}
	
	public static Singleton getInstance(){
		return singleton;
	}
}
