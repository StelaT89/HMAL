package HMAL5;

import java.util.ArrayList;

public class HMAL5 {
    //HMALzad5
    //Напишете Java програма за актуализиране на елемент от array list с даден елемент.
    public static void main(String[] args)  {
        ArrayList<String> arrlist5 = new ArrayList<>();
        arrlist5.add("pink");
        arrlist5.add("green");
        arrlist5.set(0, "blue");
        System.out.println(arrlist5.toString());
    }
}
