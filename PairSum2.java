import java.util.ArrayList;
public class PairSum2{
    public static boolean PairSum2(ArrayList<Integer> list, int target){
        //brute force 
         // for(int i=0; i<list.size(); i++){
         //     for (int j=i+1; j<list.size();j++){
         //         if(list.get(i)+ list.get(j) == target){
         //             return true;
         //         }
         //     }
         // }
         // return false;
         // 2 pointer
         int bp = -1;
         int n= list.size();
         for(int i=0; i<list.size(); i++){
            if(list.get(i)> list.get(i+1)){
                bp= i;
                break;
            }
         }
         int lp= bp+1;
         int rp =bp;
         while (lp != rp){
            if (list.get(rp)+list.get(lp) == target) {
                return true;
            }
            //case 2 
            if (list.get(rp)+list.get(lp) < target) {
                lp = (lp+1) % n;
            } else {
            //case 3
                rp = (n + rp - 1) % n;
            }

         }
         return false;
         }
    public static void main(String[] args) {
         ArrayList<Integer> list = new ArrayList<>();  
       list.add(11); 
       list.add(15); 
       list.add(6); 
       list.add(8); 
        list.add(9); 
        list.add(10);   
        int target = 16;
      
        System.out.println(PairSum2(list, target));

    }
}
