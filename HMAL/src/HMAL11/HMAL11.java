package HMAL11;

import java.util.ArrayList;
import java.util.Arrays;

public class HMAL11 {
    //HMALzad11
    //Напишете Java програма за обръщане на елементите в array list.
    public static void main(String[] args) {
          ArrayList<Integer> arrlist11 = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6, 7));
        int size = arrlist11.size();
        int last = size - 1;

    
        ArrayList<Integer> reverse = new ArrayList<>(size);

    
    for (int i = last; i >= 0; --i) {
        int element = arrlist11.get(i);
        reverse.add(element);
    }

    System.out.println(reverse.toString());
    }
}
