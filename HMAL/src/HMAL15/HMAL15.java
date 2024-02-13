package HMAL15;

import java.util.ArrayList;
import java.util.ListIterator;

public class HMAL15 {
    //HMALzad15
    //Напишете Java програма за обединяване на два array list.
    public static void main(String[] args) throws Exception {
    ArrayList<String> arrlist15 = new ArrayList<>();
        arrlist15.add("pink");
        arrlist15.add("green");
        arrlist15.add("blue");

        ArrayList<String> uniunlist15 = new ArrayList<>();
        arrlist15.add("yellow");
        arrlist15.add("green");
        arrlist15.add("blue");
       
        ArrayList<String> newlist15 = new ArrayList<>(); 
       // ListIterator<String>  it = arrlist15.listIterator();
        for(String a : arrlist15){
            newlist15.add(a);
        }

        for(String a : uniunlist15){
            newlist15.add(a);
        }

        System.out.println(newlist15.toString());
    }
}
