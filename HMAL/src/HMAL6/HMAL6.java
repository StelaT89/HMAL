package HMAL6;

import java.util.ArrayList;

public class HMAL6 {
    //HMALzad6
    //Напишете Java програма за премахване на третия елемент от array list.
    public static void main(String[] args){
         ArrayList<String> arrlist6 = new ArrayList<>();
        arrlist6.add("pink");
        arrlist6.add("green");
        arrlist6.add("blue");
        arrlist6.remove(2);
        System.out.println(arrlist6.toString());
    }
}
