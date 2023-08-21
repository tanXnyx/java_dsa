/*
 * recursion is a meathod of solving aa comptational problem where the sol depends on sol to smaller instances of the same problem
 * Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.
 */
public class introRecursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
      }
      public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
      }
}
