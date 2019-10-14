package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOps 
{
	
	int id;
	String name;
	int salary;
	
	public MapOps(int id, String name, int salary) 
	{
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "\nName of the employee is: "+ this.name +" and salary is: "+this.salary;

	}

	public static void main(String[] args) 
	{
		List<String> listOfStrings = Arrays.asList("1", "2", "3", "4", "5");
		
		System.out.println(listOfStrings.stream().map(i->Integer.valueOf(i)).collect(Collectors.toList()));
		listOfStrings.stream().map(Integer::valueOf).forEach(System.out::println);
		
		List<MapOps> employeesList = Arrays.asList(
                new MapOps(1, "Alex", 100),
                new MapOps(2, "Brian", 100),
                new MapOps(3, "Charles", 200),
                new MapOps(4, "David", 200),
                new MapOps(5, "Edward", 300),
                new MapOps(6, "Frank", 300)
            );
		
		System.out.println("\nDistinct Salaries:");
		
		employeesList.stream().map(i->i.salary).distinct().forEach(System.out::println);
		
		MapOps[] emp = employeesList.stream().filter(i->i.salary>200).toArray(MapOps[]::new);
		
		System.out.println(Arrays.toString(emp));
	}

}
