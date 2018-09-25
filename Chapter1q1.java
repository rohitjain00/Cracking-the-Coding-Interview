import java.util.Scanner;

public class Chapter1q1 {

  private static int maxCharLength = 256;

  public static boolean duplicateChar(String str) {
    int[] charCountArr = new int[maxCharLength];

    for (char i : str.toCharArray()) {
      if (charCountArr[(int) i] != 0) {
        return false;
      }
      charCountArr[(int) i]++;
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    if (duplicateChar(sc.nextLine())) {
      System.out.println("No duplicate Char");
    } else {
      System.out.println("Duplicate");
    }
  }
}
