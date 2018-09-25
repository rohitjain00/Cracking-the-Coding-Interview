import java.util.Scanner;

public class C1q2 {
  private static int maxCharLength = 256;

  public static boolean permutationString(String str1, String str2) {
    int[] charCountArr = new int[maxCharLength];

    if (str1.length() != str2.length()) {
      return false;
    }

    for (char i : str1.toCharArray()) {
      charCountArr[(int) i]++;
    }
    for (char i : str2.toCharArray()) {
      charCountArr[(int) i]--;
    }
    for (int i = 0; i < charCountArr.length; i++) {
      if (charCountArr[i] != 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    if (permutationString(sc.nextLine(),sc.nextLine())) {
      System.out.println("T");
    } else {
      System.out.println("F");
    }
  }
}