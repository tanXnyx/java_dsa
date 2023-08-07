public class largeststring {
    public static void main(String[] args) {
       String fruit[]={"apple","mango","banana"};
       String largest = fruit[0];
       for (int i=1;i<fruit.length ;++i){
        if  ((largest).compareToIgnoreCase((fruit[i])) <  0 ){
            largest=(fruit[i]);
        }
       }
       System.out.println("The Largest string is "+largest);
    }
}
