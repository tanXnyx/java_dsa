public class update {
    public static int updateIthBit(int n , int i, int newb){
    // if(newb == 0)  {
    //     return (n & ~(1<<i));
    // }  
    // else{
    //    return n|(1<<i);
    // }
    n=(n & ~(1<<i));
    int bit = newb<<1;
    return n| bit;

    }
    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
        
    }
    
}
