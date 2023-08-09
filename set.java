public class set {
   public static int setItBit(int n , int i){
    int a = 1<<i;
    return (n|a);
   }
    public static void main(String[] args) {
        System.out.println(setItBit(10, 2));
    }
}
