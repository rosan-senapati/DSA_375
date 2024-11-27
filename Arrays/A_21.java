import java.util.*;
public class A_21 {
    public static void main(String[] args) {
        //K-th Largest Element(Priority Queue)
        int arr [] = {3,2,1,5,6,4}, k =2;
        PriorityQueue pq = new PriorityQueue<>(k+1);

        for(int i: arr)
        {
            pq.add(i);
            if(pq.size()>k)
               pq.poll();
        }


        System.out.println("Kth Largest Element is: "+pq.poll());
    }
}
