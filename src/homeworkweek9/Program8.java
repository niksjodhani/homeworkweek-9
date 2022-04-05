package homeworkweek9;

import java.util.HashSet;
import java.util.Set;

public class Program8 {
    public static void main(String[] args) {
        HashSet<Integer>number=new HashSet<>();
       number.add(4);
       number.add(7);
       number.add(8);
        for (int i = 0; i <=10 ; i++) {
            if(number.contains(i)){
                System.out.println(i+"  number is set  between 1 and 10");

            }
        }


    }
}
