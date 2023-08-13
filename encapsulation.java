/*
 * encapsulation
 *  encapsulation is defined as the wapping up of data & method under a single unit. it also implements data hiding
 */
public class encapsulation {
    public static void main(String args[]){
        Student s = new Student();
        Student s1 = new Student("Subha",5);
        System.out.println("Name: "+s1.name);
        System.out.println("Roll No.: " + s1.roll );
        Student s2 = new Student(12);

        Student s3 = new Student();
        s3.name="ABC";
        s3.password="<PASSWORD>";
        s3.roll=156;
        s3.marks[0]=100;
        s3.marks[1]=96;
        s3.marks[2]=97;

        Student s4 = new Student(s3);//copy
        s4.password="Mu Password";
        for(int i=0 ;i< 3;++i ){
            System.out.println(s4.marks[i]);
            }
            System.out.println("PASSWORD: "+s4.password);
    }
    /*
     * type of constructors(3)
     * Non-Parameterized Constructors
     * Parameterized Constructors
     * Copy Constructors
     */
}
    class Student{
        String name;
        int roll;
        String password;
        int marks[];

        //Non-Parameterized Constructors
        Student(){
            marks = new int[3];
            System.out.println("Constructer is called");
       }

       //Parameterized Constructors
       Student(String name,int roll){
            this.roll=roll;
            this.name=name;
            marks = new int[3];

       }
       Student(int roll){
            this.roll=roll;
            marks = new int[3];

       }
       //shallow Copy Constructors
    //    Student(Student s3){
    //     marks = new int[3];
    //     this.roll=s3.roll;
    //     this.name=s3.name;
    //     this.marks=s3.marks;
    //    }
    //deep copy constructor
       Student(Student s3){
        marks = new int[3];
        this.roll=s3.roll;
        this.name=s3.name;
        for (int i=0 ;i< marks.length; i++ ) {
            this.marks [i]=s3.marks[i] ;
}


    //When multiple Constructors with same name are created its called Constructors Overloading 
}/*A lazy copy can be defined as a combination of both shallow copy and deep copy. The mechanism follows a simple approach – at the initial state, shallow copy approach is used. A counter is also used to keep a track on how many objects share the data. When the program wants to modify the original object, it checks whether the object is shared or not. If the object is shared, then the deep copy mechanism is initiated.
 */
    }