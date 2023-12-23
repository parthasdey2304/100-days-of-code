public class raised_to_power {
  static int base_raised_to_power(int base, int power) { // this method returns a number raised to a power using recursion
    if(power == 0) {
      return 1;
    }
    else {
      return base * base_raised_to_power(base, power - 1);
    }
  }
  
  public static void main(String[] args) { // running the main method
    int base = 5;
    int power = 3;
    int raised = base_raised_to_power(base, power);
    System.out.println("The number " + base + " raised to the power " + power + " is : " + raised);
  }
}
