public class gcd_and_lcm {
  static int gcd_of_two(int dividend, int divisor) { // this method return the GCD of two numbers using recursion
    if(divisor == 0) {
      return dividend;
    }
    else {
     return gcd_of_two(divisor, dividend % divisor); 
    }
  }
  
  public static void main(String[] args) {
    int a = 17;
    int b = 5;
    int gcd = gcd_of_two(a, b);
    int lcm = (a * b) / gcd;
    System.out.printf("The GCD and LCM of the two numbers %d and %d is : %d and %d respectively.\n", a, b, gcd, lcm);
  }
}
