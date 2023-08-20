/**
 * countCharacters
 * to display name
of a person, count the no. of characters present in the name of the person.
 */
interface DetailInfo 
{
    void display();
    int count();
}
class Person implements DetailInfo 
{
    static int maxcount = 15;
    String name;
    public Person(String name)
    {
        this.name = name;
    }
    public void display() 
    {
        System.out.println("Name: " + name);
    }
    public int count() 
    {
        return name.length();
    }
}
public class countCharacters {

    public static void main(String[] args) 
    {
        Person p = new Person("Ansuman");
        p.display();
        int count=p.count();
        System.out.println("Name length: " + count);
    }
}