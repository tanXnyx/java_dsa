/*
 * SUP
 */
public class supers {
    
        public static void main(String[] args){
            Horse h = new Horse();
           
        }
    }
    
class animal {
 animal(){
     System.out.println("Animal Constructor is called");
           }
 }
    
class Horse extends animal {
            Horse(){
                    super();
                System.out.println("Horse Constructor is called ");
}

}
