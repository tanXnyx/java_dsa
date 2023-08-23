public class tilingProblem {
    public static int tilingProblem(int n){// 2x n(floor size)
if (n==0 || n==1) return 1;
//vertical
int fnm1= tilingProblem( n-1);
// horizontal
int fnm2 = tilingProblem(n-2);
return fnm1+fnm2;
    }
    public static void main(String[] args) {
        System.out.println("Tiling problem: "+tilingProblem(3));
    }
}
//dp 