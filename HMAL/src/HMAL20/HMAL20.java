package HMAL20;

import java.util.ArrayList;

public class HMAL20 {
    //HMALzad20
    //Напишете Java програма за увеличаване на размера на array list.
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrlist20 = new ArrayList<>(3); 
        arrlist20.add("pink");
        arrlist20.add("green");
        arrlist20.add("blue");
        arrlist20.ensureCapacity(20); 

    }
}
