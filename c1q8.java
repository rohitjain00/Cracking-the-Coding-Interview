import java.util.ArrayList;
import java.util.LinkedList;

public class c1q8 {

  public static void setRowCol(int[][] mat,Integer i, Integer j) {
    for (int k = 0; k < mat.length;k++) {
      mat[k][j] = 0;
    }
    for (int k = 0; k < mat[0].length;k++) {
      mat[i][k] = 0;
    }
  }

  public static void setZero(int[][] mat) {
    ArrayList<Integer> x = new ArrayList<>();
    ArrayList<Integer> y = new ArrayList<>();
    for (int i = 0; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 0) {
          x.add(i);
          y.add(j);
        }
      }
    }
    for (int i = 0; i < x.size(); i++) {
      setRowCol(mat,x.get(i),y.get(i));
    }
  }

  public static void printArr(int[][] mat) {

    for (int i = 0 ; i < mat.length; i++) {
      for (int j = 0; j < mat[0].length; j++) {
        System.out.print(mat[i][j] + " ");
      }
      System.out.println();
    }
  }
  public static void main(String args[]) {
    int[][] mat =
        {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

    setZero(mat);
    printArr(mat);

  }
}
