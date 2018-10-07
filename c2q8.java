
public class c2q8 {
  static class node {
    int value;
    node next;
  }
  public static boolean hasLoop (node head) {
    node temp1 = head;
    node temp2 = head.next;

    while (temp1 != temp2) {
      if ((temp1.next == null || temp2.next == null) || (temp2.next.next == null)) {
        return false;
      }
      temp1 = temp1.next;
      temp2 = temp2.next.next;


    }
    return true;
  }

  public static void main(String args[]) {
    node head = new node();
    node secondNode = new node();
    node thirdNode = new node();
    node fourthNode = new node();
    node fifthNode = new node();
    node sixNode = new node();

    head.next = secondNode;
    secondNode.next = thirdNode;
    thirdNode.next = fourthNode;
    fourthNode.next = fifthNode;
    fifthNode.next = sixNode;
    sixNode.next = null;


    System.out.print(hasLoop(head));
  }
}
