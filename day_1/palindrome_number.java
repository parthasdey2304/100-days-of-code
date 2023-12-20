public class palindrome_number {
  public static void main(String[] args) {
    int number = 121; // number to be checked
    int reverse = 0, copy = number; 

    while(number != 0) { // reversing the number using while loop
      reverse = reverse * 10 + number % 10;
      number /= 10;
    }

    System.out.println(
      (reverse == copy)? "Palindrome number" : "Not Palindrome number"
    );
  }
}
