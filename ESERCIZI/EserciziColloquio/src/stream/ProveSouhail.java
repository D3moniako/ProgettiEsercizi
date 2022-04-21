package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProveSouhail {

	public static void main(String[] args) {
		
		 Map<String,List<String>>map=new HashMap<>();
		 
		 List<String> nomi=new ArrayList<>();
		 nomi.add("Sara");
		 nomi.add("Lope");
		 nomi.add("pene");
		 
		 List<String> cognomi=new ArrayList<>();
		 cognomi.add("Visconti");
		 cognomi.add("Cippi");
		 cognomi.add("Primci");
		 
		 List<String> gnomi=new ArrayList<>();
		 gnomi.add("Visconti");
		 gnomi.add("Cippi");
		 gnomi.add("sfgs");
		 
		 map.put("Knomi",nomi);
		 map.put("Kcognomi",cognomi);
		 map.put("Kcognomi",gnomi);
		 
		 ///STAMPA MAPPA CON CICLO FOR
		 System.out.println();
		 for( String s : map.keySet()) {
			 System.out.println(s+""+map.get(s));
		 }
		 System.out.println();
		 
		///STAMPA MAPPA CON GLI STREAM
		 map.entrySet().stream().
		 forEach(el-> System.out.println(el));
		 System.out.println();
		 System.out.println(map.entrySet());
		
		 
	
		 
		
		

}
}