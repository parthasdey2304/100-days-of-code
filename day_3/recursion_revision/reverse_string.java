public class reverse_string {
  public static String reverse(String st) { // this method returns the reverse of the string using recursion
    if(st.isEmpty() || st.length() == 1) {
      return st;
    }

    else {
      return reverse(st.substring(1)) + st.charAt(0);
    }
  }
  
  public static void main(String[] args) { // running the main method
    String st = "partha";
    String reverse = reverse(st);
    System.out.println("The reverse of the string " + st + " is : " + reverse);
  }
}
