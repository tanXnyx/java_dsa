public class sumOfNnaturalNumber {
    public static int calcsum(int n){
        if (n==1) return 1;
        return n+calcsum(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Sum of N natural number is "+calcsum(5));
    }
}
// time complex (O)n
// space (O)n