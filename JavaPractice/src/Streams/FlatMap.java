package Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {

	public static void main(String[] args)
	{
		List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);
        List<Integer> list3 = Arrays.asList(7,8,9);
          
        List<List<Integer>> listOfLists = Arrays.asList(list1, list2, list3);
         
        Stream<List<Integer>> listOfAllIntegers = listOfLists.stream();
        
        Stream<Integer> listofStreams = listOfLists.stream().flatMap(i->i.stream());
        
        Stream<Integer> listofStreams2 = listOfLists.stream().flatMap(Collection::stream);
        
        System.out.println(listOfLists.stream().flatMap(Collection::stream).collect(Collectors.toList()));
        
        String[][] dataArray = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        
        List<String[]> listOfStrings = Arrays.asList(dataArray);
        
        System.out.println(listOfStrings.stream().flatMap(x->Arrays.stream(x)).filter(x->x.equals("a")).anyMatch(x->x.equals("a")));
        
        
        
        Stream<String[]> stream1 = Arrays.stream(dataArray);
        System.out.println(stream1.flatMap(x->Arrays.stream(x)).filter(x->!x.equals("a")).collect(Collectors.toList()));
        
		
		
		
	}
}
