package LabProgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Comparator;
public class Prog10 {
    public static void main(String[] args) {
        ArrayList<String> lang=new ArrayList<String>();
        lang.add("Java");
        lang.add("Python");
        lang.add("Swift");
        lang.add("C");
        System.out.println("The Array Lists are: "+lang);

        //showing index value
        String str=lang.get(1);
        System.out.println("The value at Index pos 1 is: "+str);

        //change the element
        lang.set(2,"JavaScript");
        System.out.println("The Modified Array Lists are: "+lang);

        //remove the element
        str=lang.remove(3);
        System.out.println("The Updated List is: "+lang);
        System.out.println("The element tht is removed: "+str);

        //iterator
        System.out.println("Accessing the iterator");
        Iterator itr=lang.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //size
        System.out.println("The size of the list: "+lang.size());

        //sort
        lang.sort(Comparator.naturalOrder());
        System.out.println("Sorted Array list: "+lang);
        }
}
