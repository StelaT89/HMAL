package HMAL2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class HMAL2 {
    //HMALzad2
    //Напишете Java програма за обхождане на всички елементи в array list.
     public static void main(String[] args) {
        ArrayList<Integer> arrlist2 = new ArrayList<>(Arrays.asList(1,2,3,5));
     ListIterator<Integer>  it = arrlist2.listIterator();
        while(it.hasNext()){
            Integer i = it.next();  
            System.out.println(i);
        }
         
        for(Integer a : arrlist2){
            System.out.println(a);
            
        }
    }

}
