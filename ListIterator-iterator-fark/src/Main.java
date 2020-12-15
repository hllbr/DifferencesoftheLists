
import java.util.ArrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class Main {
    
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        
        set.add("java");
        set.add("Python");
        set.add("C++");
        set.add("Go");
        
        List<String> list = new ArrayList<String>();
        
        list.add("JAVA");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
        Iterator<String> ıterator = set.iterator();
        
        ListIterator<String> iterator =list.listIterator();
        
         while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
         System.out.println("--------------------------------------");
         while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
         System.out.println("--------------------------------------");
         while(iterator.hasNext()){
             String value = iterator.next();
             if(value.equals("Go")){
                 iterator.remove();
             }
             System.out.println("*******************************************");
             for(String s: list){
                 System.out.println(s);
             }
         }
    }
    
}
 /*
    ListIterator
    
    Sadece List Interface'i implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır. 
    Ekstradan add() metodu bulunur.
    
    Iterator: 
    
    Set , Queue ve List Interface'i implement'e eden classlarda kullanılabilir.
    previous() metodu yoktur.
    
    */