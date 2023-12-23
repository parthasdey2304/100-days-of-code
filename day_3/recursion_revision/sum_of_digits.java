public class sum_of_digits {
  static int sum_of_digits_recursion(int n) { //  this is the method that returns the sum of the digits of a number using recursion
    if(n == 0) {
      return 0;
    }
    else {
      return (n % 10) + sum_of_digits_recursion(n / 10);
    }
  }
  
  public static void main(String[] args) { // running the main() method
    int number = 123;
    int sum = sum_of_digits_recursion(number);
    System.out.println("The sum of the digits of the number : " + number + " is  : "  + sum);
  }
}
