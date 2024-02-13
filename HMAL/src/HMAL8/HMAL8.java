package HMAL8;

import java.util.ArrayList;
import java.util.Arrays;

public class HMAL8 {
    //HMALzad8
    //Напишете Java програма за сортиране на даден array list.
     public static void main(String[] args)  {
         ArrayList<Integer> arrlist8 = new ArrayList<>(Arrays.asList(5, 7,3,1,6));
         //ListIterator<Integer>  it = arrlist8.listIterator();
         
         arrlist8.sort(null);
          System.out.println(arrlist8.toString());
        }
}
