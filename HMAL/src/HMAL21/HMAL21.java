package HMAL21;

import java.util.ArrayList;

public class HMAL21 {
    //HMALzad21
    //Напишете Java програма за замяна на втория елемент от array list с определен елемент.
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrlist21 = new ArrayList<>(3); 
        arrlist21.add("pink");
        arrlist21.add("green");
        arrlist21.add("blue");
        arrlist21.set(1, "white");
        System.out.println(arrlist21.get(1));
    }
}
