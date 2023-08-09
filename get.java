public class get {
  public static int getIthBit(int n, int i){
    int a = 1<<i;
    if((n & a)==0){
        return 0 ;
    }
    else{
        return 1;
    }
  }
    public static void main(String[] args) {
        System.out.println(getIthBit(10, 2));
        
    }
}
