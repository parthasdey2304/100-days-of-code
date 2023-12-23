public class counting_number_of_digits {
  static int count(int n) { // this method returns the number of digits of a number using recursion
    if(n == 0) {
      return 0;
    }
    else {
      return count(n / 10) + 1;
    }
  }
  
  public static void main(String[] args) { // main() method running
    int number = 12355;
    int length = count(number);
    System.out.println("The length of the number is : " + length);
  }
}
