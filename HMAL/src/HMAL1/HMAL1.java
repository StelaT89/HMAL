package HMAL1;

import java.util.ArrayList;
import java.util.ListIterator;

public class HMAL1 {
public static void main(String[] args) {
    //HMALzad1
    //Напишете Java програма, която създава array list, добавя някои цветове (низове) и отпечатва колекцията.
    ArrayList<String> arrlist = new ArrayList<>();
    arrlist.add("pink");
    arrlist.add("blue");
    ListIterator<String>  it = arrlist.listIterator();
    while(it.hasNext()){
        String i = it.next();  
        System.out.println(i);
    }
    //zad2
}
}