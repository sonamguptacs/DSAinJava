package javaDSExamples;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DeQueueUsage {
    Deque<Integer> dq=new ArrayDeque<>();

    public void addElement(boolean isFirst,int ele){
        if(isFirst){
            this.dq.add(ele);
        }else{
            this.dq.addLast(ele);
        }
    }

    public int deleteElement(boolean first){
        if(first){
           return this.dq.poll();
        }else{
           return this.dq.removeLast();
        }
    }

    public void printDeque(boolean reverse){
        Iterator itr=reverse?this.dq.descendingIterator() : dq.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next() + " ");
        }
    }

    public int getElement(boolean first){
        if(first){
            return this.dq.peekFirst();
        }else{
            return this.dq.getLast();
        }
    }
}
