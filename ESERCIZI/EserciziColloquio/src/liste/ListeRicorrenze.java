package liste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListeRicorrenze {

	public static void main(String[] args) {
////////////METODO SEMPLICE//////
		Map<Integer,Integer> map0=new HashMap<>();
		List<Integer> occurency=new ArrayList<>();
		occurency.add(1);
		occurency.add(1);
		occurency.add(3);
		occurency.add(4);
		occurency.add(1);
		
		
		int occ = Collections.frequency(occurency, 1);
		map0.put(1, occ);
		System.out.println(occ);
		/////////////////////////////////
		
		int[]arr1= {1,2,1,5,3};
		int count1=0;
		
		Map<Integer,Integer> map1=new HashMap<>();
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					count1++;
				}
				map1.put(arr1[i], count1);
			}
			count1=0;
		}
		System.out.println(map1+"map1");
		
		//////////////////////////////
		int[]arr2= {1,2,1,1,3};
		int count2=0;
		
		Map<Integer,Integer> map2=new HashMap<>();
		
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]==1) {
				count2++;
			map2.put(arr2[i], count2);
			}
			
		}
		
		System.out.println(map2+"map2");
	}

}
