package com.arraylist.examples;

public class Reverse {

	public static void main(String[] args) 
	{

		StringBuffer str = new StringBuffer("madam");
		String str2 = str.toString();
		StringBuffer str3 = new StringBuffer(str2);
		System.out.println(str);
		System.out.println(str2);
		if(str2.equals(str3))
		{
			System.out.println("Yes Equals");
		}
		if(str2.contentEquals(str3.reverse()))
				{
			System.out.println("Yes Content equals");
				}
	}
	
	//String Buffer/builder doesn't override equals method unlike String. So can't compare string buffers using equals
	
	// So we use content equals which compare string with string buffer/builder

}
