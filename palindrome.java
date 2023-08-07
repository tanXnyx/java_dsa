public class palindrome {
    public static boolean ispalindrome(String str){
      for (int i = 0; i < str.length()/2; i++) {
        int n = str.length();
        if (str.charAt(i)!= str.charAt(n-i-1)) {
            return false;
        }
      }
      return true;

    }
    public static void main(String[] args) {
        String str ="tat";
        System.out.println("Is the string a Palindrome? " +ispalindrome(str));
    }
}
