public class swapInXOR {
    public static void main(String[] args) {
        int x = 3 , y =4 ;
        System.out.println("before swap x=" + x+ "and y="+ y);
        //swap using XOR operator
        x ^=y;
        y^=x;
        x^=y;//swapping back the values of variables
        System.out.println("\nafter swapping x=" + x +" and y="+ y);
    }
    
}
