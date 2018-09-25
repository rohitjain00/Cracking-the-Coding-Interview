import java.util.Scanner;

public class c1q6 {

  public static String compressString(String str) {
    char[] strArr = str.toCharArray();
    String compressedString = "";

    for (int i = 0; i < strArr.length; i++) {
      compressedString += strArr[i];
      int j = i;
      while (i + 1 < strArr.length && strArr[i + 1] == strArr[j]) {
        i++;
      }
      compressedString += (i - j + 1) + "";
    }

    if (compressedString.length() > str.length()) {
      return str;
    } else {
      return compressedString;
    }
    }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.println(compressString(sc.nextLine()));
  }
}
