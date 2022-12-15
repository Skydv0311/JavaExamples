package commondemos;

public class FindMiddleElementLinkedList {
    class Node {
        int data;
        Node next;
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    public void pushNode(int data)
    {
        Node new_node = new Node(data);
        new_node.next = head;
        head = new_node;
    }

    public void printMiddle()
    {
        if (head != null) {
            int length = getLen();
            Node temp = head;
            int middleLength = length / 2;
            while (middleLength != 0) {
                temp = temp.next;
                middleLength--;
            }
            System.out.print("The middle element is ["
                    + temp.data + "]");
            System.out.println();
        }
    }

    public int getLen()
    {
        int length = 0;
        Node temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        return length;
    }

    public static void main(String[] args) {
        FindMiddleElementLinkedList list = new FindMiddleElementLinkedList();
        for (int i = 5; i >= 1; i--) {
            list.pushNode(i);
        }
        list.printMiddle();
    }
}
