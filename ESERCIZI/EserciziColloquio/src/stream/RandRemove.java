package stream;

import java.util.*;
public class RandRemove{

     public static void main(String []args){
         
         List<String> l = Arrays.asList("a","b");
         System.out.println(l);
         System.out.println();
         
         List<String> lista = new ArrayList<String>();
         
         lista.add("ciao");
         lista.add("prova");
         lista.add("bene");
         lista.add("ok");
         
         lista.forEach(x->System.out.println(x));
         System.out.println();
         /////
         
         int idx = Math.round((float)Math.random()*(lista.size()-1));
         System.out.println("Random index:"+" "+idx);
         System.out.println();
         lista.remove(idx);
         
         lista.forEach(x->System.out.println(x));
         
         
         
        
     }
}