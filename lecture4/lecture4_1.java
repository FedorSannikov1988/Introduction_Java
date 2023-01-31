package lecture4;

import java.util.PriorityQueue;

public class lecture4_1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(10);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        //System.out.println(pq.poll());
        //System.out.println(pq.poll());
        //System.out.println(pq.poll());
    }
}