import javaDSExamples.DeQueueUsage;
import javaDSExamples.PriorityQueueUsage;
import javaDSExamples.QueueUsage;

import java.util.ArrayList;
import java.util.Arrays;
//import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayList Usage demo
//          javaDSExamples.ArrayListUsage arrayList=new javaDSExamples.ArrayListUsage();
//          arrayList.addItem(100);
//          arrayList.addItem(200);
//          ArrayList<Integer> items=arrayList.getItem(0);
//          arrayList.removeItem(0);
//          arrayList.setItem(4,0);
//          System.out.println(arrayList.isPresent(4));
//          arrayList.printAllLists();

//        Queue Usage Demo
//        QueueUsage queue=new QueueUsage(new ArrayList<>(Arrays.asList(1,2,3)));
//        System.out.println("next Element "+queue.checkNextElement());
//        System.out.println("removed Element "+ queue.removeElement());
//        queue.addElement(5);
//        System.out.println(queue.isEmpty());
//        queue.printQueue();

//        PriorityQueue Usage Demo
//        PriorityQueueUsage queue=new PriorityQueueUsage();
//        queue.addElement(5);
//        queue.addElement(1);
//        queue.addElement(6);
//        queue.printQueue();
//        System.out.println("next Element "+queue.getElement());
//        System.out.println("removed Element "+ queue.deleteElement());
//        System.out.println(queue.isEmpty());

//      DeQueue Usage Demo
        DeQueueUsage deQueue=new DeQueueUsage();
        deQueue.addElement(true,5);
        deQueue.addElement(false,1);
        deQueue.addElement(true,6);
        deQueue.printDeque(false);
        deQueue.printDeque(true);
        System.out.println("next Element "+deQueue.getElement(true)+" " +deQueue.getElement(false));
        System.out.println("removed Element "+ deQueue.deleteElement(true)+" " +deQueue.deleteElement(false));
        deQueue.printDeque(true);
        }
    }
