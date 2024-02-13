package HMAL17;

import java.util.ArrayList;

public class HMAL17 {
    //HMALzad17
    //Напишете Java програма за изпразване на array list.

    public static void main(String[] args)  {
         ArrayList<String> arrlist17 = new ArrayList<>();
        arrlist17.add("pink");
        arrlist17.add("green");
        arrlist17.add("blue");
        arrlist17.removeAll(arrlist17);
        System.out.println(arrlist17);
    }
}
