import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
          ArrayListUsage arrayList=new ArrayListUsage();
          arrayList.addItem(100);
          arrayList.addItem(200);
          ArrayList<Integer> items=arrayList.getItem(0);
          arrayList.removeItem(0);
          arrayList.setItem(4,0);
          System.out.println(arrayList.isPresent(4));
          arrayList.printAllLists();
        }
    }
