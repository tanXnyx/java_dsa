import java.util.*;//Built-in Packages

public class packages {
    /*
     * Java Packages & API
A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:
(group of similer types of classes interfaces and sub package)
Built-in Packages (packages from the Java API)
User-defined Packages (create your own packages)

     */
    //Built-in Packages ex
     public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}

class MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}
