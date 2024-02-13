package HMAL22;

import java.util.ArrayList;

public class HMAL22 {
    //HMALzad22
    //Напишете Java програма за отпечатване на всички елементи от array list, използвайки позицията на елементите.
    public static void main(String[] args)  {
        ArrayList<String> arrlist22 = new ArrayList<>(3); 
        arrlist22.add("pink");
        arrlist22.add("green");
        arrlist22.add("blue");
        int i = arrlist22.size();
        int br = 0;
        String element;
        while(br < i){
             element = arrlist22.get(br);
             System.out.println(element);
             br++;
        }
    }
}
