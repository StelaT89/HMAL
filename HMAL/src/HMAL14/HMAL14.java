package HMAL14;

import java.util.ArrayList;
import java.util.Collections;

public class HMAL14 {
    //HMALzad14
    //Напишете Java програма, която разменя два елемента в array list.
    public static void main(String[] args) {
        ArrayList<String> arrlist14 = new ArrayList<>();
        arrlist14.add("pink");
        arrlist14.add("green");
        arrlist14.add("blue");
        Collections.swap(arrlist14, 1, 2);
        System.out.println(arrlist14.toString());
    }
}
