package stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExStreamString {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();

		list.add("Carlo");
		list.add("Tommaso");
		list.add("Carlo");
		list.add("Carlo");
		list.add("Mario");
		list.add("Fabio");
		list.add("Fabio");
		
		String [] name= {"Carlo","Carlo","Carlo","Tommaso","Fabio"};
		
			//////STAMPA NUMERO OCCORRENZE////
				List<String> numAndNameOcc=list.stream().
				filter(person -> person.equals("Carlo")).
				collect(Collectors.toList());
			   
				System.out.println("STAMPA NUMERO OCCORRENZE");
				System.out.println(numAndNameOcc.get(0));
				System.out.println(numAndNameOcc.size());
				System.out.println();
				
			//////STAMPA NUMERO OCCORRENZE WITH FOR IN MAP////
				int counts=0;
				Map<String,Integer> mappas=new HashMap<>();
				
					for (int i = 0; i < name.length; i++) {
						for (int j = 0; j < name.length; j++) {
							if (name[i] == name[j]) {
								counts++;
							}
							mappas.put(name[i],counts);
						}
						counts = 0;
						
					}
					System.out.println("Mappas FOR"+" "+mappas);
					System.out.println();	  
					
			//////STAMPA NUMERO DI OCCORRENZE NELLA MAPPA////
				 Map<String,Integer> mappa=new HashMap<>();
				 
				 list.stream().
				 forEach(person-> 
				 { if(mappa.containsKey(person)) //Contiene la chiave
					 { 
					 mappa.put(person,mappa.get(person)+1);
					 } //Inserisci chiave valore se presente incrementa.
					 			
					 else{
						 mappa.put(person,1);
						 } 
				 }
				);
					System.out.println("Mappas STREAM"+" "+mappa);
					
				//////STAMPA NUMERO DI OCCORRENZE RIMOSSE NELLA MAPPA//// 
					Map<String,Integer> nameAndOcco=new HashMap<>();
			        list.stream().
			        forEach(person->
			            {
			            if(!nameAndOcco.containsKey(person)){
			                nameAndOcco.put(person,1);
			                }
			            }
			        );
			        
			        System.out.println("Mappas STREAM REMOVE"+" "+nameAndOcco);
			        System.out.println();
			    //////STAMPA NUMERO DI OCCORRENZE RIMOSSE NELLA MAPPA//// 
			        
			        System.out.println("Mappas STREAM DISTINCT");
					list.stream().
					distinct().
					collect(Collectors.toList()).
					forEach(System.out::print);

			        		   

	}

}
