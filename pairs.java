public class pairs {
    public static void pairs(int numbers[]){
        int tp=0;
        for ( int i=0; i<numbers.length; i++){
            int curr = numbers[i];
            for (int j = i+1; j< numbers.length;j++){
                System.out.print("("+ curr+","+ numbers[j]+")");
                tp++;
            }
            System.out.println();
        }
        System.out.println(tp);//tp= (n(n-1))/2
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14};
        pairs(numbers);
    }
    
}
