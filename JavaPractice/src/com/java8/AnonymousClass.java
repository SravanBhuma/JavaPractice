package com.java8;

class A
{
	public void show(String str)
	{
		System.out.println(str);
	}
}

/*If the main purpose of child class is to override the method of parent class, 
 * then we can use anonymous class instead of inheriting
 */

//class B extends A
//{
//	public void show()
//	{
//		System.out.println("B");
//	}
//}


public class AnonymousClass
{
	public static void main(String[] args)
	{
		
		A obj = new A()
		{
			public void show(String str)
			{
				System.out.println(str);
			}
		};
		
		obj.show("Sample");
		
	}
}
