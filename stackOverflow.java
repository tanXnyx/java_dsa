//If function recursively call itself infinite times then the stack is unable to store large number of local variables used by every function call and will result in overflow of stack.
/**
 * stackOverflow
 */
public class stackOverflow {
    public static void printDec(int n){
       
        System.out.println(n+" ");
        
         if (n==1){
           
            return;
        }
        printDec(n-1);
    }
public static void main(String[] args) {
    int n =-10;
    printDec(n);
}
    
    
}