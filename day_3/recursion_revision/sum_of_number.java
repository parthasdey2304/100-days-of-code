public class sum_of_numbers {
  static int sum_till_n(int n) { // this method generates sum of number from 1 to n using recursion
    if(n == 0) {
      return 0;
    }
    else {
      return n + sum_till_n(n - 1);
    }
  }
  
  public static void main(String[] args) { // running main() method
    int number = 10;
    int sum = sum_till_n(number);
    System.out.println("The sum of numbers from 1 to " + number +" is : " + sum);
  }
}
