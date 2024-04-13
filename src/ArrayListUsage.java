import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListUsage {
    ArrayList<Integer> list1=new ArrayList<>();
    ArrayList<Integer> list2=new ArrayList<>(10);
    ArrayList<Integer> arr=new ArrayList<>(Collections.nCopies(10,0));

    void addItem(int item){
        list1.add(item);
        list2.add(item);
        arr.add(item);
    }

    ArrayList<Integer> getItem(int index){
        int num1=list1.get(index);
        int num2=list2.get(index);
        int num3=arr.get(index);
        return new ArrayList<Integer>(Arrays.asList(num1,num2,num3));
    }

    void removeItem(int index){
        list1.remove(index);
        list2.remove(index);
        arr.remove(index);
    }

    void setItem(int item,int index){
        list1.set(index,item);
        list2.set(index,item);
        arr.set(index,item);
    }

    ArrayList<Integer> getSize(){
       return new ArrayList<Integer>(Arrays.asList(list1.size(),list2.size(),arr.size()));
    }

    void clearList(){
        list1.clear();
        list2.clear();
        arr.clear();
    }

    boolean isPresent(int key){
        return list1.contains(key);
    }

    void printAllLists(){
        System.out.println("list1");
        list1.stream().forEach(System.out::print);
        System.out.println("\nlist2");
        list2.stream().forEach(System.out::print);
        System.out.println("\n" +
                "" +
                "list3");
        arr.stream().forEach(System.out::print);
    }
}
