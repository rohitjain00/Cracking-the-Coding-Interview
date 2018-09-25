import java.util.Scanner;

public class c1q4 {

  public static boolean isPalindrome(String str) {
    for (int i = 0, j = str.length(); i < j; i++) {
      if (str.charAt(i) != str.charAt(j-i-1)) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    if (isPalindrome(sc.nextLine())) {
      System.out.println("T");
    } else {
      System.out.println("F");
    }
  }
}
