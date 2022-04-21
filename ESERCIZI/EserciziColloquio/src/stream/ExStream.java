package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExStream {

	public static void main(String[] args) {
	
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(1);
		list.add(4);
		list.add(6);
		
		
		/////////////MAJ/MIN-OF/////////////////
		
		List<Integer> selectnum=list.stream().
				filter(x -> x<5).
				sorted().
				collect(Collectors.toList());
		
		System.out.println(selectnum);
		System.out.println();
		
		/////////////OCCURENCY of 1/////////////////
		
		List<Integer> selectnum1=list.stream().
				filter(x -> x==1).
				collect(Collectors.toList());;
				
		System.out.println("Filtered list"+selectnum1);
		System.out.println("Occurrency"+selectnum1.size());
		System.out.println();
		
		Map<Integer, Integer> maps=new HashMap<>();
		maps.put(selectnum1.get(0),selectnum1.size());
		System.out.println("OCCURENCY of 1"+" "+maps);
		System.out.println();
		/////////////OCCURENCY/////////////////
		
		Map<Integer,Long> map1 = new HashMap<>();
		map1 =list.stream()
			    .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
			   
		System.out.println("OCCURENCY"+" "+map1);
				
	}

}
