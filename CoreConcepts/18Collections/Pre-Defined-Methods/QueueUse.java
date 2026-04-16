import java.util.LinkedList;
import java.util.Queue;

public class QueueUse {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);  // add
        queue.offer(24);
        queue.offer(36);

        System.out.println(queue);

        System.out.println(queue.poll());  // out

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}


/*

The Queue interface includes all the methods of the Collection interface. It is because Collection is super interfce of Queue.

Some of the commonly used methods of the Queue interface are : 
- add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.

- offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.

- element() - Returns the head of the queue. Throws an exception if the queue is empty.

- peek() - Returns the head of the queue. Returns null if the queue is empty.

- remove() - Returns and remove the head of the queue. Throws an exception if the queue is empty.

- poll() - Returns and remove the head of the queue. Returns null if queue is empty.

*/