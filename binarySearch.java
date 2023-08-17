public class binarySearch {
    public static int binarySearch(int numbers[], int key){
       int start =0, end = numbers.length-1;
       while (start<=end){
        //find the middle index of array
        int mid =(start+end)/2 ;
        if ((numbers[mid] ==key)){
            return  mid;
        }
        else if((numbers[mid] <key)){
            start= mid +1;//search in right side
        }
        else{
            end = mid -1;// search left side
            }
       }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8,10,12,14};
        int key =10;
        System.out.println("index is "+binarySearch(numbers , key));
    }
}
// time comp log(base 2) n