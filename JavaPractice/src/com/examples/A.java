/*All classes have at least one constructor. If a class does not explicitly declare any,
 *  the Java compiler automatically provides a no-argument constructor, also called the default constructor.
 *   This default constructor calls the class parent’s no-argument constructor (as it contain only one statement i.e super();), 
 *   or the Object class constructor 
 * if the class has no other parent (as Object class is parent of all classes either directly or indirectly).*/

package com.examples;

class B 
{
	{
		System.out.println("Instance Initialized block of parent"); 
	}
		B() 
		{ 
			System.out.println("B-Constructor Called"); 
		}
	    
		B(int i) 
		{ 
			System.out.println("B-parameterized Constructor Called"); 
		} 


} 
public class A extends B
	{ 
		A() 
		{ 
			System.out.println("A-Constructor Called"); 
		} 
	    A(int i)
	    {
	    	System.out.println("A-parameterized Constructor Called"); 
	    }
	    A(int i, int j)
	    {
	    	System.out.println("A-triple parameterized Constructor Called"); 
	    }
		public static void main(String[] args) 
		{ 
	        A aaa = new A (2,3);
		} 
} 
