import java.util.ArrayList;
import java.util.Collections;
public class SortingArrayList {
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();
         list.add(2);
         list.add(5);
         list.add(9);
         list.add(6);
         list.add(8);
        System.out.println(list);
         Collections.sort(list);
        System.out.println(list);
         //descending
          Collections.sort(list, Collections.reverseOrder());
          //comparator - fnx logic
          System.out.println(list);
    }
}
