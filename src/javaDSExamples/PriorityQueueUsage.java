package javaDSExamples;

import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueUsage {
    PriorityQueue<Integer> pq=new PriorityQueue<>();

    public void addElement(int el) {
        this.pq.add(el);
    }

    public int getElement(){
        return this.pq.peek();
    }

    public int deleteElement(){
        return this.pq.poll();
    }

    public void printQueue(){
        Iterator iterator=this.pq.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next() +" ");
        }
    }

    public boolean isEmpty() {
        return this.pq.size() == 0;
    }
}
