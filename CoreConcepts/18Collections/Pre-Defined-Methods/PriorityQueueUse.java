import java.util.Queue;
//import java.util.PriorityQueue;
//import java.util.Comparator;

public class PriorityQueueUse {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueueUse<>();
      //  Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());   // reversed pq

        pq.offer(40);
        pq.offer(12);
        pq.offer(24);
        pq.offer(36);

        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
        
    }
}
