public class fibonacci_series {
  static int fibonacci(int n) { // this method returns the nth term of the fibonacci series
    if(n <= 1) {
      return n;
    }
    else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
  
  public static void main(String[] args) { // running the main method
    System.out.println("The Fibonacci series is : ");
    for(int i = 0; i <= 10; i++) {
      System.out.print(fibonacci(i) + ", ");
    }
  }
}
