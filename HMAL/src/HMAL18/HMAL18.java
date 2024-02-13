package HMAL18;

import java.util.ArrayList;

public class HMAL18 {
    //HMALzad18
    //Напишете Java програма за проверка дали array list е празен или не.
    public static void main(String[] args) {
        ArrayList<String> arrlist18 = new ArrayList<>();
        arrlist18.add("pink");
        arrlist18.add("green");
        arrlist18.add("blue");
        if(arrlist18.isEmpty()){
            System.out.println(arrlist18.isEmpty());
        }else{
            System.out.println(!(!arrlist18.isEmpty()));
        }

    }
}
