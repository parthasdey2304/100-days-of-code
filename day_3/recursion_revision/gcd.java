public class gcd {
  static int gcd_of_two(int dividend, int divisor) {
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
    System.out.printf("The GCD of the two numbers %d and %d is : %d.\n", a, b, gcd);
  }
}
