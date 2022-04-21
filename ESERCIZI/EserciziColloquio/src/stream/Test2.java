package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 extends Thread{


public static void main(String[] args) {
	
Map<String, List<String>> map=new HashMap<>();

List<String> list1 = new ArrayList<>();

list1.add("el1");

list1.add("el2");

map.put("Key1", list1);

List<String> list2 = new ArrayList<>();

list1.add("el3");

list1.add("el4");

map.put("Key2", list2);

for(String key : map.keySet()){

System.out.println("Key"+" "+key);
System.out.println("MapKey"+" "+map.get(key));
System.out.println();
}

System.out.println("Key3"+" "+map.get("Key3"));

}

}
