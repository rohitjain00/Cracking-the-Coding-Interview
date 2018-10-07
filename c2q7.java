public class c2q7 {

  static class node {
    int value;
    node next;
  }

  static int length(node head) {
    int len = 0;
    while (head.next != null) {
      len++;
      head = head.next;
    }
    return len;
  }


  public static boolean isIntersecting(node head1, node head2) {
    int len1 = length(head1);
    int len2 = length(head2);

    if (len1 > len2) {
      for (int i =0; i < len1-len2; i++) {
        head1 = head1.next;
      }
    } else {
      for (int i =0; i < len2-len1; i++) {
        head2 = head2.next;
      }
    }
  while (head1 .next != null || head2.next != null) {
    if (head1 == head2) {
      return true;
    }

    head1 = head1.next;
    head2 = head2.next;
  }
  return false;
  }

  public static void main(String args[]) {
    node head = new node();
    node secondNode = new node();
    node thirdNode = new node();
    node fourthNode = new node();
    head.next = secondNode;
    secondNode.next = thirdNode;
    thirdNode.next = fourthNode;
    fourthNode.next = null;

    node head1 = new node();
    node secondNode1 = new node();
    head1.next = secondNode1;

    System.out.print(isIntersecting(head,head1));
  }
}
