package javaDSExamples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {
    Queue<Integer> queue = new LinkedList<>();

    public QueueUsage(ArrayList<Integer> list){
        this.queue.addAll(list);
    }

    public void addElement(int element){
        this.queue.add(element);
    }

   public int removeElement(){
       return this.queue.remove();
    }

    public int checkNextElement(){
        return this.queue.peek();
    }

    public boolean isEmpty(){
        return this.queue.size()==0;
    }

    public void printQueue(){
        this.queue.stream().forEach(System.out::print);
    }
}
