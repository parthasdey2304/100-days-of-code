public class reverse_number {
  static int reverse(int n) { // this returns the reverse of the number using recursion
    if(n == 0) {
      return 0;
    }
    else {
      return reverse(n / 10) * 10 + (n % 10);
    }
  }
  
  public static void main(String[] args) { // main() method running
    int number = 123;
    int reversed_number = reverse(number);
    System.out.println("The reverse of the number " + number + " is : " + reversed_number);
  }
}
