public class automorphic_number {
  public static void main(String[] args) {
    int number = 25;
    int square = number * number;
    System.out.println(
      ((square + "").endsWith(number + ""))? "Automorphic Number" : "Not Automorphic Number"
    );
  }
}
