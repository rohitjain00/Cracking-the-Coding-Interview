public class c1q7 {

  public static void rotateMatrix(int[][] mat) {
    int N = mat.length;
    for (int x = 0; x < N / 2; x++)
    {
      for (int y = x; y < N-x-1; y++)
      {
        int temp = mat[x][y];
        mat[x][y] = mat[y][N-1-x];
        mat[y][N-1-x] = mat[N-1-x][N-1-y];
        mat[N-1-x][N-1-y] = mat[N-1-y][x];
        mat[N-1-y][x] = temp;
      }
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
      {5, 6, 7, 8},
      {9, 10, 11, 12},
      {13, 14, 15, 16}
    };
    rotateMatrix(mat);
    printArr(mat);
  }
}
