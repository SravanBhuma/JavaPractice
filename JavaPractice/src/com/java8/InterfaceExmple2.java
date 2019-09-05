package com.java8;

class ParentClass2
{
public void hello() {
    System.out.println("Hello ParentClass!");
}
}


interface InterfaceFoo2 {
default public void hello() {
    System.out.println("Hello InterfaceFoo!");
}
}

interface InterfaceBar2 {
default public void hello() {
    System.out.println("Hello InterfaceBar!");
}
}

//class will have high priority over interface and hello method of extended class is printed
public class InterfaceExmple2 extends ParentClass2 implements InterfaceBar2
{

	public static void main(String[] args) {
		 
		new InterfaceExmple2().hello();

	}

}
