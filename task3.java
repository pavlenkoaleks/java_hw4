import java.util.LinkedList;
import java.util.Random;
import java.util.Iterator;

public class task3 {
    public static void main(String[] args) {
       LinkedList<Integer> list = new LinkedList<>();
       Random rand = new Random();
        for (int i = 0; i < 5; i++) {
        list.add(rand.nextInt(50));
        }
        System.out.println(list);
        Iterator<Integer> iterator = list.iterator();
        int sum = 0;
        while (iterator.hasNext()){
             sum += iterator.next();
        }
      System.out.println(sum);
    }
}
