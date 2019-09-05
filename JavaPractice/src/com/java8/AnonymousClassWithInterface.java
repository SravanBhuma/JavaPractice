package com.java8;


interface ABC
{
	void show(String str);
}



//class ABCD implements ABC
//{
//	public void show()
//	{
//		System.out.println("ABCD");
//	}
//}

public class AnonymousClassWithInterface 
{
	public static void main(String[] args)
	{
		ABC abc = new ABC()
		{
			public void show(String str) 
			{
				System.out.println(str);
			}
		};
		
		ABC implementation2 = (String str)->System.out.println(str);
		ABC implementation3 = str->System.out.println(str);
		
		abc.show("ABCD");
		implementation2.show("Implementation2");
		implementation3.show("Implementation3");
		
	}

}
