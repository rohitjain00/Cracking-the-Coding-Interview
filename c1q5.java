import java.util.Scanner;

public class c1q5 {
  public static int maxCharLength = 256;

  public static boolean OneAway(String str1, String str2) {
    int[] charCountArr = new int[maxCharLength];
    int edits = 1;

    for (char i : str1.toCharArray()) {
      charCountArr[(int) i]++;
    }
    for (char i : str2.toCharArray()) {
      charCountArr[(int) i]--;
    }
    for (int i = 0; i < charCountArr.length; i++) {
      if (charCountArr[i] != 0) {
        edits--;
        if (edits < 0) {
          return false;
        }
      }
    }
    return true;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    if (OneAway(sc.nextLine(),sc.nextLine())) {
      System.out.println("T");
    } else {
      System.out.println("F");
    }

  }
}
