package HMAL3;

import java.util.ArrayList;
import java.util.Arrays;

public class HMAL3 {
    //HMALzad3
    //Напишете Java програма за вмъкване на елемент в array list на първа позиция.
    public static void main(String[] args) {

        ArrayList<Integer> arrlist3 = new ArrayList<>(Arrays.asList(1,2,3,5));
        arrlist3.add(0 , 2);
        System.out.println(arrlist3.toString());
    }
}
