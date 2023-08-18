/**
 * Exception
 * In Java, exception is an event that occurs during the execution of a program and disrupts the normal flow of the program's instructions.
 *  Bugs or errors that we don't want and restrict our program's normal execution of code are referred to as exceptions.
 *  In this section, we will focus on the types of exceptions in Java and the differences between the two.
 * 
 * Built-in Exceptions
  ---Checked Exception
 ----Unchecked Exception

*User-Defined Exceptions
 */
import java.io.*; 
import java.util.*;   
// class CheckedExceptionExample {  
//     public static void main(String args[]) { //CheckedExceptionExample.java 
//         FileInputStream file_data = null;  
//         file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");  
//         int m;  
//         while(( m = file_data.read() ) != -1) {  
//             System.out.print((char)m);  
//         }  
//         file_data.close();  
//     }  
// }  
//Unchecked Exceptions
class UncheckedExceptionExample1 {    
   public static void main(String args[])  
   {  
    int positive = 35;  
    int zero = 0;  
    int result = positive/zero;  
    //Give Unchecked Exception here.   
System.out.println(result);  
   }  
}  
/*
 * User-defined Exception
In Java, we already have some built-in exception classes like ArrayIndexOutOfBoundsException, NullPointerException, and ArithmeticException. 
These exceptions are restricted to trigger on some predefined conditions. In Java, we can write our own exception class by extends the Exception class.
 We can throw our own exception on a particular condition using the throw keyword. 
For creating a user-defined exception, we should have basic knowledge of the try-catch block and throw keyword.

Let's write a Java program and create user-defined exception
 */
class UserDefinedException{  
    public static void main(String args[]){  
        try{  
            throw new NewException(5);  
        }  
        catch(NewException ex){  
            System.out.println(ex) ;  
        }  
    }  
}  
class NewException extends Exception{  
    int x;  
    NewException(int y) {  
        x=y;  
    }  
    public String toString(){  
        return ("Exception value =  "+x) ;  
    }  
}  