public class IsArraySorted {
    public static boolean IsArraySorted(int arr[],int i){
     if(i == arr.length-1){
        return true;
     }
        if(arr[i] >arr[i+1]){
        return false;
     }
     return IsArraySorted(arr, i+1);
    }
    public static void main(String[] args) {
        int a [] ={234567890,-23456};
        System.out.println("Is Array Sorted : "+IsArraySorted(a , 0));
    }
}
