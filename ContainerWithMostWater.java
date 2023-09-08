import java.util.ArrayList;
public class ContainerWithMostWater {
      //Brute force Approch           TC is Big O of N^2
    //   public static int StoredWater(ArrayList<Integer>height){
    //     int MaxWater = 0;
    //     for (int i = 0; i < height.size(); i++) {
    //         for (int j = i+1; j < height.size() ; j++) {
    //             int ht = Math.min(height.get(i),height.get(j));
    //             int width = j-i;
    //             int CurrentWater = ht * width;
    //             MaxWater = Math.max(MaxWater,CurrentWater);
    //         }
    //     }
    //     return MaxWater;
    // }
    // 2 Pointer Approch 
    public static int StoredWater(ArrayList<Integer>Height){
        int maxwater=0;
        int lp = 0;
        int rp = Height.size()-1;

        while(lp < rp){
            //Calculate area of water
            int ht = Math.min(Height.get(lp),Height.get(rp));
                int width = rp - lp;
                int currentwater = ht * width;
                maxwater = Math.max(maxwater,currentwater);
            //Update Pointer
            if (Height.get(lp) < Height.get(rp)) {
                lp++;
            } else {
                rp--;
            }
        }
        return maxwater;
 }

    public static void main(String[] args) {
        ArrayList<Integer>hight = new ArrayList<>();
        hight.add(1);
        hight.add(8);
        hight.add(6);
        hight.add(2);
        hight.add(5);
        hight.add(4);
        hight.add(8);
        hight.add(3);
        hight.add(7);
        System.out.println(StoredWater(hight));
    }
}
