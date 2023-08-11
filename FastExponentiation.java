public class FastExponentiation {
    // a pow n = a*a*a....(n times)
    // time complex is O(n)
// in binary form 
// tip- ex 3 to pow 101(5)
//     1      0         1
//     ^      ^         ^
// a pow 4  a pow 2    a pow 1
// cal (1 * (a pow 4)) *1 * (1*(a pow 1))
//                      ^
//            (only one because of zero)
public static int fastPow(int base, int exponent){
    int ans = 1;
    while(exponent > 0 ){
        if((exponent & 1)!= 0 ){// check LSB
            ans *=base ;
        }
        base*=base;//multiply by itself
        exponent >>= 1;
    }
    return ans;
}
public static void main(String[] args) {
    System.out.println("fastpow");
    System.out.println(fastPow(3, 5));
}
}