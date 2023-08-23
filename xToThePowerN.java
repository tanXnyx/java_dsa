public class xToThePowerN {
    public static int xToThePowerN(int x, int n){
        if (n == 0) return 1;
        return x *xToThePowerN(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(xToThePowerN(2,10));
    }
}
// time complex O(n)