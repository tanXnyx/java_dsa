import java.util.*;
public class twodarray {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("row");
      int r= sc.nextInt();
      System.out.println("col");
      int c = sc.nextInt();
      int[][] arr1 =new int[r][c];
      for (int i=0;i<r ;++i){
        for (int j= 0;j < c;++j ){
             System.out.println("enter value");
         arr1[i][j]= sc.nextInt();
        }
      }
      for (int i=0;i<r ;++i){
        for (int j= 0;j < c;++j ){
         System.out.print(arr1[i][j]);
          System.out.print(" ");
        }
         System.out.println("");
      }
    }
}
