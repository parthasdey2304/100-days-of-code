public class prime_check {
  public static void main(String[] args) {
    int number = 19;
    int counter = 0;

    for(int i = 1; i <= number; i++) {
      counter += ((number % i) == 0)? 1 : 0;
    }

    System.out.println(
      (counter == 2)? "Prime Number" : "Not Prime Number"
    );
  }
}
