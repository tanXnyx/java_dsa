public class BinaryStringsProblem {
   //print all binary string of size N without consecutive One 
   public static void printBinString(int n, int lastplace, String str){
      // if (lastplace == 0){
      //    // sit 0 on chair n
      //    printBinString(n-1, 0, str.append("0"));
      //    printBinString(n-1, 0, str.append("1"));
      // }
      // else{
      //     printBinString(n-1, 0, str.append("0"));
      // }
      if(n ==0){
         System.out.println(str);
                  return;
      }
      printBinString(n-1, 0, str+"0");
       if (lastplace == 0){
                 printBinString(n - 1 ,  0, str + "1" );
       }
       
   }
   public static void main(String[] args) {
          printBinString(3,0,"");
   }
}
