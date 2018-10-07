import java.util.Stack;

public class c3q3 {
  static class SetOfStacks {
    Stack[] st;
    int currentIndex;
    int maxValue;
    int currStackLength;

    SetOfStacks(int n, int maxValue) {
      this.st = new Stack[n];
      for(int i =0 ; i < n; i++) {
        st[i] = new Stack();
      }
      currentIndex = 0;
      this.maxValue = maxValue;
    }

    public void push(int value) {
      if (currStackLength == maxValue) {
        currentIndex++;
      }
      st[currentIndex].push(value);
    }
    public Object pop() {
      if (st[currentIndex].empty()) {
        currentIndex--;
        if (currentIndex < 0) {
          throw new IndexOutOfBoundsException();
        }
      }
      return st[currentIndex].pop();
    }
  }

  public static void main(String args[]) {
    SetOfStacks setST = new SetOfStacks(5, 2);

    setST.push(12);
    setST.push(13);
    setST.push(14);
    setST.push(15);
    setST.push(16);

    System.out.println(setST.pop());
    System.out.println(setST.pop());
    System.out.println(setST.pop());
    System.out.println(setST.pop());
    System.out.println(setST.pop());
  }
}
