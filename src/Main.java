import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        ArrayList Usage demo
//          ArrayListUsage arrayList=new ArrayListUsage();
//          arrayList.addItem(100);
//          arrayList.addItem(200);
//          ArrayList<Integer> items=arrayList.getItem(0);
//          arrayList.removeItem(0);
//          arrayList.setItem(4,0);
//          System.out.println(arrayList.isPresent(4));
//          arrayList.printAllLists();

//        Queue Usage Demo
        QueueUsage queue=new QueueUsage(new ArrayList<>(Arrays.asList(1,2,3)));
        System.out.println("next Element "+queue.checkNextElement());
        System.out.println("removed Element "+ queue.removeElement());
        queue.addElement(5);
        System.out.println(queue.isEmpty());
        queue.printQueue();
        }
    }
