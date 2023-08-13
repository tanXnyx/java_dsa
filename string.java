//strings are immmutable
import java.util.*;
public class string {
    public static void main(String[] args) {
      // implement in 
      char arr[]={'a','b','c'};
      String str ="abc";
      String str2=new String("xyz");
      Arrays.sort(arr);//sorting the array
      //concatenation 
      String s1="Hello";
      String s2="world";
    String x= s1+" "+s2;
    System.out.println("Concatenation:"+x);
      //length
      System.out.println(x.length());
      //charAt
      for(int i=0;i<x.length();i++ ){
        System.out.println(x.charAt(i));
      }
      //compare
      // s1<s2 => -ve
      //s1>s2 => +ve
      //s1=s2 => 0
      if (s1.compareTo(s2)==0){
        System.out.println("Equal");

      }
      else
      System.out.println("not Equal");
      // == fails in if(new String("tony")== new String("tony"))
      //.equals() works fine
      //boolean b = "Tony".equalsIgnoreCase("tonY");==>true
      // sub string
      //Substeing(beg index ,end index) => print beg index to end index-1 
      String a = x.substring(0, 4);
      System.out.println(a);
      //ParseInt Method of Integer class
      String str1 = "123";
      int number = Integer.parseInt(str1);
      System.out.println(number);
      //ToString Method of String class
      int num = 123;
      String s = Integer.toString(num);
      System.out.println(s.length());
    Scanner sc  = new Scanner(System.in);
    System.out.print("\nEnter your name: ");
    String n = "tan nyx";
    // print one word
    n = sc.next();
     // print whole line
    n = sc.nextLine();

    
    

    }
}
