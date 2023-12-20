public class armstrong_number {
  public static void main(String[] args) {
    int number = 153;
    int length = (number + "").length();
    int sum = 0, copy = number;

    while(number != 0) {
      sum += Math.pow(number % 10, length);
      number /= 10;
    }

    System.out.println(
      (copy == sum)? "Armstrong Number" : "Not Armstrong Number"
    );
  }
}
