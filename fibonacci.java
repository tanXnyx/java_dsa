public class fibonacci {
    public static int fibonacci(int n){
        if (n==0 || (n==1)) return n ;      
return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Fibonaci Series "+fibonacci(5));
// we start from zero term 0     1   1
//                         ^     ^   ^
//                         0th 1th  2nd
// time complex O(2^2)
//space time O(n)
    }
}
