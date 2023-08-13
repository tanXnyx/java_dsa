public class inheritance {
    //inheritance - inheritance is when proprerties & methods of base class are passed on to a derived class
// child class prop of parents
    public static void main(String[] args) throws Exception{
        Fish Shark=new Fish();
        Shark.eat();

        Dog Dog1 = new Dog();
        Dog1.legs=4;
        Dog1.eat();
        System.out.println(Dog1.legs);
        Dog1.color="Brown";
        System.out.println(Dog1.color);
        Dog1.breathe();


    }
        
}
// hybrid
class Animal{
    String color;

    void eat(){
        System.out.println("Animal is eating");         
    }

    void breathe(){
        System.out.println("Animal is breathing through gills and lungs.");       
    }
}

// //Derived class
// class Fish extends Animal{
//     int fins;

//     void Swim(){
//         System.out.println("Fish swims in water");
//     }
// }
// // multi level
// class Mammals extends Animal{
//     int legs;
//     void walk(){
//         System.out.println("Mammal walking on legs ");
//     }
// }

class Dog extends Mammals{
    String Bread;
 //hierarchy
 //2nd parent class

}


class Fish extends Animal{
    int fins;

    void Swim(){
        System.out.println("Fish swims in water");
    }
}

class Mammals extends Animal{
    int legs;
    void walk(){
        System.out.println("Mammal walking on legs ");
    }
}