package homeworkweek9;

import java.util.ArrayList;

public class Program_4 {
    public static void main(String[] args) {


        // carlist
        ArrayList<String> colorlist = new ArrayList();
        colorlist.add("orange");
        colorlist.add("red");
        colorlist.add("blue");
        colorlist.add("black");
        colorlist.add("red");
        colorlist.add("white");
        colorlist.add("silver");
        colorlist.add("coffy");
        colorlist.add("green");
        colorlist.add("maroon");
        System.out.println("all collection of color ");

        //iteration
        for (String collection : colorlist) {

            System.out.println(collection);

        }
    }
}