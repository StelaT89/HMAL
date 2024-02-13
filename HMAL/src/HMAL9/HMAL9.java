package HMAL9;

import java.util.ArrayList;
import java.util.Arrays;

public class HMAL9 {
    //HMALzad9
    //Напишете Java програма за копиране на един array list в друг.
    public static void main(String[] args)  {
        ArrayList<String> arrlist9 = new ArrayList<>(Arrays.asList("pink", "green"));
 
      
        arrlist9.add("yellow");
        arrlist9.add("blue");
        arrlist9.add("brown");
        arrlist9.add( "gray"   );
 
        ArrayList<String> copyarrlist9 = new ArrayList<>();
 
 
        for (String a : arrlist9 ) {
            copyarrlist9.add(a);
        }
        for (String b : copyarrlist9 ) {
            System.out.println(b);
        }
    }
}
