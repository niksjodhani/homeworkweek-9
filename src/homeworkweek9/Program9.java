package homeworkweek9;

import jdk.nashorn.internal.objects.NativeMath;

import java.util.AbstractMap;
import java.util.HashMap;

import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Program9 {
    public static void main(String[] args) {
        HashMap<String,Integer>people=new HashMap<>();
        people.put("suresh",1);
        people.put("paresh",2);
        people.put("naresh",3);
        people.put("haresh",4);
        people.put("bhuresh",5);

        for (Object element:people.entrySet())
        {
            System.out.println(element+" ");
        }

    }

}

