public class checkPowerOfTwo {
    // if n is 2 to the power x (because n has single one ex
    // n=16 = 100000,
    //n-1 = 15 = 011111 )
    //then n & (n-1)=0
    public static boolean checkPowerOfTwo(int n){
     return (n&(n-1)) == 0;   
    }
    public static void main(String[] args) {
        System.out.println(checkPowerOfTwo(15));
    }
}
