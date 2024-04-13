import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsage {
    Queue<Integer> queue = new LinkedList<>();

    QueueUsage(ArrayList<Integer> list){
        this.queue.addAll(list);
    }

    void addElement(int element){
        this.queue.add(element);
    }

    int removeElement(){
       return this.queue.remove();
    }

    int checkNextElement(){
        return this.queue.peek();
    }

    boolean isEmpty(){
        return this.queue.size()==0;
    }

    void printQueue(){
        this.queue.stream().forEach(System.out::print);
    }
}
