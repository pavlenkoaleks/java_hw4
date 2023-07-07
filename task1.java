import java.util.Random;
import java.util.Collections;
import java.util.LinkedList;
public class task1 {
   
    public static void main(String[] args) {
        Random rand = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(rand.nextInt(1000));
           }
         System.out.println(list);
       Collections.reverse(list); 
       System.out.println(list);

      
    }
}