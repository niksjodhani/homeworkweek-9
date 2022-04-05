package homeworkweek9;

import java.util.ArrayList;
import java.util.ListIterator;

public class Program5 {
    public static void main(String[] args) {
        //creating an arraylist
        ArrayList<String>languages=new ArrayList<>();
        languages.add("java");
        languages.add("java script");
        languages.add("python");
        System.out.println("Arraylist : "+languages);

        //creating an instance of listiterator
        ListIterator<String>iterate=languages.listIterator();
        System.out.println("iterating over Arraylist : ");
        while (iterate.hasNext()) {
            System.out.print(iterate.next() + ",");
        }

    }

}
