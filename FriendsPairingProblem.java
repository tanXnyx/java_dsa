public class FriendsPairingProblem {
    public static int FriendsPairingProblem(int n){
        if (n == 1 ||n == 2) return n;
        //choice
        //single
        //pair
        
        return FriendsPairingProblem(n-1) +(n-1)*FriendsPairingProblem(n-2);
    }
    public static void main(String[] args) {
        System.out.println(FriendsPairingProblem(3));
    }
}
