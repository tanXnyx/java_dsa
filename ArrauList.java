/**
 * ArrauList
 */
import java.util.ArrayList;
public class ArrauList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
          ArrayList<String> list1 = new ArrayList<>();
            ArrayList<Boolean> list2 = new ArrayList<>();
        // O(1)
            list.add(1);
         list.add(2);
          list.add(3);
           list.add(4);
           list.add(3,9);//O(n)
           System.out.println(list);
           // get operater )(1)
         System.out.println( list.get(0));
         System.out.println(list.remove(2));//o(n)
         //         System.out.println("size"+list.size());
         list.set(1, 5);//O(n)
                System.out.println(list.contains(1));//O(n)
      System.out.println("size "+list.size());//not property it is a methord
      
    }
}
