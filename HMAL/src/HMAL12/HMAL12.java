package HMAL12;

import java.util.ArrayList;
import java.util.List;

public class HMAL12 {
    //HMALzad12
    //Напишете Java програма за извличане на част от array list.
    public static void main(String[] args)  {
        ArrayList<String> arrlist12 = new ArrayList<>();
        arrlist12.add("pink");
        arrlist12.add("green");
        arrlist12.add("blue");

        List<String> subList1 = arrlist12.subList(0, 2);
        System.out.println(subList1.toString());
    }
}
