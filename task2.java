import java.util.LinkedList;
import java.util.Random;
public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
        enqueue(list, rand.nextInt(1000)); 
        }
        System.out.println(list);

        System.out.println(dequeue(list)); 
        System.out.println(list);

        System.out.println(first(list)); 
        System.out.println(list); 
    }

    static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    static int dequeue(LinkedList<Integer> list) { 
        int num = list.get(0);
        list.remove(0);
        return num;
    }

    static int first(LinkedList<Integer> list) { 
        int num = list.get(0);
        return num;
    }

    
}
