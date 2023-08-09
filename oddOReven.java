public class oddOReven {
public static void oddOReven(int n){
    int i=1;
    if((n & i)==0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }
}
    public static void main(String[] args) {
    oddOReven(3);
}
    
}