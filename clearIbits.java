public class clearIbits {
    public static int clearIthBits(int n , int i){
        return (n & ((~0)<<i)); // ~0 == -1
    }
    public static void main(String[] args) {
        System.out.println("clear I bits");
        System.out.println(clearIthBits(15, 2));
        
    }
}
