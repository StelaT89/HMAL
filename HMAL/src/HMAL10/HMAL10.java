package HMAL10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class HMAL10 {
    //HMALzad10
    //Напишете Java програма за разбъркване на елементите в array list.
    public static void main(String[] args) throws Exception {
         ArrayList<String> arrlist10 = new ArrayList<>();
        arrlist10.add("pink");
        arrlist10.add("green");
        arrlist10.add("blue");

        Random r = new Random(); 
  
        for (int i = arrlist10.size() - 1; i >= 1; i--) { 
            Collections.swap(arrlist10, i, r.nextInt(i + 1)); 
        }
        
        System.out.println(arrlist10.toString());
    }
}
