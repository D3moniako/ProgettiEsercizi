package stream;

import java.util.*;
import java.util.stream.*;




public class ExStreamObj {
		
	public static void main(String []args) {
		
		List<Persone> person=new ArrayList<>();
		person.add(new Persone("Antonio","Catania",87,"M"));
		person.add(new Persone("Salvo","Ricci",13,"M"));
		person.add(new Persone("Tommaso","Sella",56,"M"));
		person.add(new Persone("Antonio","Ricci",43,"M"));
		
		
		/////////STAMPA SEMPLICE//////////
		System.out.println("STAMPA SEMPLICE");
		person.forEach(System.out::println);
		
		System.out.println();
		
		/////////STAMPA SORT PER ?//////////
		System.out.println("STAMPA SORT PER NOME ED ETA'");
		person.stream().
		sorted(Comparator.comparing(Persone::getName)).
		sorted(Comparator.comparing(Persone::getAge).reversed()).
		collect(Collectors.toList()).
		forEach(System.out::println);
		
		System.out.println();
		
/////////STAMPA SORT PER ?//////////
		System.out.println("STAMPA SORT PER NOME");
		person.stream().
		sorted(Comparator.comparing(Persone::getName)).
		collect(Collectors.toList()).
		forEach(System.out::println);
		
		System.out.println();
		
		/////////STAMPA STESSI NOMI ECC...//////////
		
		System.out.println("STAMPA STESSI NOMI ECC...");
		List<Persone> pers=
		person.stream().
		filter(p->p.getSurname().equals("Ricci")).
		filter(p->p.getName().equals("Antonio")).
		collect(Collectors.toList());
		
		pers.forEach(System.out::println);
		System.out.println();
		
		/////////STAMPA IN MAPPA...//////////
		System.out.println("STAMPA IN MAPPA K/V");
		Map<String,String> mappa=
		person.stream().
		//filter(p->p.getName().equals("Antonio")).
		collect(Collectors.toMap(Persone::getSurname,Persone::getName,(s, a) -> s + "," + a));
		System.out.println(mappa+""+"Mappa");
		System.out.println();
		
		/////////////LIST OF SINGLE PARAMETER///////////////////
		System.out.println("LIST OF SINGLE PARAMETER");
		List<String> list = person.stream().
				//filter(e -> e.getName().equals("Antonio")).
				map( e -> e.getSurname()).
				collect(Collectors.toList());
		
		System.out.println(list);
						
	}
	
	public static class Persone{
		
		public String name;
		
		public String surname;
		
		public int age;
		
		public String gender;
		
		public Persone(String name,String surname,int age,String gender) {
			this.name=name;
			this.surname=surname;
			this.age=age;
			this.gender=gender;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSurname() {
			return surname;
		}

		public void setSurname(String surname) {
			this.surname = surname;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Persone [name=" + name + ", surname=" + surname + ", age=" + age + ", gender=" + gender + "]";
		}
		
		
	}
	 
	}


