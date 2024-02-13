package HMAL13;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class HMAL13 {
     //HMALzad13
    //Напишете Java програма за сравняване на два array list-а.
    public static void main(String[] args)  {
        //zad13
        ArrayList<String> arrlist13 = new ArrayList<>();
        arrlist13.add("pink");
        arrlist13.add("green");
        arrlist13.add("blue");

        ArrayList<String> comparelist13 = new ArrayList<>();
        comparelist13.add("yellow");
        comparelist13.add("green");
        comparelist13.add("blue");
        System.out.print("Common elements: " + arrlist13.stream().filter(comparelist13::contains).collect(Collectors.toList()));   
    }
}
