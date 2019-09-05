package com.java8;

class ParentClass
{
	    public void hello() {
	        System.out.println("Hello ParentClass!");
	    }
}
	

	interface InterfaceFoo {
	    default public void hello() {
	        System.out.println("Hello InterfaceFoo!");
	    }
	}

	interface InterfaceBar {
	    default public void hello() {
	        System.out.println("Hello InterfaceBar!");
	    }
	}

public class InterfaceExample extends ParentClass implements InterfaceFoo, InterfaceBar 
{
	    public void hello() 
	    {
	        super.hello(); // (note: ParentClass.super is wrong!)
	        InterfaceFoo.super.hello();
	        InterfaceBar.super.hello();
	    }

	    public static void main(String[] args) {
	        new InterfaceExample().hello();
	    }
}

