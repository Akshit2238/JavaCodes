import java.util.PriorityQueue;
public class QueueExample {
    public static void main(String args[]) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Amit");
        queue.add("Vijay");
        System.out.println(queue.peek());
    }
}
