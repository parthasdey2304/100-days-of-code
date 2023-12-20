public class special_number {
  public static int factorial(int number) { // this method returns the factorial using recursion
    if(number == 0) {
      return 1;
    }

    else {
      return number * factorial(number - 1);
    }
  }
  public static void main(String[] args) {
    int number = 145;
    int sum = 0, copy = number;

    while(number != 0) {
      sum += factorial(number % 10);
      number /= 10;
    }

    System.out.println(
      (sum == copy)? "Special Number" : "Not Special Number"
    );
  }
}
