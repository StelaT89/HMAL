package HMAL19;

import java.util.ArrayList;

public class HMAL19 {
    //HMALzad19
    //Напишете Java програма за намаляване на капацитета на array list.
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrlist19 = new ArrayList<>();
        arrlist19.ensureCapacity(20); 
        int s19 =  arrlist19.size();
        System.out.println(s19);
        arrlist19.add("pink");
        arrlist19.add("green");
        arrlist19.add("blue");
        arrlist19.trimToSize();
        int s =  arrlist19.size();
        System.out.println(s);
    }
}
