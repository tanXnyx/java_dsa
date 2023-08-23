public class xToThePowerNinOlogN {
    // public static int xToThePowerNinOlogN(int x,int n){
    //     if (n==0) return 1;
    //     //n/2^l=1 => log(base 2)n =l
    //     if(n%2 !=0)
    //    return x* xToThePowerNinOlogN(x,n/2)*xToThePowerNinOlogN(x,n);
    //     return xToThePowerNinOlogN(x,n/2)*xToThePowerNinOlogN(x,n);
    //    } O(n)
    public static int xToThePowerNinOlogN(int x,int n){
        if (n==0) return 1;
        //n/2^l=1 => log(base 2)n =l
      int  h=xToThePowerNinOlogN(x,n/2)*xToThePowerNinOlogN(x,n/2);
        if(n%2 !=0)
       h= x* h;
        return h;
       }
       public static void main(String[] args) {
        System.out.println("3 to the power of  2 is "+xToThePowerNinOlogN(3 ,2));
       }
       
}
