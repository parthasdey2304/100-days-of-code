public class factorial {
  static int factorial_number(int n) { // this method returns the factorial of a number using recursion
    if(n == 0) {
      return 1;
    }
    else {
      return n * factorial_number(n - 1);
    }
  }
  
  public static void main(String[] args) { // running the main method
    int number = 5;
    int factorial_of_number = factorial_number(number);
    System.out.println("The factorial of the number " + number + " is : " + factorial_of_number);
  }
}
