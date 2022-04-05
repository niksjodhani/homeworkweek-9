package homeworkweek9;

import java.util.ArrayList;
import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        //creating an empty integer arraylist
        ArrayList<Integer> arr = new ArrayList<>(10);
        boolean ans = arr.isEmpty();
        if (ans = arr.isEmpty()) {
            System.out.println("the arraylist is empty");
        } else {
            System.out.println("the Arraylist is not Empty");
        }
        //Adition of element to the arraylist
        arr.add(8);

        ans = arr.isEmpty();
        if (ans == true) {
            System.out.println("arraylist is empty");
        } else {
            System.out.println("arraylist is  not empty");
        }
    }
}
