package HMAL16;

import java.util.ArrayList;
import java.util.List;

public class HMAL16 {
    //HMALzad16
    //Напишете Java програма за копиране на array list в друг array list.
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrlist16 = new ArrayList<>();
        arrlist16.add("pink");
        arrlist16.add("green");
        arrlist16.add("blue");
        ArrayList<String> copyarrlist16 = new ArrayList<>(List.copyOf(arrlist16));
        System.out.println(copyarrlist16.toString());
    }
}
