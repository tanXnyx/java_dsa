public class clear {
    public static int clearIthBit(int n , int i){
        return (n & ~(1<<i)); // 0000 000
    }
    public static void main(String[] args) {
        System.out.println("clear it bit");
        System.out.print(clearIthBit(10, 1));
        
    }
}
