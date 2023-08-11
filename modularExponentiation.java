
public class modularExponentiation {   
    public static int modularExponentiation(int base, int exponent, int Modular){
        int ans = 1;
        while(exponent > 0 ){
            if((exponent & 1)!= 0 ){// check LSB
                ans *=base ;
            }
            base*=base;//multiply by itself
            exponent >>= 1;
        }
        return ans%Modular;
    }
    public static void main(String[] args) {
        System.out.println("modular Exponentiation: "+ modularExponentiation(2, 3, 5));
    }
}