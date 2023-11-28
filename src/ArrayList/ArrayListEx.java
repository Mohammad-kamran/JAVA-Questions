package ArrayList;

import java.util.ArrayList;

public class ArrayListEx {
    public static void main (String[] args){
        //Syntax of arraylist
        ArrayList<Integer> list = new ArrayList<>(10);

        //add stuff to it
        list.add(3782);
        list.add(3722);
        list.add(3782);
        list.add(372433);
        list.add(3785);
        list.add(37862);
        list.add(32);
        list.add(0);
        list.add(378);
        list.add(3782);
        list.add(3782);
        list.add(3782);
        list.add(378);
        list.add(3782);
        list.add(3782);
        list.add(3782);
        list.add(3782);
        list.add(3782);
        //chane
        list.set(0,99);
        list.remove(2);
        System.out.println(list.contains(0));
        System.out.print(list);
    }
}
