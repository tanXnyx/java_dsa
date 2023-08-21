/**
 * decereasingOrderFromNtoOne
 */
public class decereasingOrderFromNtoOne {
    public static void printDec(int n){
       
        System.out.println(n+" ");
        
         if (n==1){
           
            return;
        }
        printDec(n-1);
    }
public static void main(String[] args) {
    int n =10;
    printDec(n);
}
    
}
